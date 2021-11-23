package predictive;

import java.util.Set;

public interface Dictionary {
	Set<String> signatureToWords(String signature);
	String wordToSignature(String word);
}
