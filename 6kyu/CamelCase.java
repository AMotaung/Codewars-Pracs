//Description
// Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
// The first word within the output should be capitalized only if the original word was capitalized 
//(known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

//Examples
// "the-stealth-warrior" gets converted to "theStealthWarrior"
// "The_Stealth_Warrior" gets converted to "TheStealthWarrior"









//My Solution
import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    
  StringBuilder sb = new StringBuilder(s);
    
    
    if(s.contains("-")) {
      
      for(int i = 0; i < sb.length(); i++){
        if(i == sb.indexOf("-")){
        sb.deleteCharAt(sb.indexOf("-"));
        sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        }
        String b = sb.toString();
      b.toUpperCase();
      }
      String a = sb.toString();
      a.toUpperCase();
      return a;
      
    }else if(s.contains("_")){
      
     for(int i = 0; i < sb.length(); i++){
       if(i == sb.indexOf("_")){
        sb.deleteCharAt(sb.indexOf("_"));
         sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
      }
       String a = sb.toString();
      a.toUpperCase();
      }
       String b = sb.toString();
      b.toUpperCase();
      return b;
    }
    return "";
  }
}

//Other Solutions #1
import java.util.Arrays;

class Solution{

  static String toCamelCase(String str){
    String[] words = str.split("[-_]");
    return Arrays.stream(words, 1, words.length)
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
            .reduce(words[0], String::concat);
  }
}

//Other Solutions #2
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.StringBuilder;

class Solution{

  static String toCamelCase(String s){
    Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
        m.appendReplacement(sb, m.group(1).toUpperCase());
    }
    return m.appendTail(sb).toString();
  }
}