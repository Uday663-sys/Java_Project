package IOT_6;
// IN PLACE REARRANGEMENT
public class P17_InPlace_Rearrangement {
	public static void main(String[] args) {
		int[] num = {3,1,2,4};
		int left = 0;
		int right = num.length - 1;
		while (left < right) {
			int temp = num[left];
			num[left] = num[right];
			num[right] = temp;
			left ++ ;
			right -- ;
		}
		System.out.println("Rearranged Array:");
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i] + " ");
		}
	}
}
