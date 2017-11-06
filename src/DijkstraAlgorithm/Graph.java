package DijkstraAlgorithm;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2017-11-02.
 */
public class Graph <T> {
    private List<Vertex<T>> vertices = new ArrayList<>();

    public Graph(){}
    public Graph(List<Vertex<T>> vertices) throws IllegalArgumentException{
        this.vertices = vertices;
        if(vertices.isEmpty()) throw new IllegalArgumentException("there are no vertices");
    }
    public void addVertex(Vertex<T> v){
        vertices.add(v);
    }
    public int size(){
        return vertices.size();
    }

    public List<Vertex<T>> getVertices() {
        return vertices;
    }
}
