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

    public List<Node> graph = new ArrayList<>();
    public Map<Node, Integer> costs = new HashMap<>();

    public Map<Node, Node> parents = new HashMap<>();


    public Node findLowestCostNode() {
        int lowestCost = INF;
        Node lowestCostNode = null;
        for (Map.Entry entry : costs.entrySet()) {
            Node nodeFromCostEntry = (Node) entry.getKey();
            int cost = (Integer) entry.getValue();

            if (cost < lowestCost & !proceed.contains(nodeFromCostEntry)) {
                lowestCost = cost;
                lowestCostNode = nodeFromCostEntry;
            }
        }
        return lowestCostNode;
    }

    public void startAlg() {
        Node node = findLowestCostNode();

        while (node != null) {
            int cost = costs.get(node);
            Map<Node, Integer> neighbors = node.ribs;


            for (Map.Entry entry : neighbors.entrySet()) {
                int newCost = cost + ((int) entry.getValue());
                Node neighborNode = (Node) entry.getKey();
                if (costs.get(neighborNode) > newCost) {
                    costs.put(neighborNode, newCost);
                    parents.put(neighborNode, node);
                }
            }
            proceed.add(node);
            node = findLowestCostNode();
        }
    }


}




