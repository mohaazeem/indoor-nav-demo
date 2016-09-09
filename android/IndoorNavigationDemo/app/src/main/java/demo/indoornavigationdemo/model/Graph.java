package demo.indoornavigationdemo.model;

import java.util.ArrayList;

/**
 * Created by mohamedabdel-azeem on 9/9/16.
 */
public class Graph {

    private ArrayList<Node> nodes;
    private ArrayList<Edge> edges;
    private String graphJson;

    public Graph() {}

    public Graph(ArrayList<Node> nodes, ArrayList<Edge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public String getGraphJson() {
        return graphJson;
    }

    public void setGraphJson(String graphJson) {
        this.graphJson = graphJson;
    }

    /**
     * TODO:
     * @param n
     * This method is responsible for adding a node to the graph
     */
    public void addNode(Node n) {

    }

    /**
     * TODO:
     * @param e
     * This method is responsible for adding an edge to the graph
     */
    public void addEdge(Edge e) {

    }
}
