package unit3;

import java.util.*;

public class AdjMatrixGraph {

    private int[][] graph;
    private int arraySize = 10;

    AdjMatrixGraph() {

        this.graph = new int[this.arraySize][this.arraySize];
    }

    public void addVertex(int a) {
        this.graph[a] = new int[this.arraySize];
    }

    public void removeVertex(int a) {
        for (int b = 0; b < this.arraySize; b++) {
            if (this.edgeExists(b, a)) {
                this.removeEdge(b, a);
            }
        }

        this.graph[a] = null;
    }

    public void addEdge(int a, int b) {
        this.graph[a][b] = 1;
    }

    public void removeEdge(int a, int b) {
        this.graph[a][b] = 0;
        this.graph[b][a] = 0;
    }

    public boolean edgeExists(int a, int b) {
        return this.graph[a] != null && this.graph[a][b] > 0;
    }

    public boolean vertexExists(int a) {
        return this.graph[a] != null;
    }

    public static void main(String[] args) {
        testImplementation();
        testImplementationWithRemoves();

        // @lab todo update graph to include these
        /*
         * We should have the following graph
         *
         *     (7)    (8)----|
         *     |\     / \    |
         *     | \   /   \   |
         *     |  \ /     \  |
         *     |  (5)-(4) (9)|
         *     |   | \ | / / |
         *     |  (1)-(2) /  |
         *     | /  \    /   |
         *     |/    \  /    |
         *    (3)----(6)-----|
         */
    }



    private static void testImplementation() {
        AdjMatrixGraph graph = new AdjMatrixGraph();
        populateTestGraph(graph);
        /*
         * We should have the following graph
         *
         *     (7)   (8)---|
         *     | \   /     |
         *     |  \ /      |
         *     |  (5)-(4)  |
         *     |   | \ |   |
         *     |  (1)-(2)  |
         *     | /  \      |
         *    (3)---(6)----|
         */

        Queue<String> errors = new LinkedList<>();
        if(!graph.edgeExists(1, 2)) errors.offer("Error 1");
        if(!graph.edgeExists(1, 5)) errors.offer("Error 2");
        if(!graph.edgeExists(2, 1)) errors.offer("Error 3");
        if(!graph.edgeExists(2, 1)) errors.offer("Error 4");
        if(!graph.edgeExists(2, 4)) errors.offer("Error 5");
        if(!graph.edgeExists(3, 1)) errors.offer("Error 6");
        if(!graph.edgeExists(3, 6)) errors.offer("Error 7");
        if(!graph.edgeExists(3, 7)) errors.offer("Error 8");
        if(!graph.edgeExists(4, 2)) errors.offer("Error 9");
        if(!graph.edgeExists(4, 5)) errors.offer("Error 10");
        if(!graph.edgeExists(6, 1)) errors.offer("Error 11");
        if(!graph.edgeExists(6, 3)) errors.offer("Error 12");
        if(!graph.edgeExists(6, 8)) errors.offer("Error 13");
        if(!graph.edgeExists(7, 3)) errors.offer("Error 14");
        if(!graph.edgeExists(7, 5)) errors.offer("Error 15");
        if(!graph.edgeExists(8, 5)) errors.offer("Error 16");
        if(!graph.edgeExists(8, 6)) errors.offer("Error 17");

        if(graph.edgeExists(7, 8)) errors.offer("Error 18");
        if(graph.edgeExists(5, 6)) errors.offer("Error 19");
        if(graph.edgeExists(1, 7)) errors.offer("Error 20");
        if(graph.edgeExists(6, 5)) errors.offer("Error 21");

        System.out.println("\n############################");
        System.out.println("TESTING: testImplementation()");
        int i = 0;
        for (String err : errors) {
            System.out.println("\t" + err);
            i++;
        }
        System.out.println("\ntestImplementation() had " + i + " errors.");
        System.out.println("############################");
    }

    private static void populateTestGraph(AdjMatrixGraph graph) {
        /*
         * Makes the following graph
         *
         *     (7)   (8)---|
         *     | \   /     |
         *     |  \ /      |
         *     |  (5)-(4)  |
         *     |   | \ |   |
         *     |  (1)-(2)  |
         *     | /  \      |
         *    (3)---(6)----|
         */

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);
        graph.addVertex(8);

