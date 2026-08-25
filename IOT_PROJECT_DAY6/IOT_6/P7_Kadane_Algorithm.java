package IOT_6;
// KADANE'S ALGORITHM
public class P7_Kadane_Algorithm {
	public static void main(String[] args) {
		int[] profit = {5,3,-2,4,-10,6,2};
		int currentProfit = 0;
		int bestProfit = 0;
		for ( int i=0; i<profit.length; i++) {
			currentProfit = currentProfit + profit[i];
			if (currentProfit<0) {
				currentProfit = 0;
			}
			if (currentProfit>bestProfit) {
				bestProfit = currentProfit;
			}
		}
		System.out.println("Maximum Profit:" + bestProfit);
	}
}
