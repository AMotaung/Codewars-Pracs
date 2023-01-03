//Description
// Complete the solution so that it returns true if the first argument(string) 
// passed in ends with the 2nd argument (also a string).

//Examples
solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false

//My Solution
public class Kata {
  public static boolean solution(String str, String ending) {
    
    if(str.endsWith(ending)){
      return true;
    }
    
    return false;
  }
}


// Other Solutions #1
public class Kata {
  public static boolean solution(String str, String ending) {
    return str.endsWith(ending);
  }
}

// Other Solutions #2
import java.util.*;
public class Kata {
  public static boolean solution(String str, String ending) {
    char[] strung = str.toCharArray(), out = ending.toCharArray();
    if (out.length>strung.length) return false;
    for (int i=0; i<(out.length); i++)
      if (strung[(strung.length-1)-i]!=out[(out.length-1)-i])
        return false;
    return true;
  }
}