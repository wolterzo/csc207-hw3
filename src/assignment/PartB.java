package assignment;

public class PartB
{
  /**
   * Compute the average of two integers.  Rounds toward zero if the
   * average is not a whole number.
   */
  public static int average(int left, int right) 
  {
    /* Here if you use MAX_VALUE, it gives an incorrect answer
     * return ((left + right) / 2);
     * */
    return((left/2)+(right/2));    
  } // average(int,int)
} // class PartB
