package IOT_13;

public class P5 {


    public static void main(String[] args) {

        int V = 5;

        int[][] edges = {
            {0, 1, 6},
            {0, 2, 7},
            {1, 2, 8},
            {1, 3, 5},
            {1, 4, -4},
            {2, 3, -3},
            {3, 1, -2},
            {4, 0, 2}
        };

        int[] dist = new int[V];

        for (int i = 0; i < V; i++) {
            dist[i] = 9999;
        }

        dist[0] = 0;

        for (int i = 1; i < V; i++) {

            for (int j = 0; j < edges.length; j++) {

                int src = edges[j][0];
                int dest = edges[j][1];
                int weight = edges[j][2];

                if (dist[src] != 9999 &&
                    dist[src] + weight < dist[dest]) {

                    dist[dest] = dist[src] + weight;
                }
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.println("0 -> " + i + " = " + dist[i]);
        }
    }


}
