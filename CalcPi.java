// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		double approximation = 1;
		boolean isActionAddition = false;;
		int currDenominator = 3;
		for (int i = 0; i < Integer.parseInt(args[0])+1; i++, currDenominator+=2) {
			if (isActionAddition){
				approximation += (double)1/currDenominator;
			} else {
				approximation -= (double)1/currDenominator;
			}
			isActionAddition = !isActionAddition;
		}
		
		System.out.println("pi accoriding to Java: " + Math.PI);
		System.out.println("pi, approximated: " + (double)approximation * 4);
	}
}
