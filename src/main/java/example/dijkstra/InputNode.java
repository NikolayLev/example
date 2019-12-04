package example.dijkstra;

import java.util.Map;
import java.util.Scanner;

public class InputNode {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DijkstraAlg dijkstraAlg = new DijkstraAlg();

        System.out.println("Введите количество вершин");
        System.out.println("Вершины именуются с учетом их номера от 1 до количества вершин");
        //количество вершин
        int sumOfNodes = scanner.nextInt();
        System.out.println("Количество ребер = :");
        int sumOfRibs = scanner.nextInt();


        for (int i = 1; i <= sumOfNodes; i++) {
            Node node = new Node(Integer.toString(i));
            dijkstraAlg.graph.add(node);
            dijkstraAlg.costs.put(node, DijkstraAlg.INF);
        }

        for (int i = 0; i < sumOfRibs; i++) {
            System.out.println("Введите вершину 3 числа");
            Node node = dijkstraAlg.graph.get(scanner.nextInt() - 1);
            Integer toNode = scanner.nextInt();
            Integer cost = scanner.nextInt();
            node.ribs.put(dijkstraAlg.graph.get(toNode - 1), cost);
        }


        System.out.println("Введите старт");
        Node start = dijkstraAlg.graph.get(scanner.nextInt() - 1);
        for (Map.Entry entry : start.ribs.entrySet()) {
            dijkstraAlg.costs.put((Node) entry.getKey(), (Integer) entry.getValue());

        }


        System.out.println("Введите финиш");
        Node finish = dijkstraAlg.graph.get(scanner.nextInt() - 1);
        dijkstraAlg.startAlg();

        System.out.println(dijkstraAlg.graph);
        System.out.println(dijkstraAlg.parents);
        System.out.println(dijkstraAlg.costs);
        System.out.println(dijkstraAlg.costs.get(finish));


        //     Node start = new Node();
        //     start.setName("Start");
        //     Node finish = new Node();
        //     finish.setName("Finish");
        //     dijkstraAlg.graph.put(start, new HashMap<Node, Integer>());
        //     dijkstraAlg.graph.put(finish, new HashMap<Node, Integer>());

        //     dijkstraAlg.graph.get(start).put(a, 5);
        //     dijkstraAlg.graph.get(start).put(b, 2);

        //     dijkstraAlg.graph.put(a, new HashMap<Node, Integer>());
        //     dijkstraAlg.graph.put(b, new HashMap<Node, Integer>());

        //     dijkstraAlg.graph.get(b).put(c, 3);
        //     dijkstraAlg.graph.get(a).put(d, 2);

        //     dijkstraAlg.graph.put(c, new HashMap<Node, Integer>());
        //     dijkstraAlg.graph.put(d, new HashMap<Node, Integer>());


        //     dijkstraAlg.graph.get(c).put(finish, 3);
        //     dijkstraAlg.graph.get(d).put(finish, 5);

        //     dijkstraAlg.costs.put(a, 5);
        //     dijkstraAlg.costs.put(b, 2);

        //     dijkstraAlg.costs.put(finish, DijkstraAlg.INF);
        //     dijkstraAlg.costs.put(c, DijkstraAlg.INF);
        //     dijkstraAlg.costs.put(d, DijkstraAlg.INF);

        //     dijkstraAlg.parents.put(a, start);
        //     dijkstraAlg.parents.put(b, start);
        //     dijkstraAlg.parents.put(finish, null);


        //     System.out.println(dijkstraAlg.graph.keySet());
        //     System.out.println(dijkstraAlg.graph.entrySet());

        //     System.out.println(dijkstraAlg.parents);

        //     System.out.println(dijkstraAlg.costs);


        //     dijkstraAlg.startAlg();

        //     System.out.println(dijkstraAlg.graph.keySet());
        //     System.out.println(dijkstraAlg.graph.entrySet());

        //     System.out.println(dijkstraAlg.parents);

        //     System.out.println(dijkstraAlg.costs);

        //}


    }
}
