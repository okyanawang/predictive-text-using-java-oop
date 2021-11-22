package predictive;
import java.io.File;
import java.io.*;
import java.util.*;

public class DictionaryListImpl {
	
	public static String wordToSignature(String word) {
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
	
	public DictionaryListImpl() {
//		Set<String> stringSet = new HashSet<String>();
		ArrayList<WordSig> diaword = new ArrayList<WordSig>();
		
		// read file words.txt
		try {
			File words = new File("words.txt");
			Scanner file = new Scanner(words);
			
			// if the file has next line
			while (file.hasNextLine()) {
				String data = file.nextLine();
				WordSig aisha = new WordSig(data, wordToSignature(data));
				diaword.add(aisha);
			}	
			Collections.sort(diaword);
			// close the opened file
			file.close();
	    } catch (FileNotFoundException e) { // if the file not found
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
		
		// return the result
//		return stringSet;
	}

}
