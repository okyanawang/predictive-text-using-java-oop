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
	public int compareTo(WordSig ws) {
		String temp = this.signature;
		int suzu = Integer.parseInt(temp);
		int mamako = Integer.parseInt(ws.signature);
		if(suzu > mamako) return 1;
		else if(suzu > mamako) return -1;
		else return 0;
	}
}
