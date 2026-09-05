package IOT_13;

public class P10 {

	public static void main(String[] args) {
		int[] arr= {50000,30000,70000,6000};
		int first=0;
		int second=0;
		for(int i=0;i<arr.length;i++) {
			if(first<arr[i]) {
				second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
				
			}
		}
		System.out.println("Highest Salary = " + first);
        System.out.println("Second Highest Salary = " + second);
	}

}