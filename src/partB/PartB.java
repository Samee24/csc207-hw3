package partB;

public class PartB {
  
  /**
   * Compute the average of two integers.  Rounds toward zero if the
   * average is not a whole number.
   */
  public static int average(int left, int right) 
  {
    int high;
    int low;
   
    high = Math.max(left, right);
    low = Math.min(left, right); 
    
    // The problem with the previous method of calculating the average was that if the sum of the input
    // parameters exceeded the max value of an integer the answer was a negative number because the 
    // function returns an int (bit-wise problem!).  We solved it by making sure that the results existed 
    // between 0- max value; we did this with simple algebra computations:
    // avg= (a+b)/2
    // avg= a + ((b-a)/2) -> when a is less than b. 
    
    return (low + (high - low) / 2);
  } // average(int,int)
} // class PartB