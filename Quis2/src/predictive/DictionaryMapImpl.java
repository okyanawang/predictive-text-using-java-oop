package predictive;
import java.io.*;
import java.util.*;

// Generic Multi-value map method
public class DictionaryMapImpl implements Dictionary{
	
//	Create map object contains Signature as key and it's words as value
	Map<String, ArrayList<String>> maha = new HashMap<>();
	
//	method for check if it is a valid word
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
	
	public DictionaryMapImpl() {
		
		try {
//			read file words.txt
			File words = new File("words.txt");
			Scanner file = new Scanner(words);
			
			// if the file has next line
			while (file.hasNextLine()) {
				String data = file.nextLine();
				
//				check if its a valid word
				if(isValidWord(data)) {
					data = data.toLowerCase();
//					If it's signature never place on map, create new key (Signature)
					if(!maha.containsKey(wordToSignature(data)))
						maha.put(wordToSignature(data), new ArrayList<String>());
//					Then pull it's value (Words)
					maha.get(wordToSignature(data)).add(data);
				}
			}	
			
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
	
//	Convert Signature to Words matching
	public Set<String> signatureToWords(String signature){
		Set<String> stringSet = new HashSet<String>();
		
//		Create new ArrayList bracket to get Words from it's signature
		ArrayList<String> tarte = new ArrayList<String>();
		tarte = maha.get(signature);
//		Store Words at stringset
		for(int i = 0; i < tarte.size(); i++)
			stringSet.add(tarte.get(i));        
		
		return stringSet;
	}

}
