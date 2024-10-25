
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Queue;

public class Graph {

    int vertices;
    int[][] adjancencyMatrix;

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjancencyMatrix = new int[vertices][vertices];
    }

    void addEdge(int u, int v) {
        adjancencyMatrix[u][v] = 1;
        adjancencyMatrix[v][u] = 1;
    }

    void BreadthFirstSearch(Graph G) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[G.vertices];
        queue.add(0);
        for (; !queue.isEmpty();) {
            int row = queue.poll();
            System.out.print(row + " ");
            visited[row] = true;
            for (int col = 0; col < G.vertices; col++) {
                if (G.adjancencyMatrix[row][col] == 1 && !visited[col]) {
                    visited[col] = true;
                    queue.add(col);
                }

            }
        }

    }

}

public class MainA {

    public static void main(String[] args) {
        Graph g = new Graph(6);
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 4}, {3, 5}, {4, 5}};
        for (int[] e : edges) {
            g.addEdge(e[0], e[1]);
        }
        System.out.println(Arrays.deepToString(g.adjancencyMatrix));
        g.BreadthFirstSearch(g);

    }
}
