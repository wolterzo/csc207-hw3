package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartATest
{

  @Test
  public final void testIsMultiple()
  {
    assertEquals("easy", true, PartA.isMultiple(4, 2));
    assertEquals("negatives", true, PartA.isMultiple(-4, -2));
    assertEquals("fail", false, PartA.isMultiple(10, 3));
    assertEquals("smaller a", false, PartA.isMultiple(2, 4));
    assertEquals("large a small b", true, PartA.isMultiple(Long.MAX_VALUE, 1));
    assertEquals("large a, large b", true,
                 PartA.isMultiple(Long.MAX_VALUE, Long.MAX_VALUE));
    assertEquals("same value", true, PartA.isMultiple(2, 2));
    assertEquals("zero as a", true, PartA.isMultiple(0, 10));
  }

  @Test
  public final void testIsOdd()
  {
    assertEquals("negative even", false, PartA.isOdd(-4));
    assertEquals("negative odd", true, PartA.isOdd(-5));
    assertEquals("positive even", false, PartA.isOdd(4));
    assertEquals("positive odd", true, PartA.isOdd(7));
    for(int i = -100; i<101; i+=2)
      {
        assertEquals("even", false, PartA.isOdd(i));
        assertEquals("odd", true, PartA.isOdd(i-1));
      }//for
    assertEquals("zero", false, PartA.isOdd(0));
    assertEquals("max value", true, PartA.isOdd(Integer.MAX_VALUE));
    assertEquals("min value", false, PartA.isOdd(Integer.MIN_VALUE));//fix this. :(
  }

  @Test
  public final void testOddSumTo()
  {
    assertEquals("simple test even", 25, PartA.oddSumTo(10));
    assertEquals("simple test odd", 16, PartA.oddSumTo(9));
    assertEquals("zero", 0, PartA.oddSumTo(0));
  }

  @Test
  public final void testIsOddProd()
  {
    assertEquals("simple true", true, PartA.isOddProd(new int[] { 7, 3 }));
    assertEquals("simple false", false, PartA.isOddProd(new int[] { 7, 2 }));
    assertEquals("one number odd", false, PartA.isOddProd(new int[] { 7 }));
    assertEquals("empty", false, PartA.isOddProd(new int[] {}));
    assertEquals("more than three values", true,
                 PartA.isOddProd(new int[] { 7, 2, 4, 5 }));
  }

  @Test
  public final void testAllDistinct()
  {
    assertEquals("simple true", true, PartA.allDistinct(new int[] { 7, 3 }));
    assertEquals("simple false", false, PartA.allDistinct(new int[] { 7, 7 }));
    assertEquals("one number", true, PartA.allDistinct(new int[] { 7 }));
    assertEquals("empty", true, PartA.allDistinct(new int[] {}));
    assertEquals("more than three values", true,
                 PartA.allDistinct(new int[] { 7, 2, 4, 5 }));
    assertEquals("distinct until end", false,
                 PartA.allDistinct(new int[] { 7, 3, 5, 1, 8, 8 }));
    assertEquals("same at start and finish", false,
                 PartA.allDistinct(new int[] { 8, 3, 5, 1, 7, 8 }));
  }

  @Test
  public final void testReverseInts()
  {
    assertArrayEquals(new int[] {}, PartA.reverseInts(new int[] {}));
    assertArrayEquals(new int[] { 1 }, PartA.reverseInts(new int[] { 1 }));
    assertArrayEquals(new int[] { 1, 2 }, PartA.reverseInts(new int[] { 2, 1 }));
    assertArrayEquals(new int[] { 1, 2, 3 }, PartA.reverseInts(new int[] { 3, 2, 1 }));
    assertArrayEquals(new int[] { 1, 2, 3, 4 }, PartA.reverseInts(new int[] { 4, 3, 2, 1 }));
  }

}
