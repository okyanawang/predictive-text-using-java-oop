package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// ini class buat ngetes doang, ntar kaga masuk ke pengumpulan
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello"; 
//				"abcdefghijklmnopqrstuvwxyz";
		System.out.println("String =" + PredictivePrototype.wordToSignature(str));
		
		String str1 = "4663";
		System.out.println(str1 + " : " + PredictivePrototype.signatureToWords(str1));
		
		String str2 = "43556";
		System.out.println(str2 + " : " + PredictivePrototype.signatureToWords(str2));

		String str3 = "96753";
		System.out.println(str3 + " : " + PredictivePrototype.signatureToWords(str3));

		String str4 = "69";
		System.out.println(str4 + " : " + PredictivePrototype.signatureToWords(str4));

		String str5 = "6263";
		System.out.println(str5 + " : " + PredictivePrototype.signatureToWords(str5));

		String str6 = "47";
		System.out.println(str6 + " : " + PredictivePrototype.signatureToWords(str6));

		
		
	}
	
}
