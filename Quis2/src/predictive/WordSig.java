package predictive;
import java.io.*;
import java.util.*;

public class WordSig implements Comparable <WordSig>{
	private String words;
	private String signature;
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
	
	public int compareTo(WordSig ws) {
		String temp = this.signature;
//		System.out.println("Yowww");
		long suzu = Long.parseLong(temp);
		long mamako = Long.parseLong(ws.signature);
		if(suzu > mamako) return 1;
		else if(suzu < mamako) return -1;
		else return 0;
	}
}
