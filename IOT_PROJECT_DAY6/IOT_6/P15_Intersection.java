package IOT_6;
import java.util.HashSet;
public class P15_Intersection {
    public static void main(String[] args) {
    	int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                result.add(arr2[i]);
            }
        }
        System.out.println("Intersection of Two Arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
