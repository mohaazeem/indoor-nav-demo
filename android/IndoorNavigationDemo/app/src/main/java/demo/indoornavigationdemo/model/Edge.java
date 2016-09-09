package demo.indoornavigationdemo.model;

/**
 * Created by mohamedabdel-azeem on 9/9/16.
 */
public class Edge {

    private Node startNode;
    private Node endNode;
    private double distance;
    private int graphId; // Might be changed later to long

    public Edge() {}

    public Edge(Node startNode, Node endNode, double distance, int graphId) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.distance = distance;
        this.graphId = graphId;
    }

    public Node getStartNode() {
        return startNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public void setEndNode(Node endNode) {
        this.endNode = endNode;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getGraphId() {
        return graphId;
    }

    public void setGraphId(int graphId) {
        this.graphId = graphId;
    }
}
