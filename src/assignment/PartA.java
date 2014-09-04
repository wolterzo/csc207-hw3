package assignment;

public class PartA
{
  /**
   * Determine if a is a multiple of b.
   */
  public static boolean isMultiple(long a, long b)
  {
    if ((a % b) == 0)
      {
        return true;
      }//if
    else
      {
        return false;
      }//else
  } // isMultiple(long, long)

  /**
   * Determine if i is odd.
   */
  public static boolean isOdd(int i)
  {
    i = Math.abs(i);
    while (i >= 0)
      {
        if (i == 0)
          {
            return false;
          }//if
        else if (i == -1)
          {
            return true;
          }//else if
        i = i - 2;
      }//while
  /*With Spencer's help, added a return boolean after while loop.
    If the while loop works correctly, we'll never reach this point.
    */
    return true; 
  }//isOdd(int)

  /**
   * Produce sum on all positive odd integers less than n.
   */
  public static int oddSumTo(int n)
  {
    int sum;
    sum = 0;
    for (int i = 0; i <= n; i++)
      {
        if(isOdd(i))
          {
            sum = sum + i;
          }//if
      }//for
    return 0;
  }//oddSumTo (int)

  /**
   * Determine if any pair of integers in an array has a 
   * product that is odd.
   */
  public static boolean isOddProd(int[] ints)
  {
    for(int i = 0; i < ints.length - 1; i++)
      {
        for(int j = i+1; j < ints.length; j++)
          {
            if(isOdd(ints[i]*ints[j]))
              {
                return true;
              }//if
          }//for
      }//for
    return false;
  }//isOddProd(int[])

  /**
   * Determine if no two integers in an array have equal values.
   */
  public static boolean allDistinct(int[] ints)
  {
    for(int i = 0; i < ints.length - 1; i++)
      {
        for(int j = i+1; j < ints.length; j++)
          {
            if(ints[i]==ints[j])
              {
                return true;
              }
          }//for
      }//for
    return false;
  }//allDistinct(int[])

  /**
   * Reverse the order of integers in an array.
   */
  public static void reverseInts(int[] ints)
  {
    int temp; // to hold integers we're moving
    int length;
    length = ints.length;
    if(isOdd(length))
      {
        for(int i = 0; i <= ((length/2)-2); i++)
          {
            temp = ints[i];
            ints[i]=ints[length-i];
            ints[length-i] = temp;
          }//for
      }//if ints.length is odd
    else
      {
        for(int i = 0; i <= ((length/2)-1); i++)
          {
            temp = ints[i];
            ints[i]=ints[length-i];
            ints[length-i] = temp;
          }//for
      }//else
  }//reverseInts(int[])

} //class PartA
