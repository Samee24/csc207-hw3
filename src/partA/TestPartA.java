package partA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPartA
{

  @Test
  public void test_isOddProd()
    throws Exception
  {
    int[] array1 = { 2, 5, 1 };
    int[] array2 = { 2, 5, 2 };

    assertEquals("array of 2, 5 , 1", true, PartA.isOddProd(array1));
    // Integer.MAX_VALUE is 2^31 - 1, which is odd
    assertEquals("array of 2, 5 , 2", false, PartA.isOddProd(array2));
  } // test_i

  @Test
  public void test_allDistinct()
    throws Exception
  {
    int[] array1 = { 2, 5, 1 };
    int[] array2 = { 2, 5, 2 };

    assertEquals("array of unique ints", true, PartA.allDistinct(array1));
    // Integer.MAX_VALUE is 2^31 - 1, which is odd
    assertEquals("array with at least repitition", false,
                 PartA.allDistinct(array2));
  } // test_i

  @Test
  public void test_oddSumTo()
    throws Exception
  {
    assertEquals("Positive odd number", 16, PartA.oddSumTo(9));
    // Integer.MAX_VALUE is 2^31 - 1, which is odd
    assertEquals("Positive even number", 9, PartA.oddSumTo(6));
  } // test_i

  @Test
  public void test_isMultiple()
    throws Exception
  {
    assertEquals("Non-multiple ints", false, PartA.isMultiple(5, 12));
    // Integer.MAX_VALUE is 2^31 - 1, which is odd
    assertEquals("MAX_VALUE", true,
                 PartA.isMultiple(Integer.MAX_VALUE, Integer.MAX_VALUE));
  } // test_isOdd

  @Test
  public void test_isOdd()
    throws Exception
  {
    assertEquals("negative even", false, PartA.isOdd(-4));
    // Integer.MAX_VALUE is 2^31 - 1, which is odd
    assertEquals("MAX_VALUE", true, PartA.isOdd(Integer.MAX_VALUE));
  } // test_isOdd

  @Test
  public void test_reverseInts()
    throws Exception
  {
    assertArrayEquals(new int[] {}, PartA.reverseInts(new int[] {}));
    assertArrayEquals(new int[] { 1 }, PartA.reverseInts(new int[] { 1 }));
    assertArrayEquals(new int[] { 1, 2 }, PartA.reverseInts(new int[] { 2, 1 }));
  } // test_reverseInts
} // class TestPartA