// Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest
// possible, containing distinct letters - each taken only once - coming from s1 or s2.

//Examples
// a = "xyaabbbccccdefww"
// b = "xxxxyyyyabklmopq"
// longest(a, b) -> "abcdefklmopqwxy"

// a = "abcdefghijklmnopqrstuvwxyz"
// longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

// My solutions

import java.util.*;
import java.util.ArrayList;
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        // your code
      ArrayList<String> letters = new ArrayList<String>(); 
      String[] words = s2.split("");
     
      for(int i = 0; i< words.length; i++){
        
        if(s1.contains(words[i])){
          if(letters.contains(words[i])){
          continue;
            }else{
            letters.add(words[i]); 
          }
          
        }else{
          if(!letters.contains(words[i])){
            
          letters.add(words[i]);
            }
       }
      }
      
      
      String[] w2 = s1.split(""); 
      for(int i = 0; i < w2.length; i++){
        
        if(!letters.contains(w2[i])){ 
          letters.add(w2[i]);
        }
      }
      
      Collections.sort(letters);
      StringBuffer sb  = new StringBuffer();
      
      for(String s : letters){
        sb.append(s);
      }
      String str = sb.toString();
      
      return str;
    }
}


//Other Solutions #1
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}

//Other Solutions #2
public class TwoToOne
{

    public static String longest(String s1, String s2)
    {
        String out = "";
        String s = s1 + s2;
        for (char c = 'a'; c <= 'z'; c++)
        {
            if (s.contains(c + ""))
            {
                out += c;
            }
        }
        return out;
    }

    public static void main(String[] args)
    {
        System.out.println(TwoToOne.longest("aretheyhere", "yestheyarehere"));
    }
}
