package IOT_7;
// BINARY SREACH IN CASE OF REPEATED [FIRST & LAST ITEM]
public class P13_BinarySearch_Repeated {
	 public static void main(String[] args) {
		 int[] arr = {10, 20, 20, 20, 30, 40, 50};
	     int key = 20;
	     int left = 0;
	     int right = arr.length - 1;
	     int first = -1;
	     while (left <= right) {
	    	 int mid = (left + right) / 2;
	    	 if (arr[mid] == key) {
	                first = mid;
	                right = mid - 1;
	            }
	            else if (key > arr[mid]) {
	                left = mid + 1;
	            }
	            else {
	                right = mid - 1;
	            }
	        }
	     left = 0;
	        right = arr.length - 1;
	        int last = -1;
	        while (left <= right) {

	            int mid = (left + right) / 2;

	            if (arr[mid] == key) {
	                last = mid;
	                left = mid + 1;
	            }
	            else if (key > arr[mid]) {
	                left = mid + 1;
	            }
	            else {
	                right = mid - 1;
	            }
	        }

	        if (first != -1) {
	            System.out.println("First index: " + first);
	            System.out.println("Last index: " + last);
	        }
	        else {
	            System.out.println("Element not found");
	        }
	    }
	}

