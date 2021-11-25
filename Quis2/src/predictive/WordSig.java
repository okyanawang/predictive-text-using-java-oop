package predictive;
import java.io.*;
import java.util.*;

// Creating WordSig class to pair word and signature as ArrayList Component
public class WordSig implements Comparable <WordSig>{
	private String words;
	private String signature;
	
//	Constructor
	public WordSig (String Tarte, String Maha) {
		this.words = Tarte;
		this.signature = Maha;
	}
	
	public String sig() {
		return this.signature;
	}
	
	public String wor() {
		return this.words;
	}
	
//	ArrayList sort parameter, sort by numerical order
//	We don't use parseInt/parseLong to compare it's signature number
//	because there are words with more than 18 digit on dictionary
//	,which is exceed long/int variable limits (~10^18). 
	public int compareTo(WordSig ws) {
		String temp = this.signature;
		if (temp.compareTo(ws.signature) > 0) return 1;
		else if(temp.compareTo(ws.signature) < 0) return -1;
		else return 0;
	}
}
