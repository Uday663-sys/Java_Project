package IOT_10;
public class P3_JobSequencing {
    public static void main(String[] args) {
        char[] Job = {'A', 'B', 'C', 'D'};
        int[] DeadLine = {2, 1, 2, 1};
        int[] Profit = {100, 50, 150, 80};
        int n = Job.length;       
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Profit[i] < Profit[j]) {
                    int tempProfit = Profit[i];
                    Profit[i] = Profit[j];
                    Profit[j] = tempProfit;
                    int tempDeadline = DeadLine[i];
                    DeadLine[i] = DeadLine[j];
                    DeadLine[j] = tempDeadline;
                    char tempJob = Job[i];
                    Job[i] = Job[j];
                    Job[j] = tempJob;
                }
            }
        }
        int maxDeadline = 2;
        char[] result = new char[maxDeadline];
        boolean[] slot = new boolean[maxDeadline];
        int totalProfit = 0;        
        for (int i = 0; i < n; i++) {
            for (int j = DeadLine[i] - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = Job[i];
                    totalProfit += Profit[i];
                    break;
                }
            }
        }
        System.out.println("Selected Jobs:");
        for (int i = 0; i < maxDeadline; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }
}
