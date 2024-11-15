// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
		int LowerRandomBound = 0;
		int HigherRandomBound = 0;
	    for (int i = 0; i < Integer.parseInt(args[0]); i++) {
			double generatedNum = Math.random();
			if (generatedNum > 0.5) {
				HigherRandomBound++;
			} else {
				LowerRandomBound++;
			}
		}
		System.out.println("> 0.5: " + HigherRandomBound + " times");
		System.out.println("<= 0.5: " + LowerRandomBound + " times");
		if (LowerRandomBound != 0){
			double ratio = (double) HigherRandomBound/ LowerRandomBound;
			System.out.println("Ratio: " + ratio);
		}
	}
}
