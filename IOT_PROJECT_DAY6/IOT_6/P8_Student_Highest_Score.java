package IOT_6;
//KADANE'S ALGORITHM TO FIND STUDENT HIGHEST SCORE OF THE ENTIRE YEAR
public class P8_Student_Highest_Score {
	public static void main(String[] args) {
		int[] scores = {};
		int currentSum = 0;
		int maxSum = 0;
		for ( int i=0; i<scores.length; i++) {
			currentSum = currentSum + scores[i];
			if (currentSum<0) {
				currentSum = 0;
			}
			if (currentSum>maxSum) {
				maxSum = currentSum;
			}
		}
		System.out.println(" STUDENT HIGHEST SCORE OF THE ENTIRE YEAR:" + maxSum);
	}
}

