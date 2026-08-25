package IOT_6;
import java.util.HashSet;
public class P13_UnionArrays_UsingString {
	public static void main(String[] args) {
			String[] arr1 = {"UDAY","THARUN","ULLAS","UDAY"};
			String[] arr2 = {"UJWAL","RAKESH","YASHAS","VINOD"};
	        HashSet<String> union = new HashSet<>();
	        for (int i = 0; i<arr1.length; i++) {
	            union.add(arr1[i]);
	        }
	        for (int i = 0; i<arr2.length; i++) {
	            union.add(arr2[i]);
	        }
	        System.out.println("Array String without duplicates:");
	        for (String str : union) {
	            System.out.print(str + "  ");
	        }
	 }
}