        // vertex A
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 5);
        graph.addEdge(1, 6);

        // vertex B
        graph.addEdge(2, 1);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        // vertex C
        graph.addEdge(3, 1);
        graph.addEdge(3, 7);
        graph.addEdge(3, 6);

        // vertex D
        graph.addEdge(4, 5);
        graph.addEdge(4, 2);

        // vertex E
        graph.addEdge(5, 7);
        graph.addEdge(5, 8);
        graph.addEdge(5, 4);
        graph.addEdge(5, 1);
        graph.addEdge(5, 2);

        // vertex F
        graph.addEdge(6, 3);
        graph.addEdge(6, 1);
        graph.addEdge(6, 8);

        // vertex G
        graph.addEdge(7, 3);
        graph.addEdge(7, 5);

        // vertex H
        graph.addEdge(8, 5);
        graph.addEdge(8, 6);
    }



    private static void testImplementationWithRemoves() {
        AdjMatrixGraph graph = new AdjMatrixGraph();
        populateTestGraph(graph);
        /*
         * We should have the following graph
         *
         *     (7)   (8)---|
         *     | \   /     |
         *     |  \ /      |
         *     |  (5)-(4)  |
         *     |   | \ |   |
         *     |  (1)-(2)  |
         *     | /  \      |
         *    (3)---(6)----|
         *
         *    let's remove node (1)
         *    and remove the edge [(5)-(4)]
         *
         *    so we have
         *
         *     (7)   (8)---|
         *     | \   /     |
         *     |  \ /      |
         *     |  (5) (4)  |
         *     |     \ |   |
         *     |      (2)  |
         *     |           |
         *    (3)---(6)----|
         *
         */

        graph.removeVertex(1);
        graph.removeEdge(5, 4);

        Queue<String> errors = new LinkedList<>();
        if(graph.edgeExists(1, 2)) errors.offer("Error 1");
        if(graph.edgeExists(1, 5)) errors.offer("Error 2");
        if(graph.edgeExists(2, 1)) errors.offer("Error 3");
        if(graph.edgeExists(2, 1)) errors.offer("Error 4");
        if(!graph.edgeExists(2, 4)) errors.offer("Error 5");
        if(graph.edgeExists(3, 1)) errors.offer("Error 6");
        if(!graph.edgeExists(3, 6)) errors.offer("Error 7");
        if(!graph.edgeExists(3, 7)) errors.offer("Error 8");
        if(!graph.edgeExists(4, 2)) errors.offer("Error 9");
        if(graph.edgeExists(4, 5)) errors.offer("Error 10");
        if(!graph.edgeExists(5, 7)) errors.offer("Error 11");
        if(!graph.edgeExists(5, 8)) errors.offer("Error 12");
        if(graph.edgeExists(5, 4)) errors.offer("Error 13");
        if(graph.edgeExists(5, 1)) errors.offer("Error 14");
        if(!graph.edgeExists(5, 2)) errors.offer("Error 15");
        if(graph.edgeExists(6, 1)) errors.offer("Error 16");
        if(!graph.edgeExists(6, 3)) errors.offer("Error 17");
        if(!graph.edgeExists(6, 8)) errors.offer("Error 18");
        if(!graph.edgeExists(7, 3)) errors.offer("Error 19");
        if(!graph.edgeExists(7, 5)) errors.offer("Error 20");
        if(!graph.edgeExists(8, 5)) errors.offer("Error 21");
        if(!graph.edgeExists(8, 6)) errors.offer("Error 22");

        if(graph.edgeExists(7, 8)) errors.offer("Error 23");
        if(graph.edgeExists(5, 6)) errors.offer("Error 24");
        if(graph.edgeExists(1, 7)) errors.offer("Error 25");
        if(graph.edgeExists(6, 5)) errors.offer("Error 26");


        if(graph.vertexExists(1)) errors.offer("Error 27");

        System.out.println("\n############################");
        System.out.println("TESTING: testImplementationWithRemoves()");
        int i = 0;
        for (String err : errors) {
            System.out.println("\t" + err);
            i++;
        }
        System.out.println("\ntestImplementationWithRemoves() had " + i + " errors.");
        System.out.println("############################");
    }
}