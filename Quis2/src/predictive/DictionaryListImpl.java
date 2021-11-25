package predictive;
import java.io.*;
import java.util.*;

public class DictionaryListImpl implements Dictionary{
	
	// Create ArrayList Object with WordSig element -WordSig detail explained on WordSig class
	static ArrayList<WordSig> diaword = new ArrayList<WordSig>();
	
	// method for check if it is a valid word
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
	
	public DictionaryListImpl() {
		
		
		
		try {
			// read file words.txt
			File words = new File("words.txt");
			Scanner file = new Scanner(words);
			
			// if the file has next line
			while (file.hasNextLine()) {
				String data = file.nextLine();
				
				if(isValidWord(data)) {
					//Convert words to all-LowerCase
					data = data.toLowerCase();
					//Adding Word with its signature on Object
					WordSig aisha = new WordSig(data, wordToSignature(data));
					diaword.add(aisha);
				}
			}
//			Numerical Order Sort ArrayList with comparison based on CompareTo function
//			on WordSig class
			Collections.sort(diaword);
			// close the opened file
			file.close();
	    } catch (FileNotFoundException e) { // if the file not found
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
		
	}
	
	//Convert Word to Signature, copying function from PredictivePrototype class
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
	
//	Implement signature to Words using searching based on Binary Search Method
	public Set<String> signatureToWords(String signature){
		Set<String> stringSet = new HashSet<String>();
		
//		Set l as top left iterator and r as top right iterator of ArrayList
		int l = 0, r = diaword.size() - 1;
		while (l <= r) {
//			Set m as mid iterator
            int m = l + (r - l) / 2;
            
//          Getting Signature from ArrayList index m
            String temp = diaword.get(m).sig();
//          Check if temp element has same value as signature we find
            if (temp.compareTo(signature) == 0) {
            	int yunjin = m, shenhen = m;
//            	We can't ensure that iterator m will take on first element of it's
//            	signature list(In case there are more than one word matching with it's
//            	signature). So, we need to take top left index of it's element (yunjin)
//            	and top right index of it's element (shenhen)
           		while(temp.compareTo(diaword.get(yunjin).sig()) == 0 && yunjin > 0)
            		yunjin--;
            	yunjin++;
            	while(temp.compareTo(diaword.get(shenhen).sig()) == 0)
            		shenhen++;
            	shenhen--;
            	for(int i = yunjin; i <= shenhen; i++) {
//            		Adding matching word on String Set 
            		stringSet.add(diaword.get(i).wor());
            	}
            }
                
 
            // If signature value greater, ignore left half
            if (temp.compareTo(signature) < 0)
                l = m + 1;
 
            // If signature value is smaller, ignore right half
            else
                r = m - 1;
        }
//		Return Words Set
		return stringSet;
	}

}
