package IOT_7;
public class P16_FloorCeil_UsingNames {
	public static void main(String[] args) {
		String[] names = {"Anil", "Kiran", "Rakesh", "Uday", "Yash"};
        String key = "Vinod";
        int low = 0, high = names.length - 1;
        String floor = null;
        String ceil = null;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = names[mid].compareTo(key);
            if (result == 0) {
                floor = names[mid];
                ceil = names[mid];
                break;
            } else if (result < 0) {
                floor = names[mid];
                low = mid + 1;
            } else {
                ceil = names[mid];
                high = mid - 1;
            }
        }
        
        System.out.println("Floor : " + floor);
        System.out.println("Ceil  : " + ceil);
    }
}

