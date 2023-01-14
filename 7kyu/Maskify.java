//Description
// Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone
// could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.

// Your task is to write a function maskify, which changes all but the last four characters into '#'.

//Examples
"4556364607935616" --> "############5616"
     "64607935616" -->      "#######5616"
               "1" -->                "1"
                "" -->                 ""

// "What was the name of your first pet?"

"Skippy" --> "##ippy"

"Nananananananananananananananana Batman!"
-->
"####################################man!"


//My Solution
import java.util.ArrayList;
import java.util.Arrays;

public class Maskify {

	public static void main(String[] arg) {

		Maskify.maskify("64607935616");
	}

	public static String maskify(String str) {
		String[] word = str.split("");
		ArrayList<String> temp = new ArrayList<>();

		for (int i = 0; i < word.length; i++) {
			if (i < word.length - 4) {
				word[i] = word[i].replace(word[i].charAt(0), '#');
			}

			temp.add(word[i]);

		}

		String result = String.join("", temp);
		System.out.println(result);

		return result;
	}
}

//Other Solutions
public class Maskify {
    public static String maskify(String str) {
        if (str.length() <= 4) return str;
        String result = "";
        for (int i = 0; i < str.length()-4; i++) {
            result += "#";
        }
        return result + str.substring(str.length()-4);
    }
}

//Other Solutions
public class Maskify {
    public static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}
