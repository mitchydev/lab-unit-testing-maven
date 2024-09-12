package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */

  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  @Test
  void Fahrenheittest(){
    assertEquals(32, SampleMethods.c2f(0));
  }

  @Test
  void Fahrenheittest2(){
    assertEquals(212, SampleMethods.c2f(100));
  }

  @Test
  void sumPosInts(){
    int[] values = { 1, 2, 3 };
    assertEquals(6, SampleMethods.sum(values));
  }
  // @Te
  // @Test
  // public void test2() {
  //   assertEquals(10, 3*5, "stupid test");
  // } // test2()
} // class TestSampleMethods



