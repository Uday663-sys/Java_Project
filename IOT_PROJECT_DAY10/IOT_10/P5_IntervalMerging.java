package IOT_10;
public class P5_IntervalMerging {
    public static void main(String[] args) {
        int[][] interval = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };
        int n = interval.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (interval[i][0] > interval[j][0]) {
                    int temp1 = interval[i][0];
                    int temp2 = interval[i][1];
                    interval[i][0] = interval[j][0];
                    interval[i][1] = interval[j][1];
                    interval[j][0] = temp1;
                    interval[j][1] = temp2;
                }
            }
        }
        System.out.println("Merged Intervals:");
        int start = interval[0][0];
        int end = interval[0][1];
        for (int i = 1; i < n; i++) {
            if (interval[i][0] <= end) {
                if (interval[i][1] > end)
                    end = interval[i][1];
            } else {
                System.out.println("(" + start + "," + end + ")");
                start = interval[i][0];
                end = interval[i][1];
            }
        }
        System.out.println("(" + start + "," + end + ")");
    }
}
