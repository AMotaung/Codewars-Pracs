//Description
// A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the 
// sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

// Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.







//My Solutions
public class PangramChecker {
  public boolean check(String sentence){
    //code
    String letters[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    
    if(sentence != null){
      
    
    for(int i = 0; i < letters.length; i++){
      
      if(!sentence.toLowerCase().contains(letters[i])){
        
        return false;
      }
    }
      return true;
    }
    
    return false;
  }
}


//Other Solutions #1
public class PangramChecker {
  public boolean check(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

  }
}

//Other Solutions #2
public class PangramChecker {
  public boolean check(String sentence){
  	return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
  }
}