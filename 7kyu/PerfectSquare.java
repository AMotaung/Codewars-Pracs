//Description
// You might know some pretty large perfect squares. But what about the NEXT one?
// Complete the findNextSquare method that finds the next integral perfect square after the one passed as 
// a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
// If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.

//Examples
// 121 --> 144
// 625 --> 676
// 114 --> -1 since 114 is not a perfect square



//My Solution
import java.lang.Math;
public class NumberFun {
  public static long findNextSquare(long sq) {
      
    if(sq % (Math.sqrt(sq)) == 0){
      long sq2 = (long) Math.sqrt(sq);
      long tol = (sq2 + 1) * (sq2 + 1);
      
      return tol;
    }
      return -1; 
  }
}

// Other Solutions #1
public class NumberFun {
  public static long findNextSquare(long sq) {
      long root = (long) Math.sqrt(sq);
      return root * root == sq ? (root + 1) * (root + 1) : -1;
  }
}

// Other Solutions #2
public class NumberFun {
  public static long findNextSquare(long sq) {
      return Math.sqrt(sq) % 1 != 0 ? -1 : (long)Math.pow(Math.sqrt(sq)+1,2);
  }
}