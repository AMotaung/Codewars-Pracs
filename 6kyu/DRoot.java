//Description
// Digital root is the recursive sum of all the digits in a number
// Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-
// negative integer.

//Example
16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

//My Solution
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DRoot {

	public static void main(String[] arg) {
		int result = DRoot.digital_root(905329);
		System.out.println(result);
	}
	
	public static int digital_root(int n) {
	    // ...
		while(n>= 10) {
			
			
			

			if (n<0) n=-n; // maybe you'd like to support negatives
			List<Integer> digits = new LinkedList<Integer>();

			while (n>0) {
			    digits.add(0, n%10);
			    n=n/10;
			}

			System.out.println(Arrays.toString(digits.toArray())); // [5, 4, 2
			
			int total = 0;
			for(int i =0; i < digits.size(); i++) {
				
				int num = digits.get(i);
				
				total += num;
				
			}
			
			System.out.println(total);
			return digital_root(total);
		}
		return n;
	  }
}

//Other Solution #1
public class DRoot {
  public static int digital_root(int n) {
    return (n != 0 && n%9 == 0) ? 9 : n % 9;
  }
}

//Other Solution #2
public class DRoot {
  public static int digital_root(int n) {
    while(n > 9){
      n = n/10 + n % 10;
      }
    return(n);
  }
}