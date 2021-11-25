package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DictionaryTreeImpl implements Dictionary{
	/**
	 * Class for tree implementation
	 */
	
	// make variabel
	Tree temp;
	Tree br2 = new Tree("2");
	Tree br3 = new Tree("3");
	Tree br4 = new Tree("4");
	Tree br5 = new Tree("5");
	Tree br6 = new Tree("6");
	Tree br7 = new Tree("7");
	Tree br8 = new Tree("8");
	Tree br9 = new Tree("9");
	Set<String> stringSet;
	
	// Constructor
	public DictionaryTreeImpl() {
		
		// read file words.txt
		try {
			File words = new File("words.txt");
			Scanner file = new Scanner(words);
			
			// if the file has next line
			while (file.hasNextLine()) {
				String data = file.nextLine();
				
				// for every valid word add the substring into the tree
				if (isValidWord(data)) {
					
					// incase there is upper-case letter
					data = data.toLowerCase();
					
					// get the signature
					String signature = wordToSignature(data);
					
					int len = signature.length()-1;
					
					// first character to determine the tree used
					if (signature.charAt(0) == '2'){
						temp = br2;
					}else if (signature.charAt(0) == '3') {
						temp = br3;
					}else if (signature.charAt(0) == '4') {
						temp = br4;
					}else if (signature.charAt(0) == '5') {
						temp = br5;
					}else if (signature.charAt(0) == '6') {
						temp = br6;
					}else if (signature.charAt(0) == '7') {
						temp = br7;
					}else if (signature.charAt(0) == '8') {
						temp = br8;
					}else if (signature.charAt(0) == '9') {
						temp = br9;
					}
					
					// add the substring into the tree
					for (int i=1; i<len; i++) {
						temp = temp.addWords(data.substring(0, i), signature.substring(0, i+1));
						
					}
				}
			}
			// close the opened file
			file.close();
	    } catch (FileNotFoundException e) { // if the file not found
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
	}
	
	// method to check whether the word is valid word or not
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
	
	// method to change word to signature 
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
	
	// method to change signature to the predictive word
	public Set<String> signatureToWords(String signature) {
		// if the length of signature is zero but it still dont match any words then return
		// empty set
		if (signature.length() == 0) {
			return new HashSet<String>();
		}
		// check the first character from the signature to determine the tree used
		if (signature.charAt(0) == '2') {
			return br2.getWords(signature.substring(1, signature.length()));
		}else if (signature.charAt(0) == '3') {
			return br3.getWords(signature.substring(1, signature.length()));
		}else if (signature.charAt(0) == '4') {
			return br4.getWords(signature.substring(1, signature.length()));
		}else if (signature.charAt(0) == '5') {
			return br5.getWords(signature.substring(1, signature.length()));
		}else if (signature.charAt(0) == '6') {
			return br6.getWords(signature.substring(1, signature.length()));
		}else if (signature.charAt(0) == '7') {
			return br7.getWords(signature.substring(1, signature.length()));
		}else if (signature.charAt(0) == '8') {
			return br8.getWords(signature.substring(1, signature.length()));
		}else {
			return br9.getWords(signature.substring(1, signature.length()));
		}
	}
}
