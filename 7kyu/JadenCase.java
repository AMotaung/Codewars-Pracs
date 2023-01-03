//Description
// Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known
// for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every 
// word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.

// Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, 
// but they are not capitalized in the same way he originally typed them.

//Examples
// Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
// Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"





//My Solution
import java.util.ArrayList;
public class JadenCase {

	public String toJadenCase(String phrase) {
		// TODO put your code below this comment
   
    String[] jaden = null;
    if(phrase != null) {
       if(!phrase.isEmpty()) {
    jaden = phrase.split(" ");
    
    String s1 = null;
    String capitalized = null;
  
  ArrayList<String> arr = new ArrayList<>();
    for(int i = 0; i < jaden.length; i++) {
    	 s1 = jaden[i].substring(0, 1).toUpperCase();
    	capitalized = s1 + jaden[i].substring(1);
    	
    	
    	arr.add(capitalized);
    	
    }
  
    
    String str = String.join(" ", arr);
		return str;
	}
      }
    return null;
    }
  
public static void main(String[] bubbles) {
	JadenCase jadenCase = new JadenCase();
  
	String result = jadenCase.toJadenCase("How can mirrors be real if our eyes aren't real");
		
System.out.println(result);
}
  
}


//Other Solutions #1
import java.lang.Character;

public class JadenCase {

	public String toJadenCase(String phrase) {
    if(phrase == null || phrase.equals("")) return null;
    
    char[] array = phrase.toCharArray();
    
    for(int x = 0; x < array.length; x++) {
      if(x == 0 || array[x-1] == ' ') {
        array[x] = Character.toUpperCase(array[x]);
      }
    }
		
		return new String(array);
	}

}

//Other Solutions #2
import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

	public String toJadenCase(String phrase) {
      if (null == phrase || phrase.length() == 0) {
          return null;
      }

      return Arrays.stream(phrase.split(" "))
                   .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                   .collect(Collectors.joining(" "));
	}

}