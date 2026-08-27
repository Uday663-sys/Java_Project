package IOT_7;
public class P18_MergeSort_Names {
	static void sort(String[] a, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        sort(a, l, m);
        sort(a, m + 1, r);
        merge(a, l, m, r);
    }
	static void merge(String[] a, int l, int m, int r) {
        String[] temp = new String[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) {
            if (a[i].compareTo(a[j]) <= 0)
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }
        while (i <= m) temp[k++] = a[i++];
        while (j <= r) temp[k++] = a[j++];
        for (i = 0; i < temp.length; i++)
            a[l + i] = temp[i];
    }
	public static void main(String[] args) {
        String[] names = {"Uday", "Rakesh", "Anil", "Ullas", "Yashas","Ujwal"};
        sort(names, 0, names.length - 1);
        System.out.println("Sorted Names:");
        for (String name : names)
            System.out.print(name + " ");
    }
}
