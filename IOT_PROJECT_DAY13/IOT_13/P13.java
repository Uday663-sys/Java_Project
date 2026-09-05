package IOT_13;

public class P13 {

	public static void main(String[] args) {
		int[] arr= {25000,40000,30000,50000};
		int highest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(highest<arr[i]) {
				highest=arr[i];
			}
		}
		System.out.println("highest salary:"+highest);		
	}

}
