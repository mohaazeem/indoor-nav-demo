package demo.indoornavigationdemo.model;

/**
 * Created by mohamedabdel-azeem on 9/9/16.
 */
public class Node {

    private String label;
    private double x;
    private double y;
    private int graphId; // Might be changed later to long

    public Node() {}

    public Node(String label, double x, double y, int graphId) {
        this.label = label;
        this.x = x;
        this.y = y;
        this.graphId = graphId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getGraphId() {
        return graphId;
    }

    public void setGraphId(int graphId) {
        this.graphId = graphId;
    }
}
