package example.dijkstra;

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


        start.ribs.put(a, 5);
        start.ribs.put(b, 2);


        dijkstraAlg.graph.add(start);
        dijkstraAlg.graph.add(finish);

        a.ribs.put(c, 3);
        b.ribs.put(d, 2);


        dijkstraAlg.graph.add(a);
        dijkstraAlg.graph.add(b);


        dijkstraAlg.graph.add(c);
        dijkstraAlg.graph.add(d);

        c.ribs.put(finish, 3);
        d.ribs.put(finish, 5);


        dijkstraAlg.costs.put(a, 5);
        dijkstraAlg.costs.put(b, 2);

        dijkstraAlg.costs.put(finish, DijkstraAlg.INF);
        dijkstraAlg.costs.put(c, DijkstraAlg.INF);
        dijkstraAlg.costs.put(d, DijkstraAlg.INF);

        dijkstraAlg.parents.put(a, start);
        dijkstraAlg.parents.put(b, start);
        dijkstraAlg.parents.put(finish, null);


        System.out.println(dijkstraAlg.parents);

        System.out.println(dijkstraAlg.costs);


        dijkstraAlg.startAlg();


        System.out.println(dijkstraAlg.parents);

        System.out.println(dijkstraAlg.costs);

    }
}
