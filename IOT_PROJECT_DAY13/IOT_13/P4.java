package IOT_13;

import java.util.*;

public class P4 {

	

	    static class Edge {
	        int src, dest, weight;

	        Edge(int src, int dest, int weight) {
	            this.src = src;
	            this.dest = dest;
	            this.weight = weight;
	        }
	    }

	    public static void main(String[] args) {

	        int V = 5;

	        Edge[] edges = {
	            new Edge(0, 1, 6),
	            new Edge(0, 2, 7),
	            new Edge(1, 2, 8),
	            new Edge(1, 3, 5),
	            new Edge(1, 4, -4),
	            new Edge(2, 3, -3),
	            new Edge(2, 4, 9),
	            new Edge(3, 1, -2),
	            new Edge(4, 0, 2),
	            new Edge(4, 3, 7)
	        };

	        int source = 0;

	        int[] dist = new int[V];

	        Arrays.fill(dist, 9999);
	        dist[source] = 0;

	        // Relax edges V-1 times
	        for (int i = 1; i < V; i++) {

	            for (Edge e : edges) {

	                if (dist[e.src] != 9999 &&
	                    dist[e.src] + e.weight < dist[e.dest]) {

	                    dist[e.dest] = dist[e.src] + e.weight;
	                }
	            }
	        }

	        // Check negative cycle
	        for (Edge e : edges) {

	            if (dist[e.src] != 9999 &&
	                dist[e.src] + e.weight < dist[e.dest]) {

	                System.out.println("Negative cycle exists");
	                return;
	            }
	        }

	        // Print shortest distances
	        System.out.println("Shortest distances:");

	        for (int i = 0; i < V; i++) {
	            System.out.println("0 -> " + i + " = " + dist[i]);
	        }
	    }
	}

