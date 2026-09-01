package IOT_10;
public class P4_FractionalKnapsack {
    public static void main(String[] args) {
        int[] Weight = {10, 20, 30};
        int[] Value = {100, 120, 80};
        double[] ratio = new double[3];
        int capacity = 50;       
        for (int i = 0; i < 3; i++) {
            ratio[i] = (double) Value[i] / Weight[i];
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (ratio[i] < ratio[j]) {
                    double tr = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = tr;
                    int tw = Weight[i];
                    Weight[i] = Weight[j];
                    Weight[j] = tw;
                    int tv = Value[i];
                    Value[i] = Value[j];
                    Value[j] = tv;
                }
            }
        }
        double totalValue = 0;
        for (int i = 0; i < 3; i++) {
            if (capacity >= Weight[i]) {
                totalValue += Value[i];
                capacity -= Weight[i];
            } else {
                totalValue += ratio[i] * capacity;
                break;
            }
        }
        System.out.println("Maximum Profit : " + totalValue);
    }
}