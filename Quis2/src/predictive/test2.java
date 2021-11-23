package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// ini class buat ngetes doang, ntar kaga masuk ke pengumpulan
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DictionaryListImpl.DictionaryListImpl();
		DictionaryListImpl var = new DictionaryListImpl();
//		DictionaryListImpl();
		
		String str = "hello"; 
//				"abcdefghijklmnopqrstuvwxyz";
		System.out.println("String =" + DictionaryListImpl.wordToSignature(str));
		
		String str1 = "4663";
		System.out.println(str1 + " : " + DictionaryListImpl.signatureToWords(str1));
		
		String str2 = "43556";
		System.out.println(str2 + " : " + DictionaryListImpl.signatureToWords(str2));

		String str3 = "96753";
		System.out.println(str3 + " : " + DictionaryListImpl.signatureToWords(str3));

		String str4 = "69";
		System.out.println(str4 + " : " + DictionaryListImpl.signatureToWords(str4));

		String str5 = "6263";
		System.out.println(str5 + " : " + DictionaryListImpl.signatureToWords(str5));

		String str6 = "47";
		System.out.println(str6 + " : " + DictionaryListImpl.signatureToWords(str6));

		
		
	}

	private static void DictionaryListImpl() {
		// TODO Auto-generated method stub
		
	}
	
}
