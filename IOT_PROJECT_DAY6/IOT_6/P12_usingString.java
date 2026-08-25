package IOT_6;

public class P12_usingString {
	public static void main(String[] args) {
		String[] arr1 = {"UDAY_P","V_RAKESH","ULLAS_N","UJWAL_SHERIKAR"};
		String[] arr2 = {"VINOD_KUMAR","UDAY_KUMAR","YASHAS","THARUN_KUMAR"};
		String[] merged = new String[arr1.length + arr2.length];
		for (int i=0; i<arr1.length;i++) {
			merged[i] = arr1[i];
		}
		for (int i=0; i<arr1.length;i++) {
			merged[arr1.length + i] = arr2[i];
		}
		System.out.println("Merged Array:");
		for (int i=0; i<merged.length; i++) {
			System.out.println(merged[i] + " ");
		}
	}
}

