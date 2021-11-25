package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// ini class buat ngetes doang, ntar kaga masuk ke pengumpulan
public class test {
	static Dictionary dc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PredictivePrototype var = new PredictivePrototype();
		String str = "4663"; 
//				"abcdefghijklmnopqrstuvwxyz";
//		System.out.println("String =" + var.wordToSignature(str));
	
		
		dc = new PredictivePrototype();
		System.out.println("PP: "+ dc.signatureToWords(str));
		
		System.out.println();
		
		dc = new DictionaryListImpl();
		System.out.println("List : " + dc.signatureToWords(str));
		
		StringBuffer sb = new StringBuffer("1134");
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
//		String str1 = "4663";
//		System.out.println(str1 + " : " + var.signatureToWords(str1));
//		
//		String str2 = "43556";
//		System.out.println(str2 + " : " + var.signatureToWords(str2));
//
//		String str3 = "96753";
//		System.out.println(str3 + " : " + var.signatureToWords(str3));
//
//		String str4 = "69";
//		System.out.println(str4 + " : " + var.signatureToWords(str4));
//
//		String str5 = "6263";
//		System.out.println(str5 + " : " + var.signatureToWords(str5));
//
//		String str6 = "47";
//		System.out.println(str6 + " : " + var.signatureToWords(str6));
//		Set<String> s = new HashSet<String>();
//		s.add("ets");
//		s.add("etsda");
//		s.add("etdas");
//		System.out.println(s);
//		for (String value : s)
//            System.out.print(value + ", ");
//		System.out.println();
//		
//         
//		String strr = "ea";
//		System.out.println(strr.substring(0, strr.length()));
//        System.out.println();
//        for (int i=0; i<strr.length(); i++) {
//        	System.out.println(strr.substring(0, i+1));
//        }
		
		dc = new DictionaryTreeImpl();
		System.out.println("4663" + " " + dc.signatureToWords("4663"));
		System.out.println("43556" + " " + dc.signatureToWords("43556"));
		System.out.println("96753" + " " + dc.signatureToWords("96753"));
		System.out.println("69" + " " + dc.signatureToWords("69"));
		System.out.println("6263" + " " + dc.signatureToWords("6263"));
		System.out.println("47" + " " + dc.signatureToWords("47"));
		
	}
	
}
