package IOT_5;
//  Counting Duplicate in the word "Programming" Example
 public class P8_Programming {
    public static void main(String[] args) {
        String str = "Programming";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            boolean visited = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    visited = true;
                    break;
                }
            }
            if (!visited) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(str.charAt(i) + " = " + count);
                }
            }
        }
    }
}
