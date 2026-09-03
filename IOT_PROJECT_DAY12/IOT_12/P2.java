package IOT_12;
public class P2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 1};
        boolean duplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate)
                break;
        }
        if (duplicate)
            System.out.println("Duplicate number found");
        else
            System.out.println("No duplicate number");
    }
}