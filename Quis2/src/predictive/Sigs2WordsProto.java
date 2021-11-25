package predictive;


public class Sigs2WordsProto {
	/**
	 * Class for testing the wordToSignature method from PredictivePrototype class
	 */
	static Dictionary dc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dc = new PredictivePrototype();
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
