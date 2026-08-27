package IOT_7;
public class P20_QuickSort {
	static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }
	static int partition(int arr[], int low, int high) {
        int pivot = arr[high];      // Last element is pivot
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
	public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 3};
        System.out.print("Before Sorting: ");
        for (int n : arr)
            System.out.print(n + " ");
        quickSort(arr, 0, arr.length - 1);
        System.out.print("\nAfter Sorting: ");
        for (int n : arr)
            System.out.print(n + " ");
    }
}

