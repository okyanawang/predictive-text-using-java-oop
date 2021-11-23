package predictive;


public class Sigs2WordsList {
	static Dictionary dc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    dc = new DictionaryListImpl();
	    long start = System.nanoTime();
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i] + " : " + dc.signatureToWords(args[i]));
		}
	    long end = System.nanoTime();
	    long execution = end - start;
	    System.out.println("Execution time: " + execution + " nanoseconds");
	}
}
