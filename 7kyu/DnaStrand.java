//Description
// Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

// If you want to know more: http://en.wikipedia.org/wiki/DNA
// In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

// More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

//Example
"ATTGC" --> "TAACG"
"GTAT" --> "CATA"


//My Solution
public class DnaStrand {

	public static void main(String[] arg) {
		
		String result = DnaStrand.makeComplement("ATTGC");
		System.out.println(result);

	}

	public static String makeComplement(String dna) {
		
		// Your code
		String[] letters = dna.split("");
		ArrayList<String> names = new ArrayList<>();
		
		
		for(int i=0; i< letters.length; i++) {
			
			
			
			if(letters[i].equals("A")) {
				letters[i] = letters[i].replace('A', 'T');			
				names.add(letters[i]);
				
			}else if(letters[i].equals("T")) {
				letters[i] = letters[i].replace('T', 'A');
				names.add(letters[i]);
				
			}else if(letters[i].equals("C")) {
				letters[i] = letters[i].replace('C', 'G');
				names.add(letters[i]);
				
			}else if(letters[i].equals("G")){
				letters[i] = letters[i].replace('G', 'C');
				names.add(letters[i]);
				
			}
		}
		
		String obj = String.join("", names);
		
		return obj;
	}
}

//Other Solutions #1
public class DnaStrand {
  public static String makeComplement(String dna) {
    char[] chars = dna.toCharArray();
    for(int i = 0; i < chars.length; i++) {
      chars[i] = getComplement(chars[i]);
    }
    
    return new String(chars);
  }
  
  private static char getComplement(char c) {
    switch(c) {
      case 'A': return 'T';
      case 'T': return 'A';
      case 'C': return 'G';
      case 'G': return 'C';
    }
    return c;
  }
}

//Other Solutions #2
public class DnaStrand {
  public static String makeComplement(String dna) {
    dna = dna.replaceAll("A","Z");
    dna = dna.replaceAll("T","A");
    dna = dna.replaceAll("Z","T");
    dna = dna.replaceAll("C","Z");
    dna = dna.replaceAll("G","C");
    dna = dna.replaceAll("Z","G");
    return dna;
  }
}