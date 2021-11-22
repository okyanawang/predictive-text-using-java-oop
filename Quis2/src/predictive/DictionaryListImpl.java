package predictive;
import java.io.*;
import java.util.*;

public class DictionaryListImpl {
	
	static ArrayList<WordSig> diaword = new ArrayList<WordSig>();
	
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
	
	public static Set<String> signatureToWords(String signature){
		Set<String> stringSet = new HashSet<String>();
		int num = Integer.parseInt(signature);
		
		int l = 0, r = diaword.size() - 1;
		while (l <= r) {
            int m = l + (r - l) / 2;
            
            String temp = diaword.get(m).sig();
            // Check if x is present at mid
            if (Integer.parseInt(temp) == num) {
            	int yunjin = m;
            	while(Integer.parseInt(diaword.get(yunjin).sig()) == num)
            		yunjin--;
            	yunjin++;
            	for(int i = yunjin; i <= m; i++) {
            		stringSet.add(diaword.get(i).wor());
            	}
            }
                
 
            // If x greater, ignore left half
            if (Integer.parseInt(temp) < num)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
		
		return stringSet;
	}
	public DictionaryListImpl() {
//		Set<String> stringSet = new HashSet<String>();
		
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
