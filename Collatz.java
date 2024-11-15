// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int numOfSequences = Integer.parseInt(args[0]);
		boolean isVerbose= args[1].equals("v");
		for (int i = 0; i < numOfSequences; i++) {
			int startingNum = i + 1;
			int counter = 1;
			if (isVerbose) {
				System.out.print(startingNum);
			}
			do {
				if (startingNum % 2 == 0){
					startingNum /= 2;
				} else {
					startingNum = startingNum * 3 + 1;
				}
				if (isVerbose){
					System.out.print(", " + startingNum);
				}
				counter++;
			} while (startingNum != 1);
			if (isVerbose){
				System.out.print(" (" + counter + ")");
				System.out.println();
			}
		}
		System.out.println("Every one of the first " +  numOfSequences + 
					" hailstone sequences reached 1.");
	}
}
