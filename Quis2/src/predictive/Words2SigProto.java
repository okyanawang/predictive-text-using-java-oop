package predictive;

public class Words2SigProto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input : ");
		for (int i=0; i<args.length; i++) {
			System.out.print(args[i]+ "   ");
		}
		System.out.println();
		System.out.print("output : ");
		for (int i=0; i<args.length; i++) {
			System.out.print(PredictivePrototype.wordToSignature(args[i]) + " ");
		}
	}
}
