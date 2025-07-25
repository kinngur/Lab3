
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2024/10/17 -- 16:51:50
// Seed: {1729,176709,112354}
//
//////////////////////////////////////////////////////////////////////



package aed.cache;

import org.junit.jupiter.api.*;

import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterLab3 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    TestData.setIndividualTimeout(20) ;
    TestData.setGlobalTimeout(120) ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(54,TestData.getGlobalTimeout()) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,8,1) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_cache_01 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_01") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_01")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_01")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_02 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_02")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("salaam"),new String("hallo"),new String("ciao"),new String("kaixo"),new String("hej") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_02")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_03 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_03")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("privet"),new String("zdravo"),new String("bon dia"),new String("hej"),new String("hei"),new String("hola"),new String("kaixo"),new String("ciao"),new String("hallo"),new String("dobry den"),new String("hello"),new String("hi") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_03")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_04 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_04")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hej"),new String("bon dia"),new String("hello"),new String("hola"),new String("hei"),new String("zdravo"),new String("salaam"),new String("kaixo"),new String("rimaykullayki"),new String("dobry den"),new String("namaste"),new String("hallo"),new String("ciao"),new String("hi"),new String("privet") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_04")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_05 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_05")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("hi"),new String("kaixo"),new String("dobry den"),new String("hei"),new String("hej"),new String("namaste"),new String("ola"),new String("zdravo"),new String("hello"),new String("bon dia"),new String("hallo"),new String("hola"),new String("salaam"),new String("ciao") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_05")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_06 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_06")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("zdravo"),new String("ciao"),new String("hello"),new String("hei"),new String("namaste"),new String("hej"),new String("hi"),new String("rimaykullayki") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6 },new String[] { new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("zdravo"),new String("ciao"),new String("hello"),new String("hei"),new String("namaste"),new String("hej"),new String("hi"),new String("rimaykullayki") },new Integer[] { 6 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_06")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_07 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_07")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("ciao"),new String("bon dia"),new String("hello"),new String("hei"),new String("dobry den"),new String("ola"),new String("rimaykullayki"),new String("hi"),new String("hallo"),new String("salaam"),new String("hola"),new String("zdravo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9 },new String[] { new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("ciao"),new String("bon dia"),new String("hello"),new String("hei"),new String("dobry den"),new String("ola"),new String("rimaykullayki"),new String("hi"),new String("hallo"),new String("salaam"),new String("hola"),new String("zdravo") },new Integer[] { 9 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_07")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_08 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_08")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hei"),new String("dobry den"),new String("hallo"),new String("salaam"),new String("hej"),new String("kaixo"),new String("hi"),new String("zdravo"),new String("ciao"),new String("hola"),new String("ola"),new String("privet") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1 },new String[] { new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hei"),new String("dobry den"),new String("hallo"),new String("salaam"),new String("hej"),new String("kaixo"),new String("hi"),new String("zdravo"),new String("ciao"),new String("hola"),new String("ola"),new String("privet") },new Integer[] { 1 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_08")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_09 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_09")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("rimaykullayki"),new String("ola"),new String("privet"),new String("bon dia"),new String("hi"),new String("hallo"),new String("dobry den"),new String("namaste"),new String("hello"),new String("kaixo"),new String("salaam"),new String("hola") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10 },new String[] { new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("rimaykullayki"),new String("ola"),new String("privet"),new String("bon dia"),new String("hi"),new String("hallo"),new String("dobry den"),new String("namaste"),new String("hello"),new String("kaixo"),new String("salaam"),new String("hola") },new Integer[] { 10 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_09")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_10 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_10")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("namaste"),new String("zdravo"),new String("ciao"),new String("privet"),new String("rimaykullayki"),new String("ola") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6 },new String[] { new String("ola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("namaste"),new String("zdravo"),new String("ciao"),new String("privet"),new String("rimaykullayki"),new String("ola") },new Integer[] { 6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6 },new String[] { new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("namaste"),new String("zdravo"),new String("ciao"),new String("privet"),new String("rimaykullayki"),new String("ola") },new Integer[] { 6 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_10")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_11 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_11")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("rimaykullayki"),new String("hei"),new String("hello"),new String("hola"),new String("hej"),new String("salaam") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4 },new String[] { new String("hola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("rimaykullayki"),new String("hei"),new String("hello"),new String("hola"),new String("hej"),new String("salaam") },new Integer[] { 4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,4 },new String[] { new String("rimaykullayki"),new String("hola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("rimaykullayki"),new String("hei"),new String("hello"),new String("hola"),new String("hej"),new String("salaam") },new Integer[] { 1,4 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_11")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_12 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_12")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hello"),new String("dobry den"),new String("ola"),new String("bon dia"),new String("hi"),new String("hallo"),new String("ciao"),new String("hei"),new String("zdravo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] {  },new String[] {  },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hello"),new String("dobry den"),new String("ola"),new String("bon dia"),new String("hi"),new String("hallo"),new String("ciao"),new String("hei"),new String("zdravo") },new Integer[] {  }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5 },new String[] { new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hello"),new String("dobry den"),new String("ola"),new String("bon dia"),new String("hi"),new String("hallo"),new String("ciao"),new String("hei"),new String("zdravo") },new Integer[] { 5 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_12")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_13 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_13")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("namaste"),new String("kaixo"),new String("hola"),new String("hei"),new String("rimaykullayki"),new String("salaam"),new String("hej"),new String("hallo"),new String("privet"),new String("ciao"),new String("zdravo"),new String("dobry den") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,11,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11 },new String[] { new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("namaste"),new String("kaixo"),new String("hola"),new String("hei"),new String("rimaykullayki"),new String("salaam"),new String("hej"),new String("hallo"),new String("privet"),new String("ciao"),new String("zdravo"),new String("dobry den") },new Integer[] { 11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,11 },new String[] { new String("hallo"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("namaste"),new String("kaixo"),new String("hola"),new String("hei"),new String("rimaykullayki"),new String("salaam"),new String("hej"),new String("hallo"),new String("privet"),new String("ciao"),new String("zdravo"),new String("dobry den") },new Integer[] { 8,11 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_13")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_14 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_14")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hallo"),new String("zdravo"),new String("salaam"),new String("hi"),new String("hola"),new String("kaixo"),new String("hei"),new String("ola"),new String("dobry den"),new String("ciao"),new String("hej"),new String("rimaykullayki"),new String("bon dia"),new String("namaste"),new String("privet") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8 },new String[] { new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hallo"),new String("zdravo"),new String("salaam"),new String("hi"),new String("hola"),new String("kaixo"),new String("hei"),new String("ola"),new String("dobry den"),new String("ciao"),new String("hej"),new String("rimaykullayki"),new String("bon dia"),new String("namaste"),new String("privet") },new Integer[] { 8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,15).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 15,8 },new String[] { new String("privet"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hallo"),new String("zdravo"),new String("salaam"),new String("hi"),new String("hola"),new String("kaixo"),new String("hei"),new String("ola"),new String("dobry den"),new String("ciao"),new String("hej"),new String("rimaykullayki"),new String("bon dia"),new String("namaste"),new String("privet") },new Integer[] { 15,8 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_14")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_15 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_15")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("ola"),new String("namaste"),new String("hej"),new String("zdravo"),new String("hei"),new String("rimaykullayki"),new String("hello"),new String("kaixo"),new String("hallo"),new String("dobry den"),new String("hi"),new String("salaam") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000 },new String[] { new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("ola"),new String("namaste"),new String("hej"),new String("zdravo"),new String("hei"),new String("rimaykullayki"),new String("hello"),new String("kaixo"),new String("hallo"),new String("dobry den"),new String("hi"),new String("salaam") },new Integer[] { 1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1000 },new String[] { new String("hi"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("ola"),new String("namaste"),new String("hej"),new String("zdravo"),new String("hei"),new String("rimaykullayki"),new String("hello"),new String("kaixo"),new String("hallo"),new String("dobry den"),new String("hi"),new String("salaam") },new Integer[] { 4,1000 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_15")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_16 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_16")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("hallo"),new String("dobry den"),new String("hi"),new String("hej"),new String("kaixo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2 },new String[] { new String("hallo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("hallo"),new String("dobry den"),new String("hi"),new String("hej"),new String("kaixo") },new Integer[] { 2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,2 },new String[] { new String("hola"),new String("hallo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("hallo"),new String("dobry den"),new String("hi"),new String("hej"),new String("kaixo") },new Integer[] { 1,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1 },new String[] { new String("dobry den"),new String("hola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("hallo"),new String("dobry den"),new String("hi"),new String("hej"),new String("kaixo") },new Integer[] { 3,1 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_16")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_17 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_17")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("rimaykullayki"),new String("ciao"),new String("kaixo"),new String("hola"),new String("privet"),new String("hallo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3 },new String[] { new String("kaixo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("rimaykullayki"),new String("ciao"),new String("kaixo"),new String("hola"),new String("privet"),new String("hallo") },new Integer[] { 3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,3 },new String[] { new String("rimaykullayki"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("rimaykullayki"),new String("ciao"),new String("kaixo"),new String("hola"),new String("privet"),new String("hallo") },new Integer[] { 4,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,4 },new String[] { new String("hallo"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("rimaykullayki"),new String("ciao"),new String("kaixo"),new String("hola"),new String("privet"),new String("hallo") },new Integer[] { 6,4 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_17")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_18 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_18")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("dobry den"),new String("hola"),new String("hi"),new String("namaste"),new String("hello"),new String("privet"),new String("bon dia"),new String("hallo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6 },new String[] { new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("dobry den"),new String("hola"),new String("hi"),new String("namaste"),new String("hello"),new String("privet"),new String("bon dia"),new String("hallo") },new Integer[] { 6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,6 },new String[] { new String("namaste"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("dobry den"),new String("hola"),new String("hi"),new String("namaste"),new String("hello"),new String("privet"),new String("bon dia"),new String("hallo") },new Integer[] { 5,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,6 },new String[] { new String("namaste"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("dobry den"),new String("hola"),new String("hi"),new String("namaste"),new String("hello"),new String("privet"),new String("bon dia"),new String("hallo") },new Integer[] { 6,5 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_18")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_19 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_19")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hello"),new String("hi"),new String("bon dia"),new String("hei"),new String("namaste"),new String("hej"),new String("salaam"),new String("hola"),new String("ciao"),new String("zdravo"),new String("ola"),new String("privet"),new String("kaixo"),new String("hallo"),new String("dobry den") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3 },new String[] { new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hello"),new String("hi"),new String("bon dia"),new String("hei"),new String("namaste"),new String("hej"),new String("salaam"),new String("hola"),new String("ciao"),new String("zdravo"),new String("ola"),new String("privet"),new String("kaixo"),new String("hallo"),new String("dobry den") },new Integer[] { 3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,13).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,3 },new String[] { new String("kaixo"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hello"),new String("hi"),new String("bon dia"),new String("hei"),new String("namaste"),new String("hej"),new String("salaam"),new String("hola"),new String("ciao"),new String("zdravo"),new String("ola"),new String("privet"),new String("kaixo"),new String("hallo"),new String("dobry den") },new Integer[] { 13,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,14).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 14,13,3 },new String[] { new String("hallo"),new String("kaixo"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hello"),new String("hi"),new String("bon dia"),new String("hei"),new String("namaste"),new String("hej"),new String("salaam"),new String("hola"),new String("ciao"),new String("zdravo"),new String("ola"),new String("privet"),new String("kaixo"),new String("hallo"),new String("dobry den") },new Integer[] { 14,13,3 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_19")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_20 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_20")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("privet"),new String("hi"),new String("dobry den"),new String("zdravo"),new String("kaixo"),new String("salaam"),new String("ciao"),new String("bon dia"),new String("hei"),new String("hej"),new String("hola"),new String("hallo"),new String("hello"),new String("rimaykullayki"),new String("namaste") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,13,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13 },new String[] { new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("privet"),new String("hi"),new String("dobry den"),new String("zdravo"),new String("kaixo"),new String("salaam"),new String("ciao"),new String("bon dia"),new String("hei"),new String("hej"),new String("hola"),new String("hallo"),new String("hello"),new String("rimaykullayki"),new String("namaste") },new Integer[] { 13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,13 },new String[] { new String("zdravo"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("privet"),new String("hi"),new String("dobry den"),new String("zdravo"),new String("kaixo"),new String("salaam"),new String("ciao"),new String("bon dia"),new String("hei"),new String("hej"),new String("hola"),new String("hallo"),new String("hello"),new String("rimaykullayki"),new String("namaste") },new Integer[] { 4,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,4,13 },new String[] { new String("namaste"),new String("zdravo"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("privet"),new String("hi"),new String("dobry den"),new String("zdravo"),new String("kaixo"),new String("salaam"),new String("ciao"),new String("bon dia"),new String("hei"),new String("hej"),new String("hola"),new String("hallo"),new String("hello"),new String("rimaykullayki"),new String("namaste") },new Integer[] { 5,4,13 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_20")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_21 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_21")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hello"),new String("hola"),new String("dobry den"),new String("kaixo"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola"),new String("hallo"),new String("hei"),new String("salaam"),new String("privet"),new String("hej") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,13).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13 },new String[] { new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hello"),new String("hola"),new String("dobry den"),new String("kaixo"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola"),new String("hallo"),new String("hei"),new String("salaam"),new String("privet"),new String("hej") },new Integer[] { 13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,13 },new String[] { new String("dobry den"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hello"),new String("hola"),new String("dobry den"),new String("kaixo"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola"),new String("hallo"),new String("hei"),new String("salaam"),new String("privet"),new String("hej") },new Integer[] { 5,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,14).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 14,5,13 },new String[] { new String("privet"),new String("dobry den"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hello"),new String("hola"),new String("dobry den"),new String("kaixo"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola"),new String("hallo"),new String("hei"),new String("salaam"),new String("privet"),new String("hej") },new Integer[] { 14,5,13 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_21")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_22 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_22")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hello"),new String("namaste"),new String("hei"),new String("kaixo"),new String("rimaykullayki"),new String("hej") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("d1")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2 },new String[] { new String("d1") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hello"),new String("namaste"),new String("hei"),new String("kaixo"),new String("rimaykullayki"),new String("hej") },new Integer[] { 2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("d2")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,2 },new String[] { new String("d2"),new String("d1") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hello"),new String("namaste"),new String("hei"),new String("kaixo"),new String("rimaykullayki"),new String("hej") },new Integer[] { 1,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("d3")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1 },new String[] { new String("d3"),new String("d2") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hello"),new String("d1"),new String("hei"),new String("kaixo"),new String("rimaykullayki"),new String("hej") },new Integer[] { 3,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("d1")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,3 },new String[] { new String("d1"),new String("d3") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("d2"),new String("d1"),new String("hei"),new String("kaixo"),new String("rimaykullayki"),new String("hej") },new Integer[] { 2,3 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_22")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_23 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_23")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("privet"),new String("hello"),new String("dobry den"),new String("hi"),new String("zdravo"),new String("ola"),new String("bon dia"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("kaixo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000 },new String[] { new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("privet"),new String("hello"),new String("dobry den"),new String("hi"),new String("zdravo"),new String("ola"),new String("bon dia"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("kaixo") },new Integer[] { 1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1000 },new String[] { new String("dobry den"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("privet"),new String("hello"),new String("dobry den"),new String("hi"),new String("zdravo"),new String("ola"),new String("bon dia"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("kaixo") },new Integer[] { 3,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,3,1000 },new String[] { new String("ciao"),new String("dobry den"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("privet"),new String("hello"),new String("dobry den"),new String("hi"),new String("zdravo"),new String("ola"),new String("bon dia"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("kaixo") },new Integer[] { 8,3,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,3,1000 },new String[] { new String("ciao"),new String("dobry den"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("privet"),new String("hello"),new String("dobry den"),new String("hi"),new String("zdravo"),new String("ola"),new String("bon dia"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("kaixo") },new Integer[] { 3,8,1000 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_23")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_24 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_24")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("hei"),new String("rimaykullayki") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2 },new String[] { new String("hallo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("hei"),new String("rimaykullayki") },new Integer[] { 2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("new")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2 },new String[] { new String("new") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("hei"),new String("rimaykullayki") },new Integer[] { 2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,2 },new String[] { new String("zdravo"),new String("new") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("hei"),new String("rimaykullayki") },new Integer[] { 3,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,3 },new String[] { new String("kaixo"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("new"),new String("zdravo"),new String("kaixo"),new String("hei"),new String("rimaykullayki") },new Integer[] { 4,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("new")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("new"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("new"),new String("zdravo"),new String("kaixo"),new String("hei"),new String("rimaykullayki") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_24")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_25 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_25")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hello"),new String("hei"),new String("privet"),new String("hi"),new String("salaam"),new String("hallo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3 },new String[] { new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hello"),new String("hei"),new String("privet"),new String("hi"),new String("salaam"),new String("hallo") },new Integer[] { 3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3 },new String[] { new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hello"),new String("hei"),new String("privet"),new String("hi"),new String("salaam"),new String("hallo") },new Integer[] { 3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3 },new String[] { new String("zdravo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hello"),new String("hei"),new String("privet"),new String("hi"),new String("salaam"),new String("hallo") },new Integer[] { 5,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3 },new String[] { new String("zdravo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hello"),new String("hei"),new String("privet"),new String("hi"),new String("salaam"),new String("hallo") },new Integer[] { 5,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,5 },new String[] { new String("hola"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hello"),new String("hei"),new String("bon dia"),new String("hi"),new String("salaam"),new String("hallo") },new Integer[] { 4,5 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_25")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_26 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_26")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hola"),new String("namaste"),new String("bon dia"),new String("rimaykullayki"),new String("hallo"),new String("dobry den"),new String("zdravo"),new String("ola"),new String("hi"),new String("privet"),new String("kaixo"),new String("hej"),new String("hei"),new String("salaam"),new String("hello") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9 },new String[] { new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hola"),new String("namaste"),new String("bon dia"),new String("rimaykullayki"),new String("hallo"),new String("dobry den"),new String("zdravo"),new String("ola"),new String("hi"),new String("privet"),new String("kaixo"),new String("hej"),new String("hei"),new String("salaam"),new String("hello") },new Integer[] { 9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,11,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,9 },new String[] { new String("zdravo"),new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hola"),new String("namaste"),new String("bon dia"),new String("rimaykullayki"),new String("hallo"),new String("dobry den"),new String("zdravo"),new String("ola"),new String("hi"),new String("privet"),new String("kaixo"),new String("hej"),new String("hei"),new String("salaam"),new String("hello") },new Integer[] { 11,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,11,9 },new String[] { new String("hallo"),new String("zdravo"),new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hola"),new String("namaste"),new String("bon dia"),new String("rimaykullayki"),new String("hallo"),new String("dobry den"),new String("zdravo"),new String("ola"),new String("hi"),new String("privet"),new String("kaixo"),new String("hej"),new String("hei"),new String("salaam"),new String("hello") },new Integer[] { 5,11,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,11,9 },new String[] { new String("hallo"),new String("zdravo"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hola"),new String("namaste"),new String("bon dia"),new String("rimaykullayki"),new String("hallo"),new String("dobry den"),new String("zdravo"),new String("ola"),new String("hi"),new String("privet"),new String("kaixo"),new String("hej"),new String("hei"),new String("salaam"),new String("hello") },new Integer[] { 9,5,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,14).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 14,5,11,9 },new String[] { new String("salaam"),new String("hallo"),new String("zdravo"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hola"),new String("namaste"),new String("bon dia"),new String("rimaykullayki"),new String("hallo"),new String("dobry den"),new String("zdravo"),new String("ola"),new String("hi"),new String("privet"),new String("kaixo"),new String("hej"),new String("hei"),new String("salaam"),new String("hello") },new Integer[] { 14,9,5,11 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_26")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_27 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_27")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("kaixo"),new String("hello"),new String("hei") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3 },new String[] { new String("ciao") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("kaixo"),new String("hello"),new String("hei") },new Integer[] { 3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3 },new String[] { new String("ciao") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("kaixo"),new String("hello"),new String("hei") },new Integer[] { 3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3 },new String[] { new String("ciao") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("kaixo"),new String("hello"),new String("hei") },new Integer[] { 3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3 },new String[] { new String("hej"),new String("ciao") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("kaixo"),new String("hello"),new String("hei") },new Integer[] { 5,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,5 },new String[] { new String("salaam"),new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("kaixo"),new String("hello"),new String("hei") },new Integer[] { 1,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1 },new String[] { new String("kaixo"),new String("salaam") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("kaixo"),new String("hej"),new String("hei") },new Integer[] { 4,1 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_27")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_28 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_28")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("namaste"),new String("bon dia"),new String("hola"),new String("hello"),new String("hi"),new String("rimaykullayki"),new String("hallo"),new String("privet"),new String("ola"),new String("ciao"),new String("zdravo"),new String("salaam") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,11).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11 },new String[] { new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("namaste"),new String("bon dia"),new String("hola"),new String("hello"),new String("hi"),new String("rimaykullayki"),new String("hallo"),new String("privet"),new String("ola"),new String("ciao"),new String("zdravo"),new String("salaam") },new Integer[] { 11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,11 },new String[] { new String("ciao"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("namaste"),new String("bon dia"),new String("hola"),new String("hello"),new String("hi"),new String("rimaykullayki"),new String("hallo"),new String("privet"),new String("ola"),new String("ciao"),new String("zdravo"),new String("salaam") },new Integer[] { 10,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,12).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,10,11 },new String[] { new String("salaam"),new String("ciao"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("namaste"),new String("bon dia"),new String("hola"),new String("hello"),new String("hi"),new String("rimaykullayki"),new String("hallo"),new String("privet"),new String("ola"),new String("ciao"),new String("zdravo"),new String("salaam") },new Integer[] { 12,10,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,11).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,10,11 },new String[] { new String("salaam"),new String("ciao"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("namaste"),new String("bon dia"),new String("hola"),new String("hello"),new String("hi"),new String("rimaykullayki"),new String("hallo"),new String("privet"),new String("ola"),new String("ciao"),new String("zdravo"),new String("salaam") },new Integer[] { 11,12,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,10,11 },new String[] { new String("salaam"),new String("salaam"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("namaste"),new String("bon dia"),new String("hola"),new String("hello"),new String("hi"),new String("rimaykullayki"),new String("hallo"),new String("privet"),new String("ola"),new String("ciao"),new String("zdravo"),new String("salaam") },new Integer[] { 10,11,12 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,12,10,11 },new String[] { new String("ciao"),new String("salaam"),new String("salaam"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("namaste"),new String("bon dia"),new String("hola"),new String("hello"),new String("hi"),new String("rimaykullayki"),new String("hallo"),new String("privet"),new String("ola"),new String("ciao"),new String("zdravo"),new String("salaam") },new Integer[] { 1000,10,11,12 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_28")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_29 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_29")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("kaixo"),new String("rimaykullayki"),new String("hi"),new String("zdravo"),new String("namaste"),new String("hej") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4 },new String[] { new String("zdravo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("kaixo"),new String("rimaykullayki"),new String("hi"),new String("zdravo"),new String("namaste"),new String("hej") },new Integer[] { 4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4 },new String[] { new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("kaixo"),new String("rimaykullayki"),new String("hi"),new String("zdravo"),new String("namaste"),new String("hej") },new Integer[] { 4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4 },new String[] { new String("hi"),new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("kaixo"),new String("rimaykullayki"),new String("hi"),new String("zdravo"),new String("namaste"),new String("hej") },new Integer[] { 3,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4 },new String[] { new String("hi"),new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("kaixo"),new String("rimaykullayki"),new String("hi"),new String("zdravo"),new String("namaste"),new String("hej") },new Integer[] { 3,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3 },new String[] { new String("hola"),new String("hi") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("kaixo"),new String("rimaykullayki"),new String("hi"),new String("hej"),new String("namaste"),new String("hej") },new Integer[] { 5,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5 },new String[] { new String("kaixo"),new String("hola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("kaixo"),new String("rimaykullayki"),new String("hi"),new String("hej"),new String("namaste"),new String("hej") },new Integer[] { 2,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5 },new String[] { new String("hej"),new String("hola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("kaixo"),new String("rimaykullayki"),new String("hi"),new String("hej"),new String("namaste"),new String("hej") },new Integer[] { 2,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5 },new String[] { new String("hi"),new String("hola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("kaixo"),new String("rimaykullayki"),new String("hi"),new String("hej"),new String("namaste"),new String("hej") },new Integer[] { 2,5 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_29")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_30 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_30")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("salaam"),new String("zdravo"),new String("hola"),new String("hej"),new String("ciao"),new String("hello"),new String("hei"),new String("namaste"),new String("kaixo"),new String("hallo"),new String("hi"),new String("privet"),new String("bon dia"),new String("ola") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7 },new String[] { new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("salaam"),new String("zdravo"),new String("hola"),new String("hej"),new String("ciao"),new String("hello"),new String("hei"),new String("namaste"),new String("kaixo"),new String("hallo"),new String("hi"),new String("privet"),new String("bon dia"),new String("ola") },new Integer[] { 7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,7 },new String[] { new String("ola"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("salaam"),new String("zdravo"),new String("hola"),new String("hej"),new String("ciao"),new String("hello"),new String("hei"),new String("namaste"),new String("kaixo"),new String("hallo"),new String("hi"),new String("privet"),new String("bon dia"),new String("ola") },new Integer[] { 8,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,8,7 },new String[] { new String("salaam"),new String("ola"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("salaam"),new String("zdravo"),new String("hola"),new String("hej"),new String("ciao"),new String("hello"),new String("hei"),new String("namaste"),new String("kaixo"),new String("hallo"),new String("hi"),new String("privet"),new String("bon dia"),new String("ola") },new Integer[] { 2,8,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,11,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,2,8,7 },new String[] { new String("hola"),new String("salaam"),new String("ola"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("salaam"),new String("zdravo"),new String("hola"),new String("hej"),new String("ciao"),new String("hello"),new String("hei"),new String("namaste"),new String("kaixo"),new String("hallo"),new String("hi"),new String("privet"),new String("bon dia"),new String("ola") },new Integer[] { 11,2,8,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,13,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,11,2,8,7 },new String[] { new String("kaixo"),new String("hola"),new String("salaam"),new String("ola"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("salaam"),new String("zdravo"),new String("hola"),new String("hej"),new String("ciao"),new String("hello"),new String("hei"),new String("namaste"),new String("kaixo"),new String("hallo"),new String("hi"),new String("privet"),new String("bon dia"),new String("ola") },new Integer[] { 13,11,2,8,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,11,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,11,2,8,7 },new String[] { new String("kaixo"),new String("dobry den"),new String("salaam"),new String("ola"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("salaam"),new String("zdravo"),new String("hola"),new String("hej"),new String("ciao"),new String("hello"),new String("hei"),new String("namaste"),new String("kaixo"),new String("hallo"),new String("hi"),new String("privet"),new String("bon dia"),new String("ola") },new Integer[] { 11,13,2,8,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,15).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 15,13,11,2,8 },new String[] { new String("ola"),new String("kaixo"),new String("dobry den"),new String("salaam"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("salaam"),new String("zdravo"),new String("hola"),new String("hej"),new String("ciao"),new String("hello"),new String("hei"),new String("namaste"),new String("kaixo"),new String("hallo"),new String("hi"),new String("privet"),new String("bon dia"),new String("ola") },new Integer[] { 15,11,13,2,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,15,13,11,2 },new String[] { new String("privet"),new String("ola"),new String("kaixo"),new String("dobry den"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("salaam"),new String("zdravo"),new String("hola"),new String("hej"),new String("ciao"),new String("hello"),new String("ola"),new String("namaste"),new String("kaixo"),new String("hallo"),new String("hi"),new String("privet"),new String("bon dia"),new String("ola") },new Integer[] { 5,15,11,13,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,11).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,15,13,11,2 },new String[] { new String("privet"),new String("ola"),new String("kaixo"),new String("dobry den"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("salaam"),new String("zdravo"),new String("hola"),new String("hej"),new String("ciao"),new String("hello"),new String("ola"),new String("namaste"),new String("kaixo"),new String("hallo"),new String("hi"),new String("privet"),new String("bon dia"),new String("ola") },new Integer[] { 11,5,15,13,2 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_30")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_31 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_31")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("salaam"),new String("bon dia"),new String("hi"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hello"),new String("hei"),new String("kaixo"),new String("hej"),new String("zdravo"),new String("ola") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] {  },new String[] {  },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("salaam"),new String("bon dia"),new String("hi"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hello"),new String("hei"),new String("kaixo"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] {  }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8 },new String[] { new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("salaam"),new String("bon dia"),new String("hi"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hello"),new String("hei"),new String("kaixo"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8 },new String[] { new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("salaam"),new String("bon dia"),new String("hi"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hello"),new String("hei"),new String("kaixo"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,8 },new String[] { new String("zdravo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("salaam"),new String("bon dia"),new String("hi"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hello"),new String("hei"),new String("kaixo"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 1,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1,8 },new String[] { new String("namaste"),new String("zdravo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("salaam"),new String("bon dia"),new String("hi"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hello"),new String("hei"),new String("kaixo"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 4,1,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1,8 },new String[] { new String("namaste"),new String("zdravo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("salaam"),new String("bon dia"),new String("hi"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hello"),new String("hei"),new String("kaixo"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 4,1,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,4,1,8 },new String[] { new String("hallo"),new String("namaste"),new String("zdravo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("salaam"),new String("bon dia"),new String("hi"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hello"),new String("hei"),new String("kaixo"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 5,4,1,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,12,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,5,4,1 },new String[] { new String("bon dia"),new String("hallo"),new String("namaste"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("salaam"),new String("bon dia"),new String("hi"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hello"),new String("hola"),new String("kaixo"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 12,5,4,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,12,5,4 },new String[] { new String("ciao"),new String("bon dia"),new String("hallo"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("bon dia"),new String("hi"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hello"),new String("hola"),new String("kaixo"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 7,12,5,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,7,12,5 },new String[] { new String("privet"),new String("ciao"),new String("bon dia"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("bon dia"),new String("hi"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hello"),new String("hola"),new String("kaixo"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 3,7,12,5 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_31")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_32 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_32")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hei"),new String("ola"),new String("salaam"),new String("kaixo"),new String("dobry den"),new String("privet"),new String("hej"),new String("namaste"),new String("hola"),new String("hi"),new String("ciao"),new String("rimaykullayki"),new String("zdravo"),new String("bon dia"),new String("hallo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9 },new String[] { new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hei"),new String("ola"),new String("salaam"),new String("kaixo"),new String("dobry den"),new String("privet"),new String("hej"),new String("namaste"),new String("hola"),new String("hi"),new String("ciao"),new String("rimaykullayki"),new String("zdravo"),new String("bon dia"),new String("hallo") },new Integer[] { 9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,9 },new String[] { new String("kaixo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hei"),new String("ola"),new String("salaam"),new String("kaixo"),new String("dobry den"),new String("privet"),new String("hej"),new String("namaste"),new String("hola"),new String("hi"),new String("ciao"),new String("rimaykullayki"),new String("zdravo"),new String("bon dia"),new String("hallo") },new Integer[] { 4,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,4,9 },new String[] { new String("hej"),new String("kaixo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hei"),new String("ola"),new String("salaam"),new String("kaixo"),new String("dobry den"),new String("privet"),new String("hej"),new String("namaste"),new String("hola"),new String("hi"),new String("ciao"),new String("rimaykullayki"),new String("zdravo"),new String("bon dia"),new String("hallo") },new Integer[] { 5,4,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,5,4,9 },new String[] { new String("salaam"),new String("hej"),new String("kaixo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hei"),new String("ola"),new String("salaam"),new String("kaixo"),new String("dobry den"),new String("privet"),new String("hej"),new String("namaste"),new String("hola"),new String("hi"),new String("ciao"),new String("rimaykullayki"),new String("zdravo"),new String("bon dia"),new String("hallo") },new Integer[] { 7,5,4,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,7,5,4,9 },new String[] { new String("dobry den"),new String("salaam"),new String("hej"),new String("kaixo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hei"),new String("ola"),new String("salaam"),new String("kaixo"),new String("dobry den"),new String("privet"),new String("hej"),new String("namaste"),new String("hola"),new String("hi"),new String("ciao"),new String("rimaykullayki"),new String("zdravo"),new String("bon dia"),new String("hallo") },new Integer[] { 3,7,5,4,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,3,7,5,4 },new String[] { new String("hei"),new String("dobry den"),new String("salaam"),new String("hej"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hei"),new String("ola"),new String("salaam"),new String("kaixo"),new String("dobry den"),new String("privet"),new String("hej"),new String("namaste"),new String("bon dia"),new String("hi"),new String("ciao"),new String("rimaykullayki"),new String("zdravo"),new String("bon dia"),new String("hallo") },new Integer[] { 1,3,7,5,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,13).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,1,3,7,5 },new String[] { new String("zdravo"),new String("hei"),new String("dobry den"),new String("salaam"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hei"),new String("ola"),new String("salaam"),new String("kaixo"),new String("dobry den"),new String("privet"),new String("hej"),new String("namaste"),new String("bon dia"),new String("hi"),new String("ciao"),new String("rimaykullayki"),new String("zdravo"),new String("bon dia"),new String("hallo") },new Integer[] { 13,1,3,7,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,14).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 14,13,1,3,7 },new String[] { new String("bon dia"),new String("zdravo"),new String("hei"),new String("dobry den"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hei"),new String("ola"),new String("salaam"),new String("kaixo"),new String("hej"),new String("privet"),new String("hej"),new String("namaste"),new String("bon dia"),new String("hi"),new String("ciao"),new String("rimaykullayki"),new String("zdravo"),new String("bon dia"),new String("hallo") },new Integer[] { 14,13,1,3,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,12,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,14,13,1,3 },new String[] { new String("hola"),new String("bon dia"),new String("zdravo"),new String("hei"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hei"),new String("ola"),new String("salaam"),new String("kaixo"),new String("hej"),new String("privet"),new String("salaam"),new String("namaste"),new String("bon dia"),new String("hi"),new String("ciao"),new String("rimaykullayki"),new String("zdravo"),new String("bon dia"),new String("hallo") },new Integer[] { 12,14,13,1,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,12,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,14,13,1,3 },new String[] { new String("hi"),new String("bon dia"),new String("zdravo"),new String("hei"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hei"),new String("ola"),new String("salaam"),new String("kaixo"),new String("hej"),new String("privet"),new String("salaam"),new String("namaste"),new String("bon dia"),new String("hi"),new String("ciao"),new String("rimaykullayki"),new String("zdravo"),new String("bon dia"),new String("hallo") },new Integer[] { 12,14,13,1,3 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_32")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_33 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_33")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("hei"),new String("ola"),new String("hola") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5 },new String[] { new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("hei"),new String("ola"),new String("hola") },new Integer[] { 5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,5 },new String[] { new String("zdravo"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("hei"),new String("ola"),new String("hola") },new Integer[] { 4,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,4,5 },new String[] { new String("hello"),new String("zdravo"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("hei"),new String("ola"),new String("hola") },new Integer[] { 8,4,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,4,5 },new String[] { new String("hello"),new String("zdravo"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("hei"),new String("ola"),new String("hola") },new Integer[] { 8,4,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,8,4 },new String[] { new String("zdravo"),new String("hello"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("hei"),new String("ola"),new String("hola") },new Integer[] { 7,8,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,7,8 },new String[] { new String("hola"),new String("zdravo"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("hei"),new String("ola"),new String("hola") },new Integer[] { 9,7,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,7,8 },new String[] { new String("hola"),new String("salaam"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("hei"),new String("ola"),new String("hola") },new Integer[] { 7,9,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,7,8 },new String[] { new String("hola"),new String("salaam"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("hei"),new String("ola"),new String("hola") },new Integer[] { 7,9,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,9,7 },new String[] { new String("rimaykullayki"),new String("hola"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("hei"),new String("hello"),new String("hola") },new Integer[] { 1,7,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1,7 },new String[] { new String("privet"),new String("rimaykullayki"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("hei"),new String("hello"),new String("hola") },new Integer[] { 3,1,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,3,1 },new String[] { new String("kaixo"),new String("privet"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("salaam"),new String("hello"),new String("hola") },new Integer[] { 6,3,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6,3 },new String[] { new String("privet"),new String("kaixo"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("rimaykullayki"),new String("hallo"),new String("salaam"),new String("zdravo"),new String("hej"),new String("kaixo"),new String("salaam"),new String("hello"),new String("hola") },new Integer[] { 4,6,3 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_33")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_34 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_34")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("ola"),new String("privet"),new String("salaam"),new String("hallo"),new String("dobry den") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5 },new String[] { new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("ola"),new String("privet"),new String("salaam"),new String("hallo"),new String("dobry den") },new Integer[] { 5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,5 },new String[] { new String("zdravo"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("ola"),new String("privet"),new String("salaam"),new String("hallo"),new String("dobry den") },new Integer[] { 6,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("rimaykullayki"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("ola"),new String("privet"),new String("salaam"),new String("rimaykullayki"),new String("dobry den") },new Integer[] { 4,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("rimaykullayki"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("ola"),new String("privet"),new String("salaam"),new String("rimaykullayki"),new String("dobry den") },new Integer[] { 6,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("rimaykullayki"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("ola"),new String("privet"),new String("salaam"),new String("rimaykullayki"),new String("dobry den") },new Integer[] { 4,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("namaste"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("ola"),new String("privet"),new String("salaam"),new String("rimaykullayki"),new String("zdravo") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("namaste"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("ola"),new String("privet"),new String("salaam"),new String("rimaykullayki"),new String("zdravo") },new Integer[] { 4,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,4 },new String[] { new String("hola"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("namaste"),new String("privet"),new String("salaam"),new String("rimaykullayki"),new String("zdravo") },new Integer[] { 5,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,4 },new String[] { new String("hola"),new String("hola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("namaste"),new String("privet"),new String("salaam"),new String("rimaykullayki"),new String("zdravo") },new Integer[] { 4,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4 },new String[] { new String("kaixo"),new String("hola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("namaste"),new String("privet"),new String("salaam"),new String("hola"),new String("zdravo") },new Integer[] { 3,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,3 },new String[] { new String("bon dia"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("namaste"),new String("privet"),new String("hola"),new String("hola"),new String("zdravo") },new Integer[] { 1,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1 },new String[] { new String("hola"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("namaste"),new String("kaixo"),new String("hola"),new String("hola"),new String("zdravo") },new Integer[] { 4,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,4 },new String[] { new String("hej"),new String("hola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("namaste"),new String("kaixo"),new String("hola"),new String("hola"),new String("zdravo") },new Integer[] { 5,4 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_34")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_35 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_35")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("bon dia"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10 },new String[] { new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("bon dia"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,11,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,10 },new String[] { new String("hola"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("bon dia"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 11,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,11).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,10 },new String[] { new String("hola"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("bon dia"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 11,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,13).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,11,10 },new String[] { new String("zdravo"),new String("hola"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("bon dia"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 13,11,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,14,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 14,13,11,10 },new String[] { new String("zdravo"),new String("zdravo"),new String("hola"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("bon dia"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 14,13,11,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,12,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,14,13,11,10 },new String[] { new String("salaam"),new String("zdravo"),new String("zdravo"),new String("hola"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("bon dia"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 12,14,13,11,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,12,14,13,11 },new String[] { new String("bon dia"),new String("salaam"),new String("zdravo"),new String("zdravo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("kaixo"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 6,12,14,13,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,12).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,12,14,13,11 },new String[] { new String("bon dia"),new String("salaam"),new String("zdravo"),new String("zdravo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("kaixo"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 12,6,14,13,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,11).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,12,14,13,11 },new String[] { new String("bon dia"),new String("salaam"),new String("zdravo"),new String("zdravo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("kaixo"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 11,12,6,14,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,6,12,14,11 },new String[] { new String("hello"),new String("bon dia"),new String("salaam"),new String("zdravo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("kaixo"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 1,11,12,6,14 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,14,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,6,12,14,11 },new String[] { new String("hello"),new String("bon dia"),new String("salaam"),new String("hello"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("hola"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("kaixo"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 14,1,11,12,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,1,12,14,11 },new String[] { new String("hallo"),new String("hello"),new String("salaam"),new String("hello"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("bon dia"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("kaixo"),new String("salaam"),new String("hello"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 7,14,1,11,12 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,7,1,14,11 },new String[] { new String("bon dia"),new String("hallo"),new String("hello"),new String("hello"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hei"),new String("hi"),new String("bon dia"),new String("hej"),new String("privet"),new String("rimaykullayki"),new String("kaixo"),new String("salaam"),new String("salaam"),new String("zdravo"),new String("ciao"),new String("kaixo") },new Integer[] { 1000,7,14,1,11 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_35")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_36 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_36")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hi"),new String("bon dia"),new String("ola"),new String("hej"),new String("dobry den") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,11,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11 },new String[] { new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hi"),new String("bon dia"),new String("ola"),new String("hej"),new String("dobry den") },new Integer[] { 11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,15,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 15,11 },new String[] { new String("hei"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hi"),new String("bon dia"),new String("ola"),new String("hej"),new String("dobry den") },new Integer[] { 15,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,15,11 },new String[] { new String("rimaykullayki"),new String("hei"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hi"),new String("bon dia"),new String("ola"),new String("hej"),new String("dobry den") },new Integer[] { 5,15,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,5,15,11 },new String[] { new String("namaste"),new String("rimaykullayki"),new String("hei"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hi"),new String("bon dia"),new String("ola"),new String("hej"),new String("dobry den") },new Integer[] { 4,5,15,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,15).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,5,15,11 },new String[] { new String("namaste"),new String("rimaykullayki"),new String("hei"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hi"),new String("bon dia"),new String("ola"),new String("hej"),new String("dobry den") },new Integer[] { 15,4,5,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,4,5,15,11 },new String[] { new String("hola"),new String("namaste"),new String("rimaykullayki"),new String("hei"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hi"),new String("bon dia"),new String("ola"),new String("hej"),new String("dobry den") },new Integer[] { 1000,15,4,5,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,1000,4,5,15 },new String[] { new String("hej"),new String("hola"),new String("namaste"),new String("rimaykullayki"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hola"),new String("bon dia"),new String("ola"),new String("hej"),new String("dobry den") },new Integer[] { 7,1000,15,4,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,1000,4,5,15 },new String[] { new String("kaixo"),new String("hola"),new String("namaste"),new String("rimaykullayki"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hola"),new String("bon dia"),new String("ola"),new String("hej"),new String("dobry den") },new Integer[] { 7,1000,15,4,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,12).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,7,1000,4,15 },new String[] { new String("bon dia"),new String("kaixo"),new String("hola"),new String("namaste"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("hola"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hola"),new String("bon dia"),new String("ola"),new String("hej"),new String("dobry den") },new Integer[] { 12,7,1000,15,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,11).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,12,7,1000,15 },new String[] { new String("hola"),new String("bon dia"),new String("kaixo"),new String("hola"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("namaste"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hola"),new String("bon dia"),new String("ola"),new String("hej"),new String("dobry den") },new Integer[] { 11,12,7,1000,15 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,11,12,7,1000 },new String[] { new String("namaste"),new String("hola"),new String("bon dia"),new String("kaixo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("namaste"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hola"),new String("bon dia"),new String("ola"),new String("hej"),new String("hei") },new Integer[] { 6,11,12,7,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,6,11,12,7 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("bon dia"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1000 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("namaste"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ciao"),new String("salaam"),new String("hello"),new String("hola"),new String("bon dia"),new String("ola"),new String("hej"),new String("hei"),new String("hola") },new Integer[] { 5,6,11,12,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,13,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,5,6,11,12 },new String[] { new String("bon dia"),new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1000 },new String[] { new String("kaixo"),new String("zdravo"),new String("hallo"),new String("namaste"),new String("rimaykullayki"),new String("namaste"),new String("kaixo"),new String("ciao"),new String("salaam"),new String("hello"),new String("hola"),new String("bon dia"),new String("ola"),new String("hej"),new String("hei"),new String("hola") },new Integer[] { 13,5,6,11,12 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_36")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_37 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_37")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ola"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4 },new String[] { new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ola"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,4 },new String[] { new String("hallo"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ola"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 5,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5,4 },new String[] { new String("hello"),new String("hallo"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ola"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 2,5,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5,4 },new String[] { new String("hello"),new String("hallo"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ola"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 2,5,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,2,5,4 },new String[] { new String("hello"),new String("hello"),new String("hallo"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ola"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 7,2,5,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,12).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,7,2,5 },new String[] { new String("dobry den"),new String("hello"),new String("hello"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("ola"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 12,7,2,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,12,7,2 },new String[] { new String("zdravo"),new String("dobry den"),new String("hello"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("bon dia"),new String("ciao"),new String("rimaykullayki"),new String("hallo"),new String("hei"),new String("ola"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 9,12,7,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,9,12,7 },new String[] { new String("salaam"),new String("zdravo"),new String("dobry den"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("hello"),new String("ciao"),new String("rimaykullayki"),new String("hallo"),new String("hei"),new String("ola"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 8,9,12,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,8,9,12 },new String[] { new String("ciao"),new String("salaam"),new String("zdravo"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("hello"),new String("ciao"),new String("rimaykullayki"),new String("hallo"),new String("hei"),new String("hello"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 3,8,9,12 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,8,9,12 },new String[] { new String("ciao"),new String("salaam"),new String("zdravo"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("hello"),new String("ciao"),new String("rimaykullayki"),new String("hallo"),new String("hei"),new String("hello"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 3,8,9,12 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,3,8,9 },new String[] { new String("ola"),new String("ciao"),new String("salaam"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("hello"),new String("ciao"),new String("rimaykullayki"),new String("hallo"),new String("hei"),new String("hello"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 2,3,8,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2,3,8 },new String[] { new String("rimaykullayki"),new String("ola"),new String("ciao"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("hello"),new String("ciao"),new String("rimaykullayki"),new String("hallo"),new String("hei"),new String("hello"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 4,2,3,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2,3,8 },new String[] { new String("salaam"),new String("ola"),new String("ciao"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("hello"),new String("ciao"),new String("rimaykullayki"),new String("hallo"),new String("hei"),new String("hello"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 4,2,3,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,4,2,3 },new String[] { new String("zdravo"),new String("salaam"),new String("ola"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hola"),new String("hello"),new String("ciao"),new String("rimaykullayki"),new String("hallo"),new String("hei"),new String("hello"),new String("salaam"),new String("zdravo"),new String("hi"),new String("kaixo"),new String("dobry den") },new Integer[] { 9,4,2,3 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_37")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_38 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_38")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("dobry den"),new String("ola"),new String("hello"),new String("hej"),new String("namaste"),new String("hei") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6 },new String[] { new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("dobry den"),new String("ola"),new String("hello"),new String("hej"),new String("namaste"),new String("hei") },new Integer[] { 6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,6 },new String[] { new String("rimaykullayki"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("dobry den"),new String("ola"),new String("hello"),new String("hej"),new String("namaste"),new String("hei") },new Integer[] { 9,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,9,6 },new String[] { new String("kaixo"),new String("rimaykullayki"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("dobry den"),new String("ola"),new String("hello"),new String("hej"),new String("namaste"),new String("hei") },new Integer[] { 4,9,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,9,6 },new String[] { new String("privet"),new String("rimaykullayki"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("dobry den"),new String("ola"),new String("hello"),new String("hej"),new String("namaste"),new String("hei") },new Integer[] { 4,9,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,4,9 },new String[] { new String("ciao"),new String("privet"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("dobry den"),new String("ola"),new String("hello"),new String("hej"),new String("namaste"),new String("hei") },new Integer[] { 7,4,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,7,4 },new String[] { new String("namaste"),new String("ciao"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("dobry den"),new String("ola"),new String("hello"),new String("hej"),new String("namaste"),new String("rimaykullayki") },new Integer[] { 8,7,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,7,4 },new String[] { new String("rimaykullayki"),new String("ciao"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("dobry den"),new String("ola"),new String("hello"),new String("hej"),new String("namaste"),new String("rimaykullayki") },new Integer[] { 8,7,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,7,4 },new String[] { new String("hi"),new String("ciao"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("dobry den"),new String("ola"),new String("hello"),new String("hej"),new String("namaste"),new String("rimaykullayki") },new Integer[] { 8,7,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,8,7 },new String[] { new String("ola"),new String("hi"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("privet"),new String("ola"),new String("hello"),new String("hej"),new String("namaste"),new String("rimaykullayki") },new Integer[] { 1,8,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,1,8 },new String[] { new String("ciao"),new String("ola"),new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("privet"),new String("ola"),new String("hello"),new String("ciao"),new String("namaste"),new String("rimaykullayki") },new Integer[] { 9,1,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,9,1 },new String[] { new String("privet"),new String("ciao"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("privet"),new String("ola"),new String("hello"),new String("ciao"),new String("hi"),new String("rimaykullayki") },new Integer[] { 6,9,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,9,1 },new String[] { new String("privet"),new String("ciao"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ciao"),new String("hallo"),new String("privet"),new String("privet"),new String("ola"),new String("hello"),new String("ciao"),new String("hi"),new String("rimaykullayki") },new Integer[] { 6,9,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,6,9 },new String[] { new String("rimaykullayki"),new String("privet"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ola"),new String("hallo"),new String("privet"),new String("privet"),new String("ola"),new String("hello"),new String("ciao"),new String("hi"),new String("rimaykullayki") },new Integer[] { 1000,6,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1000,6 },new String[] { new String("namaste"),new String("rimaykullayki"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ola"),new String("hallo"),new String("privet"),new String("privet"),new String("ola"),new String("hello"),new String("ciao"),new String("hi"),new String("ciao") },new Integer[] { 3,1000,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3,1000 },new String[] { new String("ola"),new String("namaste"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ola"),new String("hallo"),new String("privet"),new String("privet"),new String("ola"),new String("privet"),new String("ciao"),new String("hi"),new String("ciao") },new Integer[] { 5,3,1000 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_38")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_39 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_39")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("hola"),new String("hej"),new String("zdravo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7 },new String[] { new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("hola"),new String("hej"),new String("zdravo") },new Integer[] { 7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,7 },new String[] { new String("hola"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("hola"),new String("hej"),new String("zdravo") },new Integer[] { 10,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,7 },new String[] { new String("bon dia"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("hola"),new String("hej"),new String("zdravo") },new Integer[] { 10,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,7 },new String[] { new String("bon dia"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("hola"),new String("hej"),new String("zdravo") },new Integer[] { 7,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,10,7 },new String[] { new String("rimaykullayki"),new String("bon dia"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("hola"),new String("hej"),new String("zdravo") },new Integer[] { 5,7,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,12,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,5,10,7 },new String[] { new String("hej"),new String("rimaykullayki"),new String("bon dia"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("hola"),new String("hej"),new String("zdravo") },new Integer[] { 12,5,7,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,5,10,7 },new String[] { new String("hej"),new String("ola"),new String("bon dia"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("hola"),new String("hej"),new String("zdravo") },new Integer[] { 5,12,7,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,12,5,7 },new String[] { new String("dobry den"),new String("hej"),new String("ola"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("bon dia"),new String("hej"),new String("zdravo") },new Integer[] { 4,5,12,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,4,12,5 },new String[] { new String("privet"),new String("dobry den"),new String("hej"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("bon dia"),new String("hej"),new String("zdravo") },new Integer[] { 6,4,5,12 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,6,4,5 },new String[] { new String("salaam"),new String("privet"),new String("dobry den"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("rimaykullayki"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("bon dia"),new String("hej"),new String("hej") },new Integer[] { 3,6,4,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,12,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,3,6,4 },new String[] { new String("hej"),new String("salaam"),new String("privet"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("ola"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("bon dia"),new String("hej"),new String("hej") },new Integer[] { 12,3,6,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,12,3,6 },new String[] { new String("hello"),new String("hej"),new String("salaam"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("ola"),new String("namaste"),new String("hei"),new String("kaixo"),new String("hello"),new String("bon dia"),new String("hej"),new String("hej") },new Integer[] { 10,12,3,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,11).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,10,12,3 },new String[] { new String("hej"),new String("hello"),new String("hej"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("bon dia"),new String("dobry den"),new String("ola"),new String("privet"),new String("hei"),new String("kaixo"),new String("hello"),new String("bon dia"),new String("hej"),new String("hej") },new Integer[] { 11,10,12,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,11,10,12 },new String[] { new String("bon dia"),new String("hej"),new String("hello"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("salaam"),new String("dobry den"),new String("ola"),new String("privet"),new String("hei"),new String("kaixo"),new String("hello"),new String("bon dia"),new String("hej"),new String("hej") },new Integer[] { 5,11,10,12 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,5,11,10 },new String[] { new String("hei"),new String("bon dia"),new String("hej"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("hallo"),new String("ola"),new String("salaam"),new String("dobry den"),new String("ola"),new String("privet"),new String("hei"),new String("kaixo"),new String("hello"),new String("bon dia"),new String("hej"),new String("hej") },new Integer[] { 1,5,11,10 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_39")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_40 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_40")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hei"),new String("hello"),new String("hi"),new String("ciao"),new String("hola"),new String("namaste") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6 },new String[] { new String("namaste") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hei"),new String("hello"),new String("hi"),new String("ciao"),new String("hola"),new String("namaste") },new Integer[] { 6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,6 },new String[] { new String("dobry den"),new String("namaste") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hei"),new String("hello"),new String("hi"),new String("ciao"),new String("hola"),new String("namaste") },new Integer[] { 1,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1 },new String[] { new String("hei"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hei"),new String("hello"),new String("hi"),new String("ciao"),new String("hola"),new String("namaste") },new Integer[] { 3,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,3 },new String[] { new String("hej"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("dobry den"),new String("hello"),new String("hi"),new String("ciao"),new String("hola"),new String("namaste") },new Integer[] { 2,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,2 },new String[] { new String("hola"),new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("dobry den"),new String("hello"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste") },new Integer[] { 5,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,5 },new String[] { new String("ciao"),new String("hola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("dobry den"),new String("hej"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste") },new Integer[] { 4,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,4 },new String[] { new String("ola"),new String("ciao") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("dobry den"),new String("hej"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste") },new Integer[] { 1000,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,1000 },new String[] { new String("namaste"),new String("ola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("dobry den"),new String("hej"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste") },new Integer[] { 6,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,6 },new String[] { new String("zdravo"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hej"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste"),new String("ola") },new Integer[] { 2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,6 },new String[] { new String("hi"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hej"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste"),new String("ola") },new Integer[] { 2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,6 },new String[] { new String("hi"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hej"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste"),new String("ola") },new Integer[] { 6,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,6 },new String[] { new String("hallo"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hi"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste"),new String("ola") },new Integer[] { 1,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,1 },new String[] { new String("ola"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hi"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste"),new String("ola") },new Integer[] { 7,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,1 },new String[] { new String("ola"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hi"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste"),new String("ola") },new Integer[] { 1,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,1 },new String[] { new String("ola"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hi"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste"),new String("ola") },new Integer[] { 7,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,1 },new String[] { new String("ola"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hi"),new String("hei"),new String("ciao"),new String("hola"),new String("namaste"),new String("ola") },new Integer[] { 7,1 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_40")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_41 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_41")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("privet"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2 },new String[] { new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("privet"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") },new Integer[] { 2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,2 },new String[] { new String("hello"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("privet"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") },new Integer[] { 1,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,1,2 },new String[] { new String("ola"),new String("hello"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("privet"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") },new Integer[] { 9,1,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,9,1 },new String[] { new String("rimaykullayki"),new String("ola"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("hola"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") },new Integer[] { 3,9,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,9,1 },new String[] { new String("hej"),new String("ola"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("hola"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") },new Integer[] { 3,9,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,9,1 },new String[] { new String("hej"),new String("ola"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("hola"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") },new Integer[] { 3,9,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3,9 },new String[] { new String("namaste"),new String("hej"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hello"),new String("hola"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") },new Integer[] { 5,3,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3,9 },new String[] { new String("namaste"),new String("hej"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hello"),new String("hola"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") },new Integer[] { 5,3,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,5,3 },new String[] { new String("ola"),new String("namaste"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hello"),new String("hola"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") },new Integer[] { 1000,5,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,1000,5 },new String[] { new String("ola"),new String("ola"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hello"),new String("hola"),new String("hej"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") },new Integer[] { 7,1000,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,7,1000 },new String[] { new String("ola"),new String("ola"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hello"),new String("hola"),new String("hej"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola") },new Integer[] { 9,7,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,9,7 },new String[] { new String("hello"),new String("ola"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hello"),new String("hola"),new String("hej"),new String("hi"),new String("namaste"),new String("hei"),new String("ciao"),new String("hallo"),new String("ola"),new String("ola") },new Integer[] { 1,9,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,1,9 },new String[] { new String("namaste"),new String("hello"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hello"),new String("hola"),new String("hej"),new String("hi"),new String("namaste"),new String("hei"),new String("ola"),new String("hallo"),new String("ola"),new String("ola") },new Integer[] { 5,1,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,1,9 },new String[] { new String("namaste"),new String("hello"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hello"),new String("hola"),new String("hej"),new String("hi"),new String("namaste"),new String("hei"),new String("ola"),new String("hallo"),new String("ola"),new String("ola") },new Integer[] { 5,1,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,1,9 },new String[] { new String("namaste"),new String("hello"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hello"),new String("hola"),new String("hej"),new String("hi"),new String("namaste"),new String("hei"),new String("ola"),new String("hallo"),new String("ola"),new String("ola") },new Integer[] { 5,1,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,1,9 },new String[] { new String("namaste"),new String("hallo"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hello"),new String("hola"),new String("hej"),new String("hi"),new String("namaste"),new String("hei"),new String("ola"),new String("hallo"),new String("ola"),new String("ola") },new Integer[] { 1,5,9 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_41")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_42 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_42")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("kaixo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9 },new String[] { new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("kaixo") },new Integer[] { 9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9 },new String[] { new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("kaixo") },new Integer[] { 9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,9 },new String[] { new String("hello"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("kaixo") },new Integer[] { 4,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,4,9 },new String[] { new String("hola"),new String("hello"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("kaixo") },new Integer[] { 6,4,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,4,9 },new String[] { new String("hola"),new String("hello"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("kaixo") },new Integer[] { 9,6,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,6,9 },new String[] { new String("bon dia"),new String("hola"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("kaixo") },new Integer[] { 3,9,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,6,9 },new String[] { new String("bon dia"),new String("hola"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("kaixo") },new Integer[] { 3,9,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,3,9 },new String[] { new String("hola"),new String("bon dia"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("kaixo") },new Integer[] { 7,3,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,7,3 },new String[] { new String("privet"),new String("hola"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("hello") },new Integer[] { 5,7,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,7,3 },new String[] { new String("privet"),new String("hola"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("hello") },new Integer[] { 5,7,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,7,3 },new String[] { new String("privet"),new String("hola"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("hi"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("hello") },new Integer[] { 5,7,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,5,7 },new String[] { new String("namaste"),new String("privet"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("bon dia"),new String("hello"),new String("zdravo"),new String("hola"),new String("bon dia"),new String("privet"),new String("hello") },new Integer[] { 1,5,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1,5 },new String[] { new String("hello"),new String("namaste"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("bon dia"),new String("hello"),new String("zdravo"),new String("hola"),new String("hola"),new String("privet"),new String("hello") },new Integer[] { 4,1,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,4,1 },new String[] { new String("dobry den"),new String("hello"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("bon dia"),new String("hello"),new String("privet"),new String("hola"),new String("hola"),new String("privet"),new String("hello") },new Integer[] { 8,4,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,8,4 },new String[] { new String("hola"),new String("dobry den"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("bon dia"),new String("hello"),new String("privet"),new String("hola"),new String("hola"),new String("privet"),new String("hello") },new Integer[] { 6,8,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,8,4 },new String[] { new String("hola"),new String("hallo"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hallo"),new String("bon dia"),new String("hello"),new String("privet"),new String("hola"),new String("hola"),new String("privet"),new String("hello") },new Integer[] { 8,6,4 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_42")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_43 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_43")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ciao"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("ola") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,13,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13 },new String[] { new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ciao"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("ola") },new Integer[] { 13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,13).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13 },new String[] { new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ciao"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("ola") },new Integer[] { 13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,13 },new String[] { new String("ola"),new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ciao"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("ola") },new Integer[] { 7,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,7,13 },new String[] { new String("hi"),new String("ola"),new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ciao"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("ola") },new Integer[] { 5,7,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,5,7,13 },new String[] { new String("hi"),new String("hi"),new String("ola"),new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ciao"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("ola") },new Integer[] { 6,5,7,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,6,5,7,13 },new String[] { new String("ola"),new String("hi"),new String("hi"),new String("ola"),new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ciao"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("ola") },new Integer[] { 3,6,5,7,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,3,6,5,7 },new String[] { new String("hello"),new String("ola"),new String("hi"),new String("hi"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ciao"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 2,3,6,5,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,3,6,5,7 },new String[] { new String("hello"),new String("ola"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ciao"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 5,2,3,6,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,3,6,5,7 },new String[] { new String("hello"),new String("ola"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ciao"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 3,5,2,6,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,2,3,6,5 },new String[] { new String("dobry den"),new String("hello"),new String("ola"),new String("hi"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ola"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 8,3,5,2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,2,3,6,5 },new String[] { new String("dobry den"),new String("hello"),new String("ola"),new String("hi"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ola"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 5,8,3,2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,2,3,6,5 },new String[] { new String("dobry den"),new String("hello"),new String("ola"),new String("hi"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ola"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 5,8,3,2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,2,3,6,5 },new String[] { new String("dobry den"),new String("hello"),new String("ola"),new String("hi"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hallo"),new String("ola"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 5,8,3,2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,12).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,8,2,3,5 },new String[] { new String("zdravo"),new String("dobry den"),new String("hello"),new String("ola"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("namaste"),new String("hola"),new String("hi"),new String("dobry den"),new String("hi"),new String("ola"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 12,5,8,3,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,12,8,3,5 },new String[] { new String("kaixo"),new String("zdravo"),new String("dobry den"),new String("ola"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("hello"),new String("hola"),new String("hi"),new String("dobry den"),new String("hi"),new String("ola"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 9,12,5,8,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,13,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,9,12,8,5 },new String[] { new String("hi"),new String("kaixo"),new String("zdravo"),new String("dobry den"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("hello"),new String("ola"),new String("hi"),new String("dobry den"),new String("hi"),new String("ola"),new String("privet"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 13,9,12,5,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,13,9,12,5 },new String[] { new String("hola"),new String("hi"),new String("kaixo"),new String("zdravo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("rimaykullayki"),new String("hello"),new String("ola"),new String("hi"),new String("dobry den"),new String("hi"),new String("ola"),new String("dobry den"),new String("salaam"),new String("hej"),new String("hello"),new String("zdravo"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 4,13,9,12,5 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_43")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_44 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_44")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("ola") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4 },new String[] { new String("dobry den") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("ola") },new Integer[] { 4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4 },new String[] { new String("namaste"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("ola") },new Integer[] { 3,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3 },new String[] { new String("zdravo"),new String("namaste") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("ciao"),new String("dobry den"),new String("zdravo"),new String("ola") },new Integer[] { 5,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3 },new String[] { new String("zdravo"),new String("namaste") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("ciao"),new String("dobry den"),new String("zdravo"),new String("ola") },new Integer[] { 3,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,3 },new String[] { new String("ola"),new String("namaste") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("ciao"),new String("dobry den"),new String("zdravo"),new String("ola") },new Integer[] { 6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("privet"),new String("ola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("dobry den"),new String("zdravo"),new String("ola") },new Integer[] { 4,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("hej"),new String("ola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("dobry den"),new String("zdravo"),new String("ola") },new Integer[] { 4,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("kaixo"),new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("dobry den"),new String("zdravo"),new String("ola") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("kaixo"),new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("dobry den"),new String("zdravo"),new String("ola") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,2 },new String[] { new String("ola"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 6,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("hallo"),new String("ola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 4,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("kaixo"),new String("hallo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("kaixo"),new String("hallo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("hej"),new String("zdravo"),new String("ola") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,2 },new String[] { new String("zdravo"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("hallo"),new String("zdravo"),new String("ola") },new Integer[] { 5,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,5 },new String[] { new String("hei"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("hallo"),new String("zdravo"),new String("ola") },new Integer[] { 1000,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1000 },new String[] { new String("kaixo"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("hallo"),new String("zdravo"),new String("ola") },new Integer[] { 2,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1000 },new String[] { new String("kaixo"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("hallo"),new String("zdravo"),new String("ola") },new Integer[] { 2,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,2 },new String[] { new String("kaixo"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("hallo"),new String("zdravo"),new String("ola"),new String("hei") },new Integer[] { 1,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,2 },new String[] { new String("kaixo"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("hi"),new String("kaixo"),new String("namaste"),new String("hallo"),new String("zdravo"),new String("ola"),new String("hei") },new Integer[] { 2,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,2 },new String[] { new String("namaste"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("kaixo"),new String("kaixo"),new String("namaste"),new String("hallo"),new String("zdravo"),new String("ola"),new String("hei") },new Integer[] { 6,2 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_44")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_45 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_45")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("salaam"),new String("hei") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,15).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 15 },new String[] { new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("salaam"),new String("hei") },new Integer[] { 15 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,12).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,15 },new String[] { new String("kaixo"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("salaam"),new String("hei") },new Integer[] { 12,15 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,13,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,12,15 },new String[] { new String("kaixo"),new String("kaixo"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("salaam"),new String("hei") },new Integer[] { 13,12,15 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,12,15 },new String[] { new String("kaixo"),new String("kaixo"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("salaam"),new String("hei") },new Integer[] { 13,12,15 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,13,12,15 },new String[] { new String("hello"),new String("kaixo"),new String("kaixo"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("salaam"),new String("hei") },new Integer[] { 10,13,12,15 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,10,13,12,15 },new String[] { new String("hei"),new String("hello"),new String("kaixo"),new String("kaixo"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("salaam"),new String("hei") },new Integer[] { 9,10,13,12,15 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,14,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 14,9,10,13,12 },new String[] { new String("hola"),new String("hei"),new String("hello"),new String("kaixo"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("salaam"),new String("hei") },new Integer[] { 14,9,10,13,12 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,14,9,10,13 },new String[] { new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hello"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("salaam"),new String("hei") },new Integer[] { 3,14,9,10,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,14).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,14,9,10,13 },new String[] { new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hello"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("salaam"),new String("hei") },new Integer[] { 14,3,9,10,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,14,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,14,9,10,13 },new String[] { new String("rimaykullayki"),new String("dobry den"),new String("hei"),new String("hello"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("bon dia"),new String("salaam"),new String("hei") },new Integer[] { 14,3,9,10,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,3,14,9,10 },new String[] { new String("privet"),new String("rimaykullayki"),new String("dobry den"),new String("hei"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hallo"),new String("zdravo"),new String("kaixo"),new String("kaixo"),new String("salaam"),new String("hei") },new Integer[] { 6,14,3,9,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,6,3,14,9 },new String[] { new String("hallo"),new String("privet"),new String("rimaykullayki"),new String("dobry den"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("kaixo"),new String("salaam"),new String("hei") },new Integer[] { 1000,6,14,3,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,14,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,6,3,14,9 },new String[] { new String("hallo"),new String("privet"),new String("rimaykullayki"),new String("dobry den"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("ciao"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("kaixo"),new String("salaam"),new String("hei") },new Integer[] { 14,1000,6,3,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,1000,6,3,14 },new String[] { new String("hello"),new String("hallo"),new String("privet"),new String("rimaykullayki"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("hei"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("kaixo"),new String("salaam"),new String("hei") },new Integer[] { 10,14,1000,6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,12).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,10,1000,6,14 },new String[] { new String("kaixo"),new String("hello"),new String("hallo"),new String("privet"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("namaste"),new String("hej"),new String("hola"),new String("hei"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("kaixo"),new String("salaam"),new String("hei") },new Integer[] { 12,10,14,1000,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,13).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,12,10,1000,14 },new String[] { new String("kaixo"),new String("kaixo"),new String("hello"),new String("hallo"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("privet"),new String("hej"),new String("hola"),new String("hei"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("kaixo"),new String("salaam"),new String("hei") },new Integer[] { 13,12,10,14,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,12,10,1000,14 },new String[] { new String("kaixo"),new String("kaixo"),new String("hello"),new String("hallo"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("privet"),new String("hej"),new String("hola"),new String("hei"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("kaixo"),new String("salaam"),new String("hei") },new Integer[] { 10,13,12,14,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,13,12,10,14 },new String[] { new String("ola"),new String("kaixo"),new String("kaixo"),new String("hello"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1000 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("privet"),new String("hej"),new String("hola"),new String("hei"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("kaixo"),new String("salaam"),new String("hei"),new String("hallo") },new Integer[] { 4,10,13,12,14 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,4,13,12,10 },new String[] { new String("bon dia"),new String("ola"),new String("kaixo"),new String("kaixo"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1000 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("privet"),new String("hej"),new String("hola"),new String("hei"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("kaixo"),new String("dobry den"),new String("hei"),new String("hallo") },new Integer[] { 1,4,10,13,12 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,1,4,13,10 },new String[] { new String("hola"),new String("bon dia"),new String("ola"),new String("kaixo"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1000 },new String[] { new String("hi"),new String("privet"),new String("rimaykullayki"),new String("ola"),new String("dobry den"),new String("privet"),new String("hej"),new String("hola"),new String("hei"),new String("hello"),new String("zdravo"),new String("kaixo"),new String("kaixo"),new String("dobry den"),new String("hei"),new String("hallo") },new Integer[] { 9,1,4,10,13 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_45")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_46 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_46")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("salaam"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("ola"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6 },new String[] { new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("salaam"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("ola"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,6 },new String[] { new String("hi"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("salaam"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("ola"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 5,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,5,6 },new String[] { new String("bon dia"),new String("hi"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("salaam"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("ola"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 1,5,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,11,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,1,5,6 },new String[] { new String("hi"),new String("bon dia"),new String("hi"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("salaam"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("ola"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 11,1,5,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,11,1,5,6 },new String[] { new String("hi"),new String("hi"),new String("bon dia"),new String("hi"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("salaam"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("ola"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 3,11,1,5,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,11,1,5,6 },new String[] { new String("hi"),new String("hi"),new String("bon dia"),new String("hi"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("salaam"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("ola"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 6,3,11,1,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,11,1,5,6 },new String[] { new String("hi"),new String("hi"),new String("bon dia"),new String("hi"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("salaam"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("ola"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 1,6,3,11,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,3,11,1,6 },new String[] { new String("kaixo"),new String("hi"),new String("hi"),new String("bon dia"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("ola"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 10,1,6,3,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,10,3,1,6 },new String[] { new String("bon dia"),new String("kaixo"),new String("hi"),new String("bon dia"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("hi"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 9,10,1,6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,10,3,1,6 },new String[] { new String("bon dia"),new String("kaixo"),new String("hi"),new String("ola"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("hi"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 1,9,10,6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,11).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,9,10,1,6 },new String[] { new String("hi"),new String("bon dia"),new String("kaixo"),new String("ola"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hei"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("hi"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 11,1,9,10,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,14,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 14,11,9,10,1 },new String[] { new String("hei"),new String("hi"),new String("bon dia"),new String("kaixo"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("hi"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 14,11,1,9,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,11).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 14,11,9,10,1 },new String[] { new String("hei"),new String("hi"),new String("bon dia"),new String("kaixo"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("hola"),new String("rimaykullayki"),new String("hi"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 11,14,1,9,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,13).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 13,14,11,9,1 },new String[] { new String("zdravo"),new String("hei"),new String("hi"),new String("bon dia"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("hola"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 13,11,14,1,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,13,14,11,1 },new String[] { new String("hola"),new String("zdravo"),new String("hei"),new String("hi"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("bon dia"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 6,13,11,14,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,6,13,14,11 },new String[] { new String("dobry den"),new String("hola"),new String("zdravo"),new String("hei"),new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("ola"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hello"),new String("hallo") },new Integer[] { 2,6,13,11,14 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,2,6,13,11 },new String[] { new String("kaixo"),new String("dobry den"),new String("hola"),new String("zdravo"),new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("ola"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hei"),new String("hallo") },new Integer[] { 10,2,6,13,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,10,2,6,13 },new String[] { new String("hej"),new String("kaixo"),new String("dobry den"),new String("hola"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("ola"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hei"),new String("hallo") },new Integer[] { 1,10,2,6,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,10,2,6,13 },new String[] { new String("hej"),new String("kaixo"),new String("dobry den"),new String("hola"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("ola"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hei"),new String("hallo") },new Integer[] { 1,10,2,6,13 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,1,10,2,6 },new String[] { new String("hello"),new String("hej"),new String("kaixo"),new String("dobry den"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("ola"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hei"),new String("hallo") },new Integer[] { 7,1,10,2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,7,1,10,2 },new String[] { new String("hi"),new String("hello"),new String("hej"),new String("kaixo"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("ola"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hei"),new String("hallo") },new Integer[] { 3,7,1,10,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,14,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 14,3,7,1,10 },new String[] { new String("hola"),new String("hi"),new String("hello"),new String("hej"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("ola"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hei"),new String("hallo") },new Integer[] { 14,3,7,1,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 14,3,7,1,10 },new String[] { new String("hola"),new String("hi"),new String("hei"),new String("hej"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("ola"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hei"),new String("hallo") },new Integer[] { 7,14,3,1,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,11,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,14,3,7,1 },new String[] { new String("ola"),new String("hola"),new String("hi"),new String("hei"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("ola"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hei"),new String("hallo") },new Integer[] { 11,7,14,3,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,12,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,11,14,3,7 },new String[] { new String("hallo"),new String("ola"),new String("hola"),new String("hi"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hej"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hei"),new String("hallo") },new Integer[] { 12,11,7,14,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,11,14,3,7 },new String[] { new String("hallo"),new String("ola"),new String("hola"),new String("hi"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hej"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hei"),new String("hallo") },new Integer[] { 3,12,11,7,14 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,12,11,3,7 },new String[] { new String("zdravo"),new String("hallo"),new String("ola"),new String("hi"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hej"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hola"),new String("hallo") },new Integer[] { 4,3,12,11,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,12,11,3,7 },new String[] { new String("hej"),new String("hallo"),new String("ola"),new String("hi"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { new String("hej"),new String("dobry den"),new String("hi"),new String("ciao"),new String("hi"),new String("hola"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("hi"),new String("hej"),new String("zdravo"),new String("hola"),new String("hallo") },new Integer[] { 4,3,12,11,7 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_46")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_47 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_47")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("zdravo"),new String("privet"),new String("hej"),new String("ciao"),new String("dobry den"),new String("hello") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3 },new String[] { new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("zdravo"),new String("privet"),new String("hej"),new String("ciao"),new String("dobry den"),new String("hello") },new Integer[] { 3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3 },new String[] { new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("zdravo"),new String("privet"),new String("hej"),new String("ciao"),new String("dobry den"),new String("hello") },new Integer[] { 3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,3 },new String[] { new String("kaixo"),new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("zdravo"),new String("privet"),new String("hej"),new String("ciao"),new String("dobry den"),new String("hello") },new Integer[] { 2,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,2 },new String[] { new String("hi"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("zdravo"),new String("privet"),new String("hej"),new String("ciao"),new String("dobry den"),new String("hello") },new Integer[] { 1,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,2 },new String[] { new String("hi"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("zdravo"),new String("privet"),new String("hej"),new String("ciao"),new String("dobry den"),new String("hello") },new Integer[] { 1,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1 },new String[] { new String("kaixo"),new String("hi") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("zdravo"),new String("kaixo"),new String("hej"),new String("ciao"),new String("dobry den"),new String("hello") },new Integer[] { 3,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,3 },new String[] { new String("kaixo"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("hej"),new String("ciao"),new String("dobry den"),new String("hello") },new Integer[] { 6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("bon dia"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("kaixo"),new String("ciao"),new String("dobry den"),new String("hello") },new Integer[] { 4,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("salaam"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("kaixo"),new String("ciao"),new String("dobry den"),new String("kaixo") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("salaam"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("kaixo"),new String("ciao"),new String("dobry den"),new String("kaixo") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,2 },new String[] { new String("bon dia"),new String("salaam") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("kaixo"),new String("kaixo"),new String("bon dia"),new String("dobry den"),new String("kaixo") },new Integer[] { 1,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1 },new String[] { new String("bon dia"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hi"),new String("salaam"),new String("kaixo"),new String("bon dia"),new String("dobry den"),new String("kaixo") },new Integer[] { 4,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4 },new String[] { new String("kaixo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("salaam"),new String("kaixo"),new String("bon dia"),new String("dobry den"),new String("kaixo") },new Integer[] { 3,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,3 },new String[] { new String("bon dia"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("salaam"),new String("kaixo"),new String("bon dia"),new String("dobry den"),new String("kaixo") },new Integer[] { 1,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1 },new String[] { new String("salaam"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("salaam"),new String("kaixo"),new String("bon dia"),new String("dobry den"),new String("kaixo") },new Integer[] { 2,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,2 },new String[] { new String("salaam"),new String("salaam") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("salaam"),new String("kaixo"),new String("bon dia"),new String("dobry den"),new String("kaixo") },new Integer[] { 3,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,2 },new String[] { new String("bon dia"),new String("salaam") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("salaam"),new String("kaixo"),new String("bon dia"),new String("dobry den"),new String("kaixo") },new Integer[] { 3,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,3 },new String[] { new String("zdravo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("salaam"),new String("kaixo"),new String("bon dia"),new String("dobry den"),new String("kaixo") },new Integer[] { 6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,3 },new String[] { new String("zdravo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("salaam"),new String("kaixo"),new String("bon dia"),new String("dobry den"),new String("kaixo") },new Integer[] { 3,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,3 },new String[] { new String("hej"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("salaam"),new String("kaixo"),new String("bon dia"),new String("dobry den"),new String("zdravo") },new Integer[] { 1,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1 },new String[] { new String("bon dia"),new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("salaam"),new String("bon dia"),new String("bon dia"),new String("dobry den"),new String("zdravo") },new Integer[] { 4,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("salaam"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hej"),new String("salaam"),new String("bon dia"),new String("bon dia"),new String("dobry den"),new String("zdravo") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,2 },new String[] { new String("dobry den"),new String("salaam") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hej"),new String("salaam"),new String("bon dia"),new String("bon dia"),new String("dobry den"),new String("zdravo") },new Integer[] { 3,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,3 },new String[] { new String("hej"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hej"),new String("salaam"),new String("bon dia"),new String("bon dia"),new String("dobry den"),new String("zdravo") },new Integer[] { 1,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1 },new String[] { new String("bon dia"),new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hej"),new String("salaam"),new String("dobry den"),new String("bon dia"),new String("dobry den"),new String("zdravo") },new Integer[] { 4,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("salaam"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hej"),new String("salaam"),new String("dobry den"),new String("bon dia"),new String("dobry den"),new String("zdravo") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("salaam"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hej"),new String("salaam"),new String("dobry den"),new String("bon dia"),new String("dobry den"),new String("zdravo") },new Integer[] { 4,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("salaam"),new String("salaam") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hej"),new String("salaam"),new String("dobry den"),new String("bon dia"),new String("dobry den"),new String("zdravo") },new Integer[] { 4,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4 },new String[] { new String("hello"),new String("salaam") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hej"),new String("salaam"),new String("dobry den"),new String("bon dia"),new String("dobry den"),new String("zdravo") },new Integer[] { 3,4 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_47")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_48 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_48")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("dobry den"),new String("privet"),new String("ciao"),new String("hei") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1 },new String[] { new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("dobry den"),new String("privet"),new String("ciao"),new String("hei") },new Integer[] { 1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1 },new String[] { new String("rimaykullayki"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("dobry den"),new String("privet"),new String("ciao"),new String("hei") },new Integer[] { 4,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,4,1 },new String[] { new String("privet"),new String("rimaykullayki"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("dobry den"),new String("privet"),new String("ciao"),new String("hei") },new Integer[] { 10,4,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,11,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,10,4,1 },new String[] { new String("hej"),new String("privet"),new String("rimaykullayki"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("dobry den"),new String("privet"),new String("ciao"),new String("hei") },new Integer[] { 11,10,4,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,11,10,4 },new String[] { new String("hi"),new String("hej"),new String("privet"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("dobry den"),new String("privet"),new String("ciao"),new String("hei") },new Integer[] { 9,11,10,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,11,10,4 },new String[] { new String("hi"),new String("hej"),new String("privet"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("dobry den"),new String("privet"),new String("ciao"),new String("hei") },new Integer[] { 9,11,10,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,11,10,4 },new String[] { new String("hi"),new String("hej"),new String("privet"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("dobry den"),new String("privet"),new String("ciao"),new String("hei") },new Integer[] { 10,9,11,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,9,11,10 },new String[] { new String("hola"),new String("hi"),new String("hej"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("dobry den"),new String("privet"),new String("ciao"),new String("hei") },new Integer[] { 5,10,9,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,12).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,5,9,10 },new String[] { new String("hei"),new String("hola"),new String("hi"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("dobry den"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 12,5,10,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,12,5,10 },new String[] { new String("hola"),new String("hei"),new String("hola"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 4,12,5,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,4,12,5 },new String[] { new String("ciao"),new String("hola"),new String("hei"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 7,4,12,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,4,12,5 },new String[] { new String("ciao"),new String("hola"),new String("hei"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 5,7,4,12 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,11).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,7,4,5 },new String[] { new String("hej"),new String("ciao"),new String("hola"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 11,5,7,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,11,7,5 },new String[] { new String("hej"),new String("hej"),new String("ciao"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hola"),new String("hola"),new String("hej"),new String("kaixo"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 6,11,5,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,6,11,5 },new String[] { new String("hallo"),new String("hej"),new String("hej"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hola"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 3,6,11,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,3,6,11 },new String[] { new String("salaam"),new String("hallo"),new String("hej"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hola"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 2,3,6,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,12).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,2,3,6 },new String[] { new String("hei"),new String("salaam"),new String("hallo"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hola"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 12,2,3,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 12,2,3,6 },new String[] { new String("hei"),new String("salaam"),new String("hallo"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hola"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 3,12,2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,12,2,3 },new String[] { new String("hi"),new String("hei"),new String("salaam"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hola"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 4,3,12,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,12,2,3 },new String[] { new String("hi"),new String("hei"),new String("salaam"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hola"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 3,4,12,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,11).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,4,12,3 },new String[] { new String("hej"),new String("hi"),new String("hei"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hola"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 11,3,4,12 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 11,4,12,3 },new String[] { new String("hej"),new String("hi"),new String("hei"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hola"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 3,11,4,12 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,11,4,3 },new String[] { new String("salaam"),new String("hej"),new String("hi"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hola"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 2,3,11,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,2,11,3 },new String[] { new String("zdravo"),new String("salaam"),new String("hej"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hi"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 7,2,3,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,2,11,3 },new String[] { new String("privet"),new String("salaam"),new String("hej"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hi"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 7,2,3,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,2,11,3 },new String[] { new String("privet"),new String("salaam"),new String("hej"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hi"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 3,7,2,11 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,7,2,3 },new String[] { new String("hej"),new String("privet"),new String("salaam"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hi"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 6,3,7,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,6,7,3 },new String[] { new String("salaam"),new String("hej"),new String("privet"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hi"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 10,6,3,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,6,7,3 },new String[] { new String("salaam"),new String("hej"),new String("privet"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { new String("zdravo"),new String("salaam"),new String("hallo"),new String("hi"),new String("hola"),new String("hej"),new String("ciao"),new String("hi"),new String("hi"),new String("privet"),new String("hej"),new String("hei") },new Integer[] { 3,10,6,7 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_48")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_49 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_49") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_49")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9 },new String[] { new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,9 },new String[] { new String("hej"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 8,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,8,9 },new String[] { new String("ciao"),new String("hej"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 5,8,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,5,8 },new String[] { new String("dobry den"),new String("ciao"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 7,5,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,5,8 },new String[] { new String("dobry den"),new String("ciao"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 7,5,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,5,8 },new String[] { new String("dobry den"),new String("ciao"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 8,7,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,5,8 },new String[] { new String("dobry den"),new String("ciao"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 8,7,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,5,8 },new String[] { new String("dobry den"),new String("ciao"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 5,8,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5,8 },new String[] { new String("salaam"),new String("ciao"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 2,5,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,2,5 },new String[] { new String("hei"),new String("salaam"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("bon dia"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 7,2,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,7,2 },new String[] { new String("privet"),new String("hei"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 3,7,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,7,2 },new String[] { new String("privet"),new String("hei"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("ciao"),new String("privet"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 7,3,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,3,7 },new String[] { new String("zdravo"),new String("privet"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("salaam"),new String("privet"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 9,7,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,3,7 },new String[] { new String("rimaykullayki"),new String("privet"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("salaam"),new String("privet"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 9,7,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,9,7 },new String[] { new String("hei"),new String("rimaykullayki"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("salaam"),new String("privet"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("dobry den"),new String("hej"),new String("zdravo") },new Integer[] { 1,9,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1,9 },new String[] { new String("rimaykullayki"),new String("hei"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("salaam"),new String("privet"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("hei"),new String("hej"),new String("zdravo") },new Integer[] { 2,1,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,2,1 },new String[] { new String("hi"),new String("rimaykullayki"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hallo"),new String("salaam"),new String("privet"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("hei"),new String("hej"),new String("rimaykullayki") },new Integer[] { 3,2,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,3,2 },new String[] { new String("kaixo"),new String("hi"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("salaam"),new String("privet"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("hei"),new String("hej"),new String("rimaykullayki") },new Integer[] { 6,3,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,6,3 },new String[] { new String("hei"),new String("kaixo"),new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("rimaykullayki"),new String("privet"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("hei"),new String("hej"),new String("rimaykullayki") },new Integer[] { 7,6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,7,6 },new String[] { new String("ciao"),new String("hei"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("hei"),new String("hej"),new String("rimaykullayki") },new Integer[] { 5,7,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,5,7 },new String[] { new String("hej"),new String("ciao"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("hei"),new String("hej"),new String("rimaykullayki") },new Integer[] { 8,5,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,5,7 },new String[] { new String("hej"),new String("ciao"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("hei"),new String("hej"),new String("rimaykullayki") },new Integer[] { 7,8,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,5,7 },new String[] { new String("hej"),new String("ciao"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("hei"),new String("hej"),new String("rimaykullayki") },new Integer[] { 7,8,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,5,7 },new String[] { new String("hej"),new String("dobry den"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("hei"),new String("hej"),new String("rimaykullayki") },new Integer[] { 5,7,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,5,7 },new String[] { new String("ciao"),new String("dobry den"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("hei"),new String("hej"),new String("rimaykullayki") },new Integer[] { 8,5,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,8,5 },new String[] { new String("namaste"),new String("ciao"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("ciao"),new String("kaixo"),new String("hei"),new String("hej"),new String("rimaykullayki") },new Integer[] { 4,8,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,4,8 },new String[] { new String("ola"),new String("namaste"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("dobry den"),new String("kaixo"),new String("hei"),new String("hej"),new String("rimaykullayki") },new Integer[] { 1,4,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,1,4 },new String[] { new String("rimaykullayki"),new String("ola"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("dobry den"),new String("kaixo"),new String("hei"),new String("ciao"),new String("rimaykullayki") },new Integer[] { 9,1,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,9,1 },new String[] { new String("rimaykullayki"),new String("rimaykullayki"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hei"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("dobry den"),new String("kaixo"),new String("hei"),new String("ciao"),new String("rimaykullayki") },new Integer[] { 2,9,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,2,9 },new String[] { new String("ola"),new String("rimaykullayki"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("ola"),new String("rimaykullayki"),new String("hi"),new String("namaste"),new String("dobry den"),new String("kaixo"),new String("hei"),new String("ciao"),new String("rimaykullayki") },new Integer[] { 6,2,9 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_49")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_50 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_50") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_50")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hi"),new String("salaam"),new String("zdravo"),new String("ola"),new String("hei"),new String("privet") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2 },new String[] { new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hi"),new String("salaam"),new String("zdravo"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,2 },new String[] { new String("zdravo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hi"),new String("salaam"),new String("zdravo"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 3,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,3,2 },new String[] { new String("bon dia"),new String("zdravo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("hallo"),new String("namaste"),new String("hi"),new String("salaam"),new String("zdravo"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 1,3,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,1,3 },new String[] { new String("ciao"),new String("bon dia"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("hola"),new String("namaste"),new String("hi"),new String("salaam"),new String("zdravo"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 6,1,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,1,3 },new String[] { new String("ciao"),new String("bon dia"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("dobry den"),new String("hola"),new String("namaste"),new String("hi"),new String("salaam"),new String("zdravo"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 3,6,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,6,3 },new String[] { new String("salaam"),new String("ciao"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("namaste"),new String("hi"),new String("salaam"),new String("zdravo"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 5,3,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5,3 },new String[] { new String("hola"),new String("salaam"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("namaste"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 2,5,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,2,5 },new String[] { new String("ciao"),new String("hola"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 6,2,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,6,2 },new String[] { new String("privet"),new String("ciao"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 9,6,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,9,6 },new String[] { new String("bon dia"),new String("privet"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 1,9,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,9,6 },new String[] { new String("bon dia"),new String("privet"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 9,1,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,9,6 },new String[] { new String("bon dia"),new String("hi"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 9,1,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,9,6 },new String[] { new String("bon dia"),new String("hi"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 1,9,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,9,6 },new String[] { new String("bon dia"),new String("hi"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("privet") },new Integer[] { 6,1,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1,6 },new String[] { new String("ciao"),new String("bon dia"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("hi") },new Integer[] { 2,6,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1,6 },new String[] { new String("ciao"),new String("bon dia"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("hi") },new Integer[] { 6,2,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1,6 },new String[] { new String("ciao"),new String("bon dia"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("hola"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("hi") },new Integer[] { 1,6,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,1,6 },new String[] { new String("hi"),new String("bon dia"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("hi") },new Integer[] { 9,1,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,9,1 },new String[] { new String("zdravo"),new String("hi"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("hi") },new Integer[] { 3,9,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,3,9 },new String[] { new String("hej"),new String("zdravo"),new String("hi") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("hi") },new Integer[] { 1000,3,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,1000,3 },new String[] { new String("privet"),new String("hej"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("hi") },new Integer[] { 8,1000,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,8,1000 },new String[] { new String("salaam"),new String("privet"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("hi") },new Integer[] { 5,8,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,5,8 },new String[] { new String("bon dia"),new String("salaam"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("hei"),new String("hi"),new String("hej") },new Integer[] { 1,5,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,1,5 },new String[] { new String("namaste"),new String("bon dia"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("privet"),new String("hi"),new String("hej") },new Integer[] { 1000,1,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1000,1 },new String[] { new String("hi"),new String("namaste"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("privet"),new String("hi"),new String("hej") },new Integer[] { 4,1000,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1000,1 },new String[] { new String("hi"),new String("namaste"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("privet"),new String("hi"),new String("hej") },new Integer[] { 1000,4,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,4,1000 },new String[] { new String("privet"),new String("hi"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("privet"),new String("hi"),new String("hej") },new Integer[] { 5,1000,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,5,1000 },new String[] { new String("privet"),new String("privet"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("privet"),new String("hi"),new String("hej") },new Integer[] { 8,5,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,5,1000 },new String[] { new String("privet"),new String("salaam"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("privet"),new String("hi"),new String("hej") },new Integer[] { 5,8,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,8,5 },new String[] { new String("ciao"),new String("privet"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("privet"),new String("hi"),new String("namaste") },new Integer[] { 4,5,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,8,5 },new String[] { new String("ciao"),new String("privet"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("privet"),new String("hi"),new String("namaste") },new Integer[] { 4,5,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,4,5 },new String[] { new String("hi"),new String("ciao"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("privet"),new String("hi"),new String("namaste") },new Integer[] { 10,4,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,10,4 },new String[] { new String("hi"),new String("hi"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("bon dia"),new String("ciao"),new String("zdravo"),new String("hi"),new String("salaam"),new String("ciao"),new String("ola"),new String("privet"),new String("hi"),new String("namaste") },new Integer[] { 9,10,4 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_50")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_51 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_51") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_51")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("zdravo"),new String("privet"),new String("ciao"),new String("hola") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9 },new String[] { new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("zdravo"),new String("privet"),new String("ciao"),new String("hola") },new Integer[] { 9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,9 },new String[] { new String("bon dia"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("zdravo"),new String("privet"),new String("ciao"),new String("hola") },new Integer[] { 7,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,7,9 },new String[] { new String("salaam"),new String("bon dia"),new String("hola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("zdravo"),new String("privet"),new String("ciao"),new String("hola") },new Integer[] { 6,7,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6,7 },new String[] { new String("ola"),new String("salaam"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("zdravo"),new String("privet"),new String("ciao"),new String("hola") },new Integer[] { 4,6,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6,7 },new String[] { new String("ola"),new String("salaam"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("zdravo"),new String("privet"),new String("ciao"),new String("hola") },new Integer[] { 7,4,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4,7 },new String[] { new String("hallo"),new String("ola"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("privet"),new String("ciao"),new String("hola") },new Integer[] { 2,7,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,2,7 },new String[] { new String("dobry den"),new String("hallo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("privet"),new String("ciao"),new String("hola") },new Integer[] { 3,2,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,3,2 },new String[] { new String("salaam"),new String("dobry den"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola") },new Integer[] { 6,3,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,6,3 },new String[] { new String("hej"),new String("salaam"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola") },new Integer[] { 1,6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1,6 },new String[] { new String("hallo"),new String("hej"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola") },new Integer[] { 2,1,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,2,1 },new String[] { new String("zdravo"),new String("hallo"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola") },new Integer[] { 1000,2,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,2,1 },new String[] { new String("zdravo"),new String("hei"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola") },new Integer[] { 2,1000,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,1000,2 },new String[] { new String("hello"),new String("zdravo"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola") },new Integer[] { 5,2,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,5,2 },new String[] { new String("hej"),new String("hello"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 1,5,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,5,2 },new String[] { new String("hej"),new String("hello"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 2,1,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,5,2 },new String[] { new String("hej"),new String("hello"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 2,1,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,5,2 },new String[] { new String("hej"),new String("hello"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 5,2,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,5,2 },new String[] { new String("hej"),new String("hello"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("hallo"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 1,5,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,1,5 },new String[] { new String("hi"),new String("hej"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("namaste"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 6,1,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,6,1 },new String[] { new String("hola"),new String("hi"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("namaste"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 9,6,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,6,1 },new String[] { new String("hola"),new String("hi"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("namaste"),new String("dobry den"),new String("ola"),new String("hello"),new String("salaam"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 1,9,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,9,1 },new String[] { new String("privet"),new String("hola"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("namaste"),new String("dobry den"),new String("ola"),new String("hello"),new String("hi"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 5,1,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,5,1 },new String[] { new String("kaixo"),new String("privet"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("namaste"),new String("dobry den"),new String("ola"),new String("hello"),new String("hi"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 3,5,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,3,5 },new String[] { new String("salaam"),new String("kaixo"),new String("privet") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("namaste"),new String("dobry den"),new String("ola"),new String("hello"),new String("hi"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 2,3,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,2,3 },new String[] { new String("hej"),new String("salaam"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("namaste"),new String("dobry den"),new String("ola"),new String("privet"),new String("hi"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 7,2,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,7,2 },new String[] { new String("hej"),new String("hej"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("namaste"),new String("kaixo"),new String("ola"),new String("privet"),new String("hi"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 10,7,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,10,7 },new String[] { new String("kaixo"),new String("hej"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("salaam"),new String("kaixo"),new String("ola"),new String("privet"),new String("hi"),new String("bon dia"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 3,10,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,3,10 },new String[] { new String("ola"),new String("kaixo"),new String("hej") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("hej"),new String("salaam"),new String("kaixo"),new String("ola"),new String("privet"),new String("hi"),new String("hej"),new String("ciao"),new String("hola"),new String("zdravo") },new Integer[] { 4,3,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,4,3 },new String[] { new String("hej"),new String("ola"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000,10 },new String[] { new String("hej"),new String("salaam"),new String("kaixo"),new String("ola"),new String("privet"),new String("hi"),new String("hej"),new String("ciao"),new String("hola"),new String("zdravo"),new String("hej") },new Integer[] { 7,4,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,4,3 },new String[] { new String("hej"),new String("ola"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000,10 },new String[] { new String("hej"),new String("salaam"),new String("kaixo"),new String("ola"),new String("privet"),new String("hi"),new String("hej"),new String("ciao"),new String("hola"),new String("zdravo"),new String("hej") },new Integer[] { 4,7,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,4,3 },new String[] { new String("hej"),new String("ola"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000,10 },new String[] { new String("hej"),new String("salaam"),new String("kaixo"),new String("ola"),new String("privet"),new String("hi"),new String("hej"),new String("ciao"),new String("hola"),new String("zdravo"),new String("hej") },new Integer[] { 4,7,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,4,3 },new String[] { new String("hej"),new String("ola"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000,10 },new String[] { new String("hej"),new String("salaam"),new String("kaixo"),new String("ola"),new String("privet"),new String("hi"),new String("hej"),new String("ciao"),new String("hola"),new String("zdravo"),new String("hej") },new Integer[] { 3,4,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,4,3 },new String[] { new String("hej"),new String("ciao"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000,10 },new String[] { new String("hej"),new String("salaam"),new String("kaixo"),new String("ola"),new String("privet"),new String("hi"),new String("hej"),new String("ciao"),new String("hola"),new String("zdravo"),new String("hej") },new Integer[] { 4,3,7 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_51")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_52 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_52") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_52")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hello"),new String("salaam"),new String("rimaykullayki"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4 },new String[] { new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hello"),new String("salaam"),new String("rimaykullayki"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") },new Integer[] { 4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,4 },new String[] { new String("hei"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hello"),new String("salaam"),new String("rimaykullayki"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") },new Integer[] { 8,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,8,4 },new String[] { new String("bon dia"),new String("hei"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hello"),new String("salaam"),new String("rimaykullayki"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") },new Integer[] { 3,8,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,8,4 },new String[] { new String("bon dia"),new String("hei"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hello"),new String("salaam"),new String("rimaykullayki"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") },new Integer[] { 3,8,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,3,8 },new String[] { new String("ola"),new String("bon dia"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hello"),new String("salaam"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") },new Integer[] { 1000,3,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1000,3 },new String[] { new String("privet"),new String("ola"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hello"),new String("salaam"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") },new Integer[] { 2,1000,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2,1000 },new String[] { new String("namaste"),new String("privet"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hello"),new String("bon dia"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") },new Integer[] { 4,2,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2,1000 },new String[] { new String("namaste"),new String("privet"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("hello"),new String("bon dia"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") },new Integer[] { 1000,4,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4,1000 },new String[] { new String("ola"),new String("namaste"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("privet"),new String("bon dia"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") },new Integer[] { 3,1000,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,3,1000 },new String[] { new String("rimaykullayki"),new String("ola"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("privet"),new String("bon dia"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") },new Integer[] { 9,3,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,3,1000 },new String[] { new String("rimaykullayki"),new String("kaixo"),new String("ola") },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { new String("namaste"),new String("privet"),new String("bon dia"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo") },new Integer[] { 3,9,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,9,3 },new String[] { new String("hei"),new String("rimaykullayki"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("bon dia"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo"),new String("ola") },new Integer[] { 6,3,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,9,3 },new String[] { new String("hei"),new String("rimaykullayki"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("bon dia"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo"),new String("ola") },new Integer[] { 9,6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,9,3 },new String[] { new String("hei"),new String("rimaykullayki"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("bon dia"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo"),new String("ola") },new Integer[] { 6,9,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,6,9 },new String[] { new String("rimaykullayki"),new String("hei"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("zdravo"),new String("ola") },new Integer[] { 8,6,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("kaixo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,8,6 },new String[] { new String("kaixo"),new String("rimaykullayki"),new String("hei") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("ola"),new String("hola"),new String("hei"),new String("rimaykullayki"),new String("ola") },new Integer[] { 3,8,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,3,8 },new String[] { new String("bon dia"),new String("kaixo"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("hei"),new String("hola"),new String("hei"),new String("rimaykullayki"),new String("ola") },new Integer[] { 9,3,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,9,3 },new String[] { new String("kaixo"),new String("bon dia"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("hei"),new String("hola"),new String("rimaykullayki"),new String("rimaykullayki"),new String("ola") },new Integer[] { 5,9,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,5,9 },new String[] { new String("hallo"),new String("kaixo"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("hei"),new String("hola"),new String("rimaykullayki"),new String("rimaykullayki"),new String("ola") },new Integer[] { 8,5,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,8,5 },new String[] { new String("hello"),new String("hallo"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("bon dia"),new String("hei"),new String("hola"),new String("rimaykullayki"),new String("bon dia"),new String("ola") },new Integer[] { 6,8,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,6,8 },new String[] { new String("hej"),new String("hello"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hei"),new String("hola"),new String("rimaykullayki"),new String("bon dia"),new String("ola") },new Integer[] { 9,6,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,9,6 },new String[] { new String("privet"),new String("hej"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hei"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 2,9,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,9,6 },new String[] { new String("privet"),new String("bon dia"),new String("hello") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hei"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 9,2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2,9 },new String[] { new String("namaste"),new String("privet"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hello"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 4,9,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2,9 },new String[] { new String("namaste"),new String("privet"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hello"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 4,9,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("bon dia")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2,9 },new String[] { new String("namaste"),new String("privet"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hello"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 9,4,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2,9 },new String[] { new String("namaste"),new String("namaste"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hello"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 2,9,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2,9 },new String[] { new String("namaste"),new String("namaste"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hello"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 2,9,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2,9 },new String[] { new String("namaste"),new String("namaste"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hello"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 9,2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,2,9 },new String[] { new String("hola"),new String("namaste"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hello"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 7,9,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,9).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,2,9 },new String[] { new String("hola"),new String("namaste"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hello"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 9,7,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,2,9 },new String[] { new String("hola"),new String("salaam"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hello"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 2,9,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,2,9 },new String[] { new String("hola"),new String("salaam"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hello"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 2,9,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,2,9 },new String[] { new String("hallo"),new String("salaam"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,7,8,9,1000 },new String[] { new String("namaste"),new String("privet"),new String("kaixo"),new String("namaste"),new String("kaixo"),new String("hello"),new String("hola"),new String("hallo"),new String("bon dia"),new String("ola") },new Integer[] { 10,2,9 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_52")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_53 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_53") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_53")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("ola"),new String("hello"),new String("hi"),new String("hola") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3 },new String[] { new String("zdravo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("ola"),new String("hello"),new String("hi"),new String("hola") },new Integer[] { 3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,3 },new String[] { new String("privet"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("ola"),new String("hello"),new String("hi"),new String("hola") },new Integer[] { 4,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,3 },new String[] { new String("privet"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("ola"),new String("hello"),new String("hi"),new String("hola") },new Integer[] { 3,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,3 },new String[] { new String("hallo"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("ola"),new String("privet"),new String("hi"),new String("hola") },new Integer[] { 6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("hi")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,6 },new String[] { new String("hi"),new String("hallo") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("zdravo"),new String("privet"),new String("hi"),new String("hola") },new Integer[] { 5,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,5 },new String[] { new String("dobry den"),new String("hi") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("zdravo"),new String("privet"),new String("hi"),new String("hallo") },new Integer[] { 1,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,1 },new String[] { new String("hei"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("bon dia"),new String("hallo"),new String("zdravo"),new String("privet"),new String("hi"),new String("hallo") },new Integer[] { 6,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,6 },new String[] { new String("hallo"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("dobry den"),new String("hallo"),new String("zdravo"),new String("privet"),new String("hi"),new String("hallo") },new Integer[] { 2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,6 },new String[] { new String("hallo"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("dobry den"),new String("hallo"),new String("zdravo"),new String("privet"),new String("hi"),new String("hallo") },new Integer[] { 6,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,6 },new String[] { new String("dobry den"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("dobry den"),new String("hallo"),new String("zdravo"),new String("privet"),new String("hi"),new String("hallo") },new Integer[] { 1,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,1 },new String[] { new String("privet"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("dobry den"),new String("hallo"),new String("zdravo"),new String("privet"),new String("hi"),new String("hei") },new Integer[] { 1000,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1000 },new String[] { new String("salaam"),new String("privet") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("dobry den"),new String("hallo"),new String("zdravo"),new String("privet"),new String("hi"),new String("hei") },new Integer[] { 4,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,4 },new String[] { new String("hei"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hallo"),new String("zdravo"),new String("privet"),new String("hi"),new String("hei"),new String("privet") },new Integer[] { 5,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,5 },new String[] { new String("bon dia"),new String("hei") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hallo"),new String("zdravo"),new String("salaam"),new String("hi"),new String("hei"),new String("privet") },new Integer[] { 3,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,3 },new String[] { new String("salaam"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hallo"),new String("zdravo"),new String("salaam"),new String("hei"),new String("hei"),new String("privet") },new Integer[] { 1,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(new String("privet")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,1 },new String[] { new String("privet"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("dobry den"),new String("hallo"),new String("bon dia"),new String("salaam"),new String("hei"),new String("hei"),new String("privet") },new Integer[] { 1000,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,1000 },new String[] { new String("hola"),new String("privet") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("salaam"),new String("hei"),new String("hei"),new String("privet") },new Integer[] { 6,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("salaam"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("salaam"),new String("hei"),new String("hei"),new String("privet") },new Integer[] { 4,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("salaam"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("salaam"),new String("hei"),new String("hei"),new String("privet") },new Integer[] { 6,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,6 },new String[] { new String("privet"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("salaam"),new String("hei"),new String("hei"),new String("privet") },new Integer[] { 5,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,6 },new String[] { new String("hola"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("salaam"),new String("hei"),new String("hei"),new String("privet") },new Integer[] { 5,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,6 },new String[] { new String("hola"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("salaam"),new String("hei"),new String("hei"),new String("privet") },new Integer[] { 6,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("hallo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("salaam"),new String("hola"),new String("hei"),new String("privet") },new Integer[] { 4,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,4 },new String[] { new String("kaixo"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("salaam"),new String("hola"),new String("hola"),new String("privet") },new Integer[] { 5,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5 },new String[] { new String("dobry den"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("hallo"),new String("hola"),new String("hola"),new String("privet") },new Integer[] { 2,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5 },new String[] { new String("dobry den"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("hallo"),new String("hola"),new String("hola"),new String("privet") },new Integer[] { 2,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5 },new String[] { new String("dobry den"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("hallo"),new String("hola"),new String("hola"),new String("privet") },new Integer[] { 2,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,2 },new String[] { new String("salaam"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("hallo"),new String("kaixo"),new String("hola"),new String("privet") },new Integer[] { 1000,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,2 },new String[] { new String("hola"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hallo"),new String("bon dia"),new String("hallo"),new String("kaixo"),new String("hola"),new String("privet") },new Integer[] { 1000,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1000 },new String[] { new String("hej"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("bon dia"),new String("hallo"),new String("kaixo"),new String("hola"),new String("privet") },new Integer[] { 3,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3 },new String[] { new String("rimaykullayki"),new String("hej") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("bon dia"),new String("hallo"),new String("kaixo"),new String("hola"),new String("hola") },new Integer[] { 5,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3 },new String[] { new String("rimaykullayki"),new String("hej") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("bon dia"),new String("hallo"),new String("kaixo"),new String("hola"),new String("hola") },new Integer[] { 5,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("dobry den")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5 },new String[] { new String("dobry den"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("hej"),new String("hallo"),new String("kaixo"),new String("hola"),new String("hola") },new Integer[] { 2,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,5 },new String[] { new String("dobry den"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("hej"),new String("hallo"),new String("kaixo"),new String("hola"),new String("hola") },new Integer[] { 2,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2 },new String[] { new String("hallo"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("hej"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hola") },new Integer[] { 4,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,2 },new String[] { new String("hallo"),new String("dobry den") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("hej"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hola") },new Integer[] { 4,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4 },new String[] { new String("hej"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("hej"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hola") },new Integer[] { 3,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4 },new String[] { new String("namaste"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("hej"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hola") },new Integer[] { 3,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3 },new String[] { new String("namaste"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("hej"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hola") },new Integer[] { 5,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,3 },new String[] { new String("namaste"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("hej"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hola") },new Integer[] { 5,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,5 },new String[] { new String("hallo"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("namaste"),new String("hallo"),new String("rimaykullayki"),new String("hola"),new String("hola") },new Integer[] { 4,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4 },new String[] { new String("namaste"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("namaste"),new String("hallo"),new String("namaste"),new String("hola"),new String("hola") },new Integer[] { 3,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4 },new String[] { new String("namaste"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("namaste"),new String("hallo"),new String("namaste"),new String("hola"),new String("hola") },new Integer[] { 3,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("hallo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,4 },new String[] { new String("namaste"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("namaste"),new String("hallo"),new String("namaste"),new String("hola"),new String("hola") },new Integer[] { 4,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,4 },new String[] { new String("hola"),new String("hallo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("namaste"),new String("hallo"),new String("namaste"),new String("hola"),new String("hola") },new Integer[] { 1000,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1000 },new String[] { new String("hallo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("namaste"),new String("hallo"),new String("namaste"),new String("hola"),new String("hola") },new Integer[] { 2,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1000 },new String[] { new String("ola"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("namaste"),new String("hallo"),new String("namaste"),new String("hola"),new String("hola") },new Integer[] { 2,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,2 },new String[] { new String("salaam"),new String("ola") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("dobry den"),new String("namaste"),new String("hallo"),new String("namaste"),new String("hola"),new String("hola") },new Integer[] { 1,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,1 },new String[] { new String("hei"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("ola"),new String("namaste"),new String("hallo"),new String("namaste"),new String("hola"),new String("hola") },new Integer[] { 5,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,5 },new String[] { new String("namaste"),new String("hei") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("ola"),new String("namaste"),new String("hallo"),new String("namaste"),new String("hola"),new String("hola") },new Integer[] { 6,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,5 },new String[] { new String("namaste"),new String("hei") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("ola"),new String("namaste"),new String("hallo"),new String("namaste"),new String("hola"),new String("hola") },new Integer[] { 6,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,6 },new String[] { new String("namaste"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("ola"),new String("namaste"),new String("hallo"),new String("hei"),new String("hola"),new String("hola") },new Integer[] { 3,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,6 },new String[] { new String("namaste"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("ola"),new String("namaste"),new String("hallo"),new String("hei"),new String("hola"),new String("hola") },new Integer[] { 6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,6 },new String[] { new String("salaam"),new String("namaste") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("ola"),new String("namaste"),new String("hallo"),new String("hei"),new String("hola"),new String("hola") },new Integer[] { 1,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,1 },new String[] { new String("salaam"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("ola"),new String("namaste"),new String("hallo"),new String("hei"),new String("namaste"),new String("hola") },new Integer[] { 1000,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,1 },new String[] { new String("salaam"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("ola"),new String("namaste"),new String("hallo"),new String("hei"),new String("namaste"),new String("hola") },new Integer[] { 1,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("namaste")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,1 },new String[] { new String("namaste"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("ola"),new String("namaste"),new String("hallo"),new String("hei"),new String("namaste"),new String("salaam") },new Integer[] { 6,1 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_53")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_cache_54 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Cache<Integer,String>,Void> v_0 = null ;
Cache<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_cache_54") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_cache_54")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2,new Storage<Integer,String>(new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("kaixo"),new String("hi"),new String("salaam"),new String("ciao"),new String("hallo") })).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] {  },new String[] {  },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("kaixo"),new String("hi"),new String("salaam"),new String("ciao"),new String("hallo") },new Integer[] {  }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("privet")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1 },new String[] { new String("privet") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("kaixo"),new String("hi"),new String("salaam"),new String("ciao"),new String("hallo") },new Integer[] { 1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1 },new String[] { new String("hola"),new String("privet") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("kaixo"),new String("hi"),new String("salaam"),new String("ciao"),new String("hallo") },new Integer[] { 3,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1 },new String[] { new String("hej"),new String("privet") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("hola"),new String("kaixo"),new String("hi"),new String("salaam"),new String("ciao"),new String("hallo") },new Integer[] { 3,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,3 },new String[] { new String("salaam"),new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("kaixo"),new String("hi"),new String("salaam"),new String("ciao"),new String("hallo") },new Integer[] { 4,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,3 },new String[] { new String("salaam"),new String("hej") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("kaixo"),new String("hi"),new String("salaam"),new String("ciao"),new String("hallo") },new Integer[] { 4,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("namaste"),new String("salaam") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("kaixo"),new String("hej"),new String("salaam"),new String("ciao"),new String("hallo") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,2 },new String[] { new String("hei"),new String("namaste") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("kaixo"),new String("hej"),new String("salaam"),new String("ciao"),new String("hallo") },new Integer[] { 5,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,2 },new String[] { new String("ola"),new String("namaste") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("kaixo"),new String("hej"),new String("salaam"),new String("ciao"),new String("hallo") },new Integer[] { 5,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,5 },new String[] { new String("hola"),new String("ola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("namaste"),new String("hej"),new String("salaam"),new String("ciao"),new String("hallo") },new Integer[] { 4,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("namaste")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,4 },new String[] { new String("namaste"),new String("hola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("namaste"),new String("hej"),new String("salaam"),new String("ola"),new String("hallo") },new Integer[] { 6,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,6 },new String[] { new String("hello"),new String("namaste") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("namaste"),new String("hej"),new String("hola"),new String("ola"),new String("hallo") },new Integer[] { 2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,2 },new String[] { new String("ola"),new String("hello") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("namaste"),new String("hej"),new String("hola"),new String("ola"),new String("namaste") },new Integer[] { 5,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("hei")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,5 },new String[] { new String("hei"),new String("ola") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("hello"),new String("hej"),new String("hola"),new String("ola"),new String("namaste") },new Integer[] { 1000,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1000 },new String[] { new String("hej"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("hello"),new String("hej"),new String("hola"),new String("ola"),new String("namaste") },new Integer[] { 3,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1000 },new String[] { new String("hej"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("hello"),new String("hej"),new String("hola"),new String("ola"),new String("namaste") },new Integer[] { 1000,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,3).doCall().checkResult(new String("hej")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1000 },new String[] { new String("hej"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("hello"),new String("hej"),new String("hola"),new String("ola"),new String("namaste") },new Integer[] { 3,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1000 },new String[] { new String("ciao"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("hello"),new String("hej"),new String("hola"),new String("ola"),new String("namaste") },new Integer[] { 3,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,1000 },new String[] { new String("ciao"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("hello"),new String("hej"),new String("hola"),new String("ola"),new String("namaste") },new Integer[] { 1000,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1,new String("salaam")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,1000 },new String[] { new String("salaam"),new String("hei") },new Integer[] { 1,2,3,4,5,6 },new String[] { new String("privet"),new String("hello"),new String("ciao"),new String("hola"),new String("ola"),new String("namaste") },new Integer[] { 1,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,1 },new String[] { new String("ciao"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("privet"),new String("hello"),new String("ciao"),new String("hola"),new String("ola"),new String("namaste"),new String("hei") },new Integer[] { 6,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,6 },new String[] { new String("ola"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("ola"),new String("namaste"),new String("hei") },new Integer[] { 5,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,5 },new String[] { new String("kaixo"),new String("ola") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("ola"),new String("ciao"),new String("hei") },new Integer[] { 7,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,7 },new String[] { new String("ciao"),new String("kaixo") },new Integer[] { 1,2,3,4,5,6,1000 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("ola"),new String("ciao"),new String("hei") },new Integer[] { 6,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("hola"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("ola"),new String("ciao"),new String("hei"),new String("kaixo") },new Integer[] { 4,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,4 },new String[] { new String("hola"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("ola"),new String("ciao"),new String("hei"),new String("kaixo") },new Integer[] { 7,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,4 },new String[] { new String("hola"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("ola"),new String("ciao"),new String("hei"),new String("kaixo") },new Integer[] { 7,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,4 },new String[] { new String("hola"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("ola"),new String("ciao"),new String("hei"),new String("kaixo") },new Integer[] { 7,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("bon dia")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,7 },new String[] { new String("bon dia"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("ola"),new String("ciao"),new String("hei"),new String("kaixo") },new Integer[] { 3,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,3 },new String[] { new String("salaam"),new String("bon dia") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("ola"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 1,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,1 },new String[] { new String("ciao"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("bon dia"),new String("hola"),new String("ola"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 6,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,6 },new String[] { new String("hello"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("bon dia"),new String("hola"),new String("ola"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 2,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,5,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,2 },new String[] { new String("rimaykullayki"),new String("hello") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("bon dia"),new String("hola"),new String("ola"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 5,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,3,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 3,5 },new String[] { new String("ciao"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("bon dia"),new String("hola"),new String("ola"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 3,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,3 },new String[] { new String("ciao"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("bon dia"),new String("hola"),new String("rimaykullayki"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,3 },new String[] { new String("ciao"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("bon dia"),new String("hola"),new String("rimaykullayki"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 6,3 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,6 },new String[] { new String("hola"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 4,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("hello"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,2 },new String[] { new String("rimaykullayki"),new String("hello") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 5,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,5 },new String[] { new String("ciao"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 6,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hallo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,5 },new String[] { new String("hallo"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 6,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,5 },new String[] { new String("hallo"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 6,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,6,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,5 },new String[] { new String("hola"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 6,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("hello")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,6 },new String[] { new String("hello"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("ciao"),new String("hei"),new String("hola") },new Integer[] { 8,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,8 },new String[] { new String("hola"),new String("hello") },new Integer[] { 1,2,3,4,5,6,1000,7 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hola") },new Integer[] { 7,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("hello")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,7 },new String[] { new String("hello"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000,7,8 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hola"),new String("hello") },new Integer[] { 2,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,2 },new String[] { new String("hei"),new String("hello") },new Integer[] { 1,2,3,4,5,6,1000,7,8 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hola"),new String("hello") },new Integer[] { 1000,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,1000 },new String[] { new String("rimaykullayki"),new String("hei") },new Integer[] { 1,2,3,4,5,6,1000,7,8 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hola"),new String("hello") },new Integer[] { 9,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("hi")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,1000 },new String[] { new String("hi"),new String("hei") },new Integer[] { 1,2,3,4,5,6,1000,7,8 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hola"),new String("hello") },new Integer[] { 9,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,8,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,9 },new String[] { new String("zdravo"),new String("hi") },new Integer[] { 1,2,3,4,5,6,1000,7,8 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hola"),new String("hello") },new Integer[] { 8,9 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,4).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,8 },new String[] { new String("hola"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hola"),new String("hello"),new String("hi") },new Integer[] { 4,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,2,new String("rimaykullayki")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,4 },new String[] { new String("rimaykullayki"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hola"),new String("zdravo"),new String("hi") },new Integer[] { 2,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,7,new String("ciao")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,2 },new String[] { new String("ciao"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9 },new String[] { new String("salaam"),new String("hello"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hola"),new String("zdravo"),new String("hi") },new Integer[] { 7,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1).doCall().checkResult(new String("salaam")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1,7 },new String[] { new String("salaam"),new String("ciao") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("hola"),new String("zdravo"),new String("hi") },new Integer[] { 1,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,4,new String("zdravo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 4,1 },new String[] { new String("zdravo"),new String("salaam") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("ciao"),new String("zdravo"),new String("hi") },new Integer[] { 4,1 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(new String("hei")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,4 },new String[] { new String("hei"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("ciao"),new String("zdravo"),new String("hi") },new Integer[] { 1000,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,1000,new String("ola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 1000,4 },new String[] { new String("ola"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("hola"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("ciao"),new String("zdravo"),new String("hi") },new Integer[] { 1000,4 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,10,new String("kaixo")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,1000 },new String[] { new String("kaixo"),new String("ola") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("zdravo"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("ciao"),new String("zdravo"),new String("hi") },new Integer[] { 10,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,1000).doCall().checkResult(new String("ola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 10,1000 },new String[] { new String("kaixo"),new String("ola") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("zdravo"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("ciao"),new String("zdravo"),new String("hi") },new Integer[] { 1000,10 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,2).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 2,1000 },new String[] { new String("rimaykullayki"),new String("ola") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9,10 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("zdravo"),new String("rimaykullayki"),new String("hola"),new String("hei"),new String("ciao"),new String("zdravo"),new String("hi"),new String("kaixo") },new Integer[] { 2,1000 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,5).doCall().checkResult(new String("rimaykullayki")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 5,2 },new String[] { new String("rimaykullayki"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9,10 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("zdravo"),new String("rimaykullayki"),new String("hola"),new String("ola"),new String("ciao"),new String("zdravo"),new String("hi"),new String("kaixo") },new Integer[] { 5,2 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,6).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 6,5 },new String[] { new String("hola"),new String("rimaykullayki") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9,10 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("zdravo"),new String("rimaykullayki"),new String("hola"),new String("ola"),new String("ciao"),new String("zdravo"),new String("hi"),new String("kaixo") },new Integer[] { 6,5 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 8,6 },new String[] { new String("zdravo"),new String("hola") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9,10 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("zdravo"),new String("rimaykullayki"),new String("hola"),new String("ola"),new String("ciao"),new String("zdravo"),new String("hi"),new String("kaixo") },new Integer[] { 8,6 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,7).doCall().checkResult(new String("ciao")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,8 },new String[] { new String("ciao"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9,10 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("zdravo"),new String("rimaykullayki"),new String("hola"),new String("ola"),new String("ciao"),new String("zdravo"),new String("hi"),new String("kaixo") },new Integer[] { 7,8 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,8).doCall().checkResult(new String("zdravo")) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 7,8 },new String[] { new String("ciao"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9,10 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("zdravo"),new String("rimaykullayki"),new String("hola"),new String("ola"),new String("ciao"),new String("zdravo"),new String("hi"),new String("kaixo") },new Integer[] { 8,7 }).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,9,new String("dobry den")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CacheOk(v_1,new Integer[] { 9,8 },new String[] { new String("dobry den"),new String("zdravo") },new Integer[] { 1,2,3,4,5,6,1000,7,8,9,10 },new String[] { new String("salaam"),new String("rimaykullayki"),new String("ciao"),new String("zdravo"),new String("rimaykullayki"),new String("hola"),new String("ola"),new String("ciao"),new String("zdravo"),new String("hi"),new String("kaixo") },new Integer[] { 9,8 }).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_cache_54")) ;
    ResultsHandler.add_result(new String("cache"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab3";
}




static class CacheUtils {
  

  @SuppressWarnings("unchecked")
  public static boolean cacheOk(Cache<Integer,String> cache,
                                Integer[] cacheKeys,
                                String[] cacheValues,
                                Integer[] storageKeys,
                                String[] storageValues,
                                Integer[] lruKeys) {

    boolean ok_sofar = true;

    Map<Integer,CacheCell<Integer,String>> cacheContents =
      (Map<Integer,CacheCell<Integer,String>>) TestUtils.accessAttribute("cacheContents",cache);
    PositionList<Integer> keyListLRU =
      (PositionList<Integer>) TestUtils.accessAttribute("keyListLRU",cache);
    Storage<Integer,String> mainMemory = 
      (Storage<Integer,String>) TestUtils.accessAttribute("mainMemory",cache);

    ok_sofar = ok_sofar && (cacheContents != null) && (keyListLRU != null) && (mainMemory != null);

    ok_sofar =
      ok_sofar &&
      checkLRUandMapStorage(cacheKeys,
                            cacheValues,
                            storageKeys,
                            storageValues,
                            lruKeys,
                            cacheContents,
                            keyListLRU,
                            mainMemory);
    return ok_sofar;
  }

  static boolean checkLRUandMapStorage(Integer[] cacheKeys,
                                       String[] cacheValues,
                                       Integer[] storageKeys,
                                       String[] storageValues,
                                       Integer[] lruKeys,
                                       Map<Integer,CacheCell<Integer,String>> cacheContents,
                                       PositionList<Integer> keyListLRU,
                                       Storage<Integer,String> mainMemory) {
  
    boolean ok_sofar = true;

    if (ok_sofar)
      ok_sofar =
        checkExternallyConsistent(cacheKeys, cacheValues, lruKeys,
                                  cacheContents,
                                  keyListLRU,
                                  mainMemory);

    if (ok_sofar)
      ok_sofar =
        checkStorageExternallyConsistent(storageKeys, storageValues,
                                         cacheContents,
                                         keyListLRU,
                                         mainMemory);

    return ok_sofar;
  }

  static boolean checkExternallyConsistent(Integer[] cacheKeys,
                                           String[] cacheValues,
                                           Integer[] lruKeys,
                                           Map<Integer,CacheCell<Integer,String>> cacheContents,
                                           PositionList<Integer> keyListLRU,
                                           Storage<Integer,String> mainMemory) {
    boolean ok_sofar = true;

    HashSet<Pair<Integer,String>> expected =
      new HashSet<Pair<Integer,String>>();
    HashSet<Pair<Integer,String>> lru =
      new HashSet<Pair<Integer,String>>();

    if (keyListLRU.size() != cacheContents.size()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.AFTER,
         "\nthe size of the map and the lru differ:\n\n"+
         "map contents: "+cacheContents+"\n"+
         "lru contents: "+keyListLRU+"\n"+
         "storage: "+mainMemory);
      ok_sofar = false;
      return false;
    }

    if (lruKeys.length != keyListLRU.size()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.AFTER,
         "\nlru should contain entries with the keys "+Arrays.toString(lruKeys)+
         " but contains the entries "+keyListLRU+"\n\n"+
         "map contents: "+cacheContents+"\n"+
         "lru contents: "+keyListLRU+"\n"+
         "storage: "+mainMemory);
      return false;
    }

    Position<Integer> cursor = keyListLRU.first();
    for (int i=0; i<lruKeys.length; i++) {
      Integer key = cursor.element();
      if (key == null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "\nlru contains a null key: "+keyListLRU+"\n\n"+
           "map contents: "+cacheContents+"\n"+
           "lru contents: "+keyListLRU+"\n"+
         "storage: "+mainMemory);
        return false;
      }

      if (!lruKeys[i].equals(key)) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "\nlru should contain keys in the order "+Arrays.toString(lruKeys)+"\n"+
           "lru contents: "+keyListLRU+"\n\n"+
           "map contents: "+cacheContents+"\n"+
           "storage: "+mainMemory);
        return false;
      }

      CacheCell<Integer,String> cell = cacheContents.get(key);
      if (cell == null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "\nlru contains a key "+key+" that has no entry in map\n"+
           "lru contents: "+keyListLRU+"\n\n"+
           "map contents: "+cacheContents+"\n"+
           "storage: "+mainMemory);
        return false;
      }

      if (cell.getPos() != cursor) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "\nthe call get("+key+") returns a cell "+cell+
           " with a position that is different from the lru position"+
           " which has key "+key+" as an element\n"+
           "lru contents: "+keyListLRU+"\n\n"+
           "map contents: "+cacheContents+"\n"+
           "storage: "+mainMemory);
        return false;
      }

      lru.add(new Pair<Integer,String>(key, cell.getValue()));
      cursor = keyListLRU.next(cursor);
    }

    for (int i=0; i<cacheKeys.length; i++) {
      expected.add(new Pair<Integer,String>(cacheKeys[i], cacheValues[i]));
    }

    ok_sofar =
      ok_sofar && expected.equals(lru);

    if (!ok_sofar) {
      TestUtils.printError
        (TestUtils.ExecutionTime.AFTER,
         "\nmap contains key-value pairs: "+lru+
         "\nbut should contain "+expected+"\n\n"+
         "\nlru contents: "+keyListLRU+"\n"+
         "map contents: "+cacheContents+"\n"+
         "storage: "+mainMemory);
      ok_sofar = false;
    }

    return ok_sofar;
  }
  
  static boolean checkStorageExternallyConsistent(Integer[] cacheKeys,
                                                  String[] cacheValues,
                                                  Map<Integer,CacheCell<Integer,String>> cacheContents,
                                                  PositionList<Integer> keyListLRU,
                                                  Storage<Integer,String> mainMemory) {
    boolean ok_sofar = true;

    HashSet<Pair<Integer,String>> expected =
      new HashSet<Pair<Integer,String>>();
    HashSet<Pair<Integer,String>> storage =
      new HashSet<Pair<Integer,String>>();

    for (int i=0; i<cacheKeys.length; i++) {
      expected.add(new Pair<Integer,String>(cacheKeys[i], cacheValues[i]));
    }

    for (Entry<Integer,String> entry : mainMemory.entries()) {
      storage.add(new Pair<Integer,String>(entry.getKey(), entry.getValue()));
    }

    ok_sofar =
      ok_sofar && expected.equals(storage);


    ArrayList<Pair<Integer,String>> expectedList =
      new ArrayList<Pair<Integer,String>>();
    ArrayList<Pair<Integer,String>> storageList =
      new ArrayList<Pair<Integer,String>>();

    for (Entry<Integer,String> expectedEntry : mainMemory.entries()) {
      storageList.add(new Pair<Integer,String>(expectedEntry.getKey(), expectedEntry.getValue()));
    }

    for (int i=0; i<cacheKeys.length; i++) {
      expectedList.add(new Pair<Integer,String>(cacheKeys[i], cacheValues[i]));
    }

    Collections.sort(storageList, new PairComparator());
    Collections.sort(expectedList, new PairComparator());

    if (!ok_sofar) {
      TestUtils.printError
        (TestUtils.ExecutionTime.AFTER,
         "\nstorage contains   "+storageList+
         "\nbut should contain "+expectedList+"\n\n"+
         "\nlru contents: "+keyListLRU+"\n"+
         "map contents: "+cacheContents+"\n"+
         "storage: "+mainMemory);
      ok_sofar = false;
      return false;
    }

    return ok_sofar;
  }
}

static class PairComparator implements Comparator<Pair<Integer,String>> {
  public int compare(Pair<Integer,String> e1, Pair<Integer,String> e2) {
    if (e1 == e2) return 0;
    if (e1.getLeft() == null) return -1;
    if (e2.getLeft() == null) return 1;
    return e1.getLeft() - e2.getLeft();
  }
}
  


























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";

    if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.getLeft())+","+print.apply(p.getRight())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
	  TestData.message("the call to "+msg+" raised the exception "+exc+
			     " although it should not have");
	  break;
      default:
	  TestData.message(" -- the exception "+exc+" was raised although it "+
			     "should not have been\n"+msg);
	  break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
    
      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
      
      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
      
    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      case UNRELATED:
	  return "";
      }
      return "";
    }
  }

  static <E> boolean checkNull(TestCall<E,Boolean> call,
                               TestResult<E,Boolean> result,
                               Boolean expected) {
    if (expected) return call.nonNull();
    else return call.isNull();
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
				     TestResult<E,F> result,
				     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
	("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2)) 
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

      if (it1.hasNext() != it2.hasNext())
        return false;
      return true;

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }
  
  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {
    
    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();
    
    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
             expectedCopy);
          return false;
        }
      }

      Position<E> expectedPos = expected.first();
      boolean found = false;
      boolean equals = true;

      while (expectedPos != null && !found && equals) {
        E expectedE = expectedPos.element();
        if (valueE.equals(expectedE)) {
          found = true;
          expected.remove(expectedPos);
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
	return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterator with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
	return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }
  
  static <E,F> boolean iterableCorrect(String callString, F[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,PositionList<F>> call,
     TestResult<Iterable<E>,PositionList<F>> result,
     Iterable<F> expected) {
    java.util.Iterator<E> it = null;
    java.util.Iterator<F> exp = expected.iterator();

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
				return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }
  
  static <E,F> boolean iterableCorrect(String callString, Iterable<F> original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    PositionList<F> e = extractElementsFromIterable(callString, original);
    if (l == null) return false;

    boolean correct = (e.size() == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      Position<F> cursorE = e.first();
      for (int j=0; j<e.size(); j++) {
        if (cursorE.element() == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && cursorE.element().equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
				cursorE = e.next(cursorE);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(e));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  E elem = lPos.element();

	  if (elem == null) ok_sofar = (original[i] == null);
	  else ok_sofar = elem.equals(original[i]);

	  lPos = l.next(lPos);
	  ++i;
      }

      if (!ok_sofar) {
	  printError
            (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input list "+TestUtils.print(original)+
	     "; it has now the elements "+TestUtils.print(l));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input array "+TestUtils.print(original)+
	       "; it has now the elements "+TestUtils.print(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
         exc);
      return null;
    }
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;
    
    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
	(Integer) majorMethod.invoke(null);
      aedlibMinor = 
	(Integer) minorMethod.invoke(null);
      aedlibPatchlevel = 
	(Integer) patchlevelMethod.invoke(null);

      isOk =
	((aedlibMajor > major)
	 || ((aedlibMajor == major) &&
	     ((aedlibMinor > minor)
	      || ((aedlibMinor == minor) &&
		  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
	("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
	"*** ERROR: aedlib is too old. Minimum version needed is "+
	major+"."+minor+"."+patchlevel+"; your version is "+
	aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
	". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true; 	      
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
            if (!parameterTypes[i].isInstance(params[i]))
              equals = false;
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }
  
  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }
  
  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }
  
  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
	return callString + "  =>  " + getException();
      else
	{
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
    else {
      StringBuffer resultString = new StringBuffer();
      for (String line : lines) {
        resultString.append("\n    ");
        resultString.append(line);
      }
      return resultString.toString();
    }
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());
    
    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));
    
    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean isNull() {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n");
      return false;
    } else return true;
  }

  boolean isNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] original, Object[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] original, int[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] original, char[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);
    
    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }
    
    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.LAST,
	   "\nthe call to "+this+" returned null, "+
	   "but should have returned "+TestUtils.print(expected));
	return false;
      }
      else return true;
    }

    if (!equalsWithArrays(expected,value)) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
	 "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      return equalsExpected(value, expected);
    }      
  }

  private static boolean equalsWithArrays(Object expected, Object value) {
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}


static class Constructor extends TestCall<Cache<Integer,String>,Void>
{
  Integer x_1;
  Storage<Integer,String> storage;
  
  public Constructor (Integer x_1,Storage<Integer,String> storage)
  {
    this.x_1 = x_1 ;
    this.storage = storage ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("new Cache<Integer,String>")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(storage)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Cache<Integer,String> call () 
  {
    return new Cache<Integer,String>(x_1,storage) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class Get extends TestCall<String,String>
{
  Cache<Integer,String> x_1;
  Integer x_2;
  
  public Get (Cache<Integer,String> x_1,Integer x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".get")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public String call () 
  {
    return x_1.get(x_2) ;
  }
  
  public boolean checkResult (String expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Put extends TestCall<Void,Void>
{
  Cache<Integer,String> x_1;
  Integer x_2;
  String x_3;
  
  public Put (Cache<Integer,String> x_1,Integer x_2,String x_3)
  {
    voidReturn = true ;
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".put")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_3)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () 
  {
    x_1.put(x_2,x_3) ;
    return null ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class CacheOk extends TestCall<Boolean,Boolean>
{
  Cache<Integer,String> x_1;
  Integer[] x_2;
  String[] x_3;
  Integer[] x_4;
  String[] x_5;
  Integer[] x_6;
  
  public CacheOk (Cache<Integer,String> x_1,Integer[] x_2,String[] x_3,Integer[] x_4,String[] x_5,Integer[] x_6)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
    this.x_4 = x_4 ;
    this.x_5 = x_5 ;
    this.x_6 = x_6 ;
  }
  
  public String toString () 
  {
    return new String("") ;
  }
  
  public Boolean call () 
  {
    return CacheUtils.cacheOk(x_1,x_2,x_3,x_4,x_5,x_6) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    return silentCheckTrueResult() ;
  }
  
}







static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;
  static int individualTimeout = 10;
  static int globalTimeout = 60;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static int getIndividualTimeout() {
    return individualTimeout;
  }

  public static void setIndividualTimeout(int timeout) {
    individualTimeout = timeout;
  }

  public static int getGlobalTimeout() {
    return globalTimeout;
  }

  public static void setGlobalTimeout(int timeout) {
    globalTimeout = timeout;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}









 
static class ResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    if (results_sofar == null) 
      results_sofar = new LinkedHashMap<String,Boolean>();
    if (runningTests == null)
      runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests "+runningTests+" are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath) 
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);
 
    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) 
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {};
    }
 
    return sb.toString();
  }
  
}


static class TesterCode
{
  
  public static void resetPrinter () 
  {
  }
  
  public static String printer (Object obj) 
  {
    return TestUtils.standardPrinter(obj) ;
  }
  
}


}
