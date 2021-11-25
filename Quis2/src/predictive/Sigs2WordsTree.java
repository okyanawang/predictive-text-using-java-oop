package predictive;

public class Sigs2WordsTree {

	/**
	 * Class for testing the wordToSignature method from DictionaryTreeImpl class
	 */
	static Dictionary dc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dc = new DictionaryTreeImpl();
		long start = System.nanoTime();
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i] + " : " + dc.signatureToWords(args[i]));
		}
	    long end = System.nanoTime();
	    long execution = end - start;
	    
	    // execution time needed 
	    System.out.println("Execution time: " + execution + " nanoseconds");
	}
}
