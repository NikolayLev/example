package example.dijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DijkstraAlg {

    public static final Integer INF = Integer.MAX_VALUE;

    private List<Node> proceed = new ArrayList<>();


    public boolean createNode(String s, Integer i) {
        return false;
    }

    public DijkstraAlg() {

    }

    public Map<Node, HashMap<Node, Integer>> graph = new HashMap();
    public Map<Node, Integer> costs = new HashMap<>();

    public Map<Node, Node> parents = new HashMap<>();


    public Node findLowestCostNode() {
        int lowestCost = INF;
        Node lowestCostNode = null;
        for (Map.Entry entry : costs.entrySet()) {
            Node node = (Node) entry.getKey();
            int cost = (Integer) entry.getValue();

            if (cost < lowestCost & !proceed.contains(node)) {
                lowestCost = cost;
                lowestCostNode = node;

            }
        }
        return lowestCostNode;
    }

    public void startAlg() {
        Node node = findLowestCostNode();

        while (node != null) {
            int cost = costs.get(node);
            Map<Node, Integer> neighbors = graph.get(node);

            for (Map.Entry entry : neighbors.entrySet()) {
                int newCost = cost + ((int) entry.getValue());
                Node node1 = (Node)entry.getKey();
                if (costs.get(node1) > newCost) {
                    costs.put(node1, newCost);
                    parents.put(node1,node);

                }
            }
            proceed.add(node);
            node = findLowestCostNode();
        }
    }


}




