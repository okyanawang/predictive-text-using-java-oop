package predictive;

import java.util.Set;
/**
 * Interface for type dictionary
 */
public interface Dictionary {
	Set<String> signatureToWords(String signature);
	String wordToSignature(String word);
}
