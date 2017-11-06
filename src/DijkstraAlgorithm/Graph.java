package DijkstraAlgorithm;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2017-11-02.
 */
public class Graph {
    private List<Vertex> vertices = new ArrayList<>();

    public Graph(){}
    public Graph(List<Vertex> vertices) throws IllegalArgumentException{
        this.vertices = vertices;
        if(vertices.isEmpty()) throw new IllegalArgumentException("there are no vertices");
    }
    public void addVertex(Vertex v){
        vertices.add(v);
    }
    public int size(){
        return vertices.size();
    }

    public List<Vertex> getVertices() {
        return vertices;
    }
}
