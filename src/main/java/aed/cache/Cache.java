
package aed.cache;

import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;


public class Cache<Key,Value> {


  // Tamano de la cache
  private int maxCacheSize;

  // NO MODIFICA ESTOS ATTRIBUTOS, NI CAMBIA SUS NOMBRES: mainMemory, cacheContents, keyListLRU

  // Para acceder a la memoria M
  private Storage<Key,Value> mainMemory;
  // Un 'map' que asocia una clave con un ``CacheCell''
  private Map<Key,CacheCell<Key,Value>> cacheContents;
  // Una PositionList que guarda las claves en orden de
  // uso -- la clave mas recientemente usado sera el keyListLRU.first()
  private PositionList<Key> keyListLRU;



  // Constructor de la cache. Especifica el tamano maximo 
  // y la memoria que se va a utilizar
  public Cache(int maxCacheSize, Storage<Key,Value> mainMemory) {
    this.maxCacheSize = maxCacheSize;

    // NO CAMBIA
    this.mainMemory = mainMemory;
    this.cacheContents = new HashTableMap<Key,CacheCell<Key,Value>>();
    this.keyListLRU = new NodePositionList<Key>();
  }
  


  // Devuelve el valor que corresponde a una clave "Key"
  public Value get(Key key) {
    if (!cacheContents.containsKey(key)) {
      Value valorNuevaCeldaCache = mainMemory.read(key);
      if (valorNuevaCeldaCache == null) return null;
      if(cacheContents.size() != maxCacheSize) {
        keyListLRU.addFirst(key);
        cacheContents.put(key, new CacheCell<>(valorNuevaCeldaCache,false, keyListLRU.first()));
      } else {
        if (cacheContents.get(keyListLRU.last().element()).getDirty())
          mainMemory.write(keyListLRU.last().element(), cacheContents.get(keyListLRU.last().element()).getValue());
        cacheContents.remove(keyListLRU.last().element());
        keyListLRU.remove(keyListLRU.last());
        keyListLRU.addFirst(key);
        cacheContents.put(key, new CacheCell<>(valorNuevaCeldaCache, false, keyListLRU.first()));
      }
      return valorNuevaCeldaCache;
    } else {
      Value valorCeldaCache = cacheContents.get(key).getValue();
      keyListLRU.remove(cacheContents.get(key).getPos());
      keyListLRU.addFirst(key);
      cacheContents.get(key).setPos(keyListLRU.first());
      return valorCeldaCache;
    }
  }




  // Establece un valor nuevo para la clave en la memoria cache
  public void put(Key key, Value value) {
    if (cacheContents.containsKey(key)) {
      keyListLRU.remove(cacheContents.get(key).getPos());
      keyListLRU.addFirst(key);
      cacheContents.get(key).setPos(keyListLRU.first());
      cacheContents.get(key).setValue(value);
      cacheContents.get(key).setDirty(true);
    }
    else {
      if (cacheContents.size() == maxCacheSize) {
        if (cacheContents.get(keyListLRU.last().element()).getDirty()) {
          mainMemory.write(keyListLRU.last().element(), cacheContents.get(keyListLRU.last().element()).getValue());
        }
        cacheContents.remove(keyListLRU.last().element());
        keyListLRU.remove(keyListLRU.last());
      }
      keyListLRU.addFirst(key);
      cacheContents.put(key, new CacheCell<>(value, true, keyListLRU.first()));
    }
  }




  // NO CAMBIA
  public String toString() {
    return "cache";
  }
}
