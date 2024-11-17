// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		double approximation = 0;
		boolean isActionAddition = true;;
		int currDenominator = 1;
		
		for (int i = 0; i < Integer.parseInt(args[0]); i++, currDenominator+=2) {
			if (isActionAddition){
				approximation += 1.0 / (double)currDenominator;
			} else {
				approximation -= 1.0 / (double)currDenominator;
			}
			isActionAddition = !isActionAddition;
		}

		System.out.println("pi accoriding to Java: " + Math.PI);
		System.out.println("pi, approximated: " + approximation * 4.0);
	}
}
