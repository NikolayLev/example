package example.dijkstra;

import javax.print.DocPrintJob;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        DijkstraAlg dijkstraAlg = new DijkstraAlg();
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");

        Node start = new Node();
        start.setName("Start");
        Node finish = new Node();
        finish.setName("Finish");
        dijkstraAlg.graph.put(start,new HashMap<Node, Integer>());
        dijkstraAlg.graph.put(finish,new HashMap<Node, Integer>());

        dijkstraAlg.graph.get(start).put(a,5);
        dijkstraAlg.graph.get(start).put(b,2);

        dijkstraAlg.graph.put(a, new HashMap<Node, Integer>());
        dijkstraAlg.graph.put(b, new HashMap<Node, Integer>());

        dijkstraAlg.graph.get(b).put(c,3);
        dijkstraAlg.graph.get(a).put(d,2);

        dijkstraAlg.graph.put(c, new HashMap<Node, Integer>());
        dijkstraAlg.graph.put(d, new HashMap<Node, Integer>());


        dijkstraAlg.graph.get(c).put(finish,3);
        dijkstraAlg.graph.get(d).put(finish,5);

        dijkstraAlg.costs.put(a, 5);
        dijkstraAlg.costs.put(b, 2);

        dijkstraAlg.costs.put(finish,DijkstraAlg.INF);
        dijkstraAlg.costs.put(c, DijkstraAlg.INF);
        dijkstraAlg.costs.put(d, DijkstraAlg.INF);

        dijkstraAlg.parents.put(a,start);
        dijkstraAlg.parents.put(b,start);
        dijkstraAlg.parents.put(finish, null);


        System.out.println(dijkstraAlg.graph.keySet());
        System.out.println(dijkstraAlg.graph.entrySet());

        System.out.println(dijkstraAlg.parents);

        System.out.println(dijkstraAlg.costs);




        dijkstraAlg.startAlg();

        System.out.println(dijkstraAlg.graph.keySet());
        System.out.println(dijkstraAlg.graph.entrySet());

        System.out.println(dijkstraAlg.parents);

        System.out.println(dijkstraAlg.costs);



    }
}
