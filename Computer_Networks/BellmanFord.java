import java.util.Scanner;
 public class BellmanFord{
    public static void bellmanFord(int[][] graph, int V, int E, int src) {
        int[] dist = new int[V];
        
        printSolution(dist, V);
    }
    public static void printSolution(int[] dist, int V) {
        System.out.println("Vertex\t\tDistance from Source");
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println(i + "\t\t" + "INF");
            } else {
                System.out.println(i + "\t\t" + dist[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int E = sc.nextInt();
        int[][] graph = new int[E][3];
        System.out.println("Enter the edges with source, destination, and weight:");
        for (int i = 0; i < E; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            graph[i][0] = sc.nextInt();
graph[i][1] = sc.nextInt();
 graph[i][2] = sc.nextInt();
 }
 System.out.print("Enter the source vertex: ");
 int src = sc.nextInt();
 bellmanFord(graph, V, E, src);
 sc.close();
 }
 }