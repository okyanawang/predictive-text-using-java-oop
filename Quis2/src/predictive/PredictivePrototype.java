package predictive;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PredictivePrototype implements Dictionary{
	private static boolean isValidWord(String word) {
		for (int i=0; i<word.length(); i++) {
			
			if (word.charAt(i) >= 97 && word.charAt(i) <= 122){ // if it is lower case-letter, then do nothing
			}else if (word.charAt(i) >= 65 && word.charAt(i) <= 90) { // if it is upper-case letter, then do nothing
			}else { // if not upper-case letter or lower-case letter then return false
				return false;
			}
		}
		return true;
	}
	
	public String wordToSignature(String word) {
		StringBuffer sb = new StringBuffer ("");
		// incase there is upper-case letter
		word = word.toLowerCase();
		// for each letter paired with each number 
		for (int i=0; i<word.length(); i++) {
			if (word.charAt(i) >= 97 && word.charAt(i) <= 99) { // abc
				sb.append("2");
			}else if (word.charAt(i) >= 100 && word.charAt(i) <= 102) { // def
				sb.append("3");
			}else if (word.charAt(i) >= 103 && word.charAt(i) <= 105) { // ghi
				sb.append("4");
			}else if (word.charAt(i) >= 106 && word.charAt(i) <= 108) { // jkl
				sb.append("5");
			}else if (word.charAt(i) >= 109 && word.charAt(i) <= 111) { // mno
				sb.append("6");
			}else if (word.charAt(i) >= 112 && word.charAt(i) <= 115) { // pqrs
				sb.append("7");
			}else if (word.charAt(i) >= 116 && word.charAt(i) <= 118) { // tuv
				sb.append("8");
			}else if (word.charAt(i) >= 119 && word.charAt(i) <= 122) { // wxyz
				sb.append("9");
			}else {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	
	public Set<String> signatureToWords(String signature){
		Set<String> stringSet = new HashSet<String>();
		
		// read file words.txt
		try {
			File words = new File("words.txt");
			Scanner file = new Scanner(words);
			
			// if the file has next line
			while (file.hasNextLine()) {
				String data = file.nextLine();
				
				// check if its a valid word and has the same length
				if (isValidWord(data) && data.length() == signature.length()) {
					boolean temp = true;
					for (int i=0; i<signature.length(); i++) {
						int hi = 0,low = 0;
						if (signature.charAt(i) == '2'){
							low = 97;
							hi = 99;
						}else if (signature.charAt(i) == '3') {
							low = 100;
							hi = 102;
						}else if (signature.charAt(i) == '4') {
							low = 103;
							hi = 105;
						}else if (signature.charAt(i) == '5') {
							low = 106;
							hi = 108;
						}else if (signature.charAt(i) == '6') {
							low = 109;
							hi = 111;
						}else if (signature.charAt(i) == '7') {
							low = 112;
							hi = 115;
						}else if (signature.charAt(i) == '8') {
							low = 116;
							hi = 118;
						}else if (signature.charAt(i) == '9') {
							low = 119;
							hi = 122;
						}
						
						// incase if there is upper case word
						data = data.toLowerCase();
						
						// if the letter is not the correct pair, then stop the loop   
						if (data.charAt(i) < low || data.charAt(i) > hi) {
							temp = false;
							break;
						}
					}
					// if the word is a correct pair of the numbers then add it to stringSet 
					if (temp) {
						stringSet.add(data);
					}
				}
			}
			// close the opened file
			file.close();
	    } catch (FileNotFoundException e) { // if the file not found
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
		
		// return the result
		return stringSet;
	}
}
