package IOT_6;
import java.util.HashSet;
public class P16_Intersect_UsingStrings {
	public static void main(String[] args) {
			String[] arr1 = {"Uday", "Rakesh", "Yashas", "Vinod"};
	        String[] arr2 = {"Yashas", "Uday", "Ullas", "Ujwal"};
	        HashSet<String> set = new HashSet<>();
	        HashSet<String> result = new HashSet<>();
	        for (String name : arr1) {
	            set.add(name);
	        }
	        for (String name : arr2) {
	            if (set.contains(name)) {
	                result.add(name);
	            }
	        }
	        System.out.println("Common Names:");
	        for (String name : result) {
	            System.out.println(name);
	        }
	    }
	}


