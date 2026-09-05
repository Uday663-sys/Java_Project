package IOT_13;

public class P3 {

	public static void main(String[] args) {
		        int[] arr = {1, 1, 2, 1, 2, 4, 3};

		        for (int i = 0; i < arr.length; i++) {

		            boolean duplicate = false;

		            for (int j = 0; j < i; j++) {

		                if (arr[i] == arr[j]) {
		                    duplicate = true;
		                    break;
		                }
		            }

		            if (!duplicate) {
		                System.out.print(arr[i] + " ");
		            }
		        }
		    }				
	}
