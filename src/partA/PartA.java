package partA;

public class PartA
{
  /**
   * Determine if a is a multiple of b.
   */
  public static boolean isMultiple(long a, long b)
  {
    boolean res = (a % b == 0);
    return res;
  } // isMultiple(long, long)

  /**
   * Determine if i is odd.
   */
  public static boolean isOdd(int i)
  {
    boolean res = (i % 2 != 0);
    return res;
  } // isOdd (int i)
    // calculates if i is odd
  
  /**
   * Gives the sum of all the odd numbers up to n.
   */
  public static int oddSumTo(int n)
  {
    int total = 0;
    for (int i = 0; i < n; i++)
      {

        total = isOdd(i) ? total + i : total;
      }

    return total;
  } // oddSumTo (int n) 
    //
  
  /**
   * Returns true if any pair in the array has an odd product.
   */
  public static boolean isOddProd(int[] ints)
  {
    int len = ints.length;

    for (int i = 0; i < len; i++)
      {
        for (int l = i + 1 ; l <len; l++)
          {
            int prod = ints[l] * ints[i];
            if (isOdd(prod))
              {
                return true;
              }
          }
      }

    return false;
  } // isOddProd(int[] ints)
  
  /**
   * Returns true if all elements are different in the array.
   */
  public static boolean allDistinct(int[] ints)
  {
    int len = ints.length;

    for (int i = 0; i < len; i++)
      {
        for (int l = i + 1 ; l <len; l++)
          {
            if (ints[l] == ints[i])
              {
                return false;
              }
          }
      }
 
    return true;
  } // allDistinct(int[] ints)
  
  /**
   * Returns the array in reverse order.
   */
  public static int[] reverseInts(int[] ints)
  {
    int len = ints.length - 1;

    if (len < 0)
      return ints ;
    
    for (int i = 0; i <=len/2; i++)
      {
        int temp = ints[i];
        ints[i] = ints[len-i];
        ints[len-i] = temp;
      }
    
    for (int i = 0;i<ints.length; i++)
      {
        System.out.println(ints[i]);
      }
    
    return ints;
  } // allDistinct(int[] ints)
} // class PartA