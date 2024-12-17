import java.util.*;
public class GraphUsingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating a edge (list of list) ex: [[],[],[]]
        List<List<Integer>> edges = new ArrayList<>();

        // creating sublist ex: []
        List<Integer> subList1 = new ArrayList<>();
        subList1.add(0);
        subList1.add(1);
        List<Integer> subList2 = new ArrayList<>();
        subList2.add(0);
        subList2.add(2);
        List<Integer> subList3 = new ArrayList<>();
        subList3.add(1);
        subList3.add(2);
        List<Integer> subList4 = new ArrayList<>();
        subList4.add(2);
        subList4.add(3);

        // adding all sublist to the edges list, to create [[],[],[]]
        edges.add(subList1);
        edges.add(subList2);
        edges.add(subList3);
        edges.add(subList4);

        // edges[][] = [ [0,1], [0,2], [1,2], [2,3] ]

        // creating a empty graph such as list of list
        List<List<Integer>> graph = new ArrayList<>();

        // creating empty sublist
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        List<Integer> s3 = new ArrayList<>();
        List<Integer> s4 = new ArrayList<>();

        // adding empty sublist to the graph list, to create list of list [[],[],[]]
        graph.add(s1);
        graph.add(s2);
        graph.add(s3);
        graph.add(s4);  

        // assigning values to graph list
        for(List<Integer> edge : edges) {      // accessing sublist from edges list [0,1] [0,2]
            int u = edge.get(0);         // Each sublist has two elements, so accessing it and assigning first element to u
            int v = edge.get(1);         // second element to v

            graph.get(u).add(v);               // adding the adjacency vertices, such as if u = 0, its nearest is 1 which v. so adding it in the 0th index of sublist of graph
            graph.get(v).add(u);               // adding the adjacency vertices, such as if v = 1, its nearest is 0 which u. so adding it in the 0th index of sublist of graph
        }

        // graph representation
        // 0 [1, 2]
        // 1 [0, 2]
        // 2 [0, 1, 3]
        // 3 [2]

        // printing the graph
        for(List<Integer> sg: graph) {  // accessing the sublist of the graph using for-each loop
            for(int element : sg) {  // accessing each element from the sublist of graph
                System.out.print(element+" ");  // printing the element
            }
            System.out.println();
        }

        sc.close();
    }
}
