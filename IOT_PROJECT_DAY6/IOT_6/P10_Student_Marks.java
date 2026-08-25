package IOT_6;
public class P10_Student_Marks {
	public static void main(String[] args) {
		int[] StudentMarks = {10,20,50,30,};
		int[] prefixSum = new int[StudentMarks.length];
		prefixSum[0] = StudentMarks[0];
		for (int i=1; i<StudentMarks.length; i++) {
			prefixSum[i] = prefixSum[i-1] + StudentMarks[i]; 
		}
		int sum = prefixSum[3] - prefixSum[0];
		System.out.println("Total Spent:" + sum);
	}
}


