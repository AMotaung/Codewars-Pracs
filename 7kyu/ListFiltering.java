//Description
// In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

//Example
Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)



//My Solution
public class ListFiltering {

	public static void main(String[] arg) {
		
		List<Object> results = ListFiltering.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231));
		System.out.println(results);
		
	}
	
	 public static List<Object> filterList(final List<Object> list) {
		 
		
		 List<Object> test = new ArrayList<Object>();
		 List<Integer> ary = new ArrayList<Integer>();
		 List<String> arrayString = new ArrayList<String>();
		 
		 for(Object o : list) {
			 if(o instanceof String) {
				 arrayString.add((String) o);
			 }else if(o instanceof Integer) {
				 ary.add((Integer) o);
			 }
		 }
		 
		 for(int i=0; i< ary.size(); i++) {
			 test.add(ary.get(i));
		 }
		 
		 
		 
		 
		    return test;
		  }
	
}


// Other Solutions #1
import java.util.*;
import java.util.stream.Collectors;

public class Kata {
  
  public static List filterList(final List<Object> list) {
    return list.stream()
      .filter(e -> e instanceof Integer)
      .collect(Collectors.toList());
  }

}

//Other Solutions #2
import java.util.*;

public class Kata {
  
  public static List filterList(final List list) {
        List result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number) {
                result.add(list.get(i));
            }
        }
        return result;
    }
  }