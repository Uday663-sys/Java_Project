package IOT_6;
import java.util.HashSet;
public class P14_UnionArray_Using_Int {
	public static void main(String[] args) {
	int[] arr1 = {2,4,3,4,6};
	int[] arr2 = {5,7,8,5,9};
    HashSet<Integer> union = new HashSet<>();
    for (int i = 0; i<arr1.length; i++) {
        union.add(arr1[i]);
    }
    for (int i = 0; i<arr2.length; i++) {
        union.add(arr2[i]);
    }
    System.out.println("Array String without duplicates:");
    for ( int num : union) {
        System.out.print(num + "  ");
    }
}
}



