package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2017-11-02.
 */
public class Vertex<T> implements Comparable<Vertex<T>>{
    private final List<Edge<T>> edges = new ArrayList<>();
    private final T name;
    private Float calulatedDistance = 0f;
    protected List<T> path = new ArrayList<T>();
    public void add(T name){
        path.add(name);
    }

    public Vertex() {
        this.name = null;
    }

    public Float getCalulatedDistance() {
        return calulatedDistance;
    }

    public void setCalulatedDistance(Float calulatedDistance) {
        this.calulatedDistance = calulatedDistance;
    }

    public Vertex(T name) {
        this.name = name;

    }
    public T getName(){
        return name;
    }
    public void link(Vertex<T> vertex, float weight){
        Edge<T> edge = new Edge<T>(this, vertex, weight);
        edges.add(edge);
        vertex.edges.add(edge);
    }
    public Vertex[] getLinks(){
        Vertex[] vertex = new Vertex[edges.size()];
        for (int i = 0; i <edges.size(); i++) {
            vertex[i] =this.edges.get(i).getOtherVertex(this);
        }return vertex;

    }
     Edge<T>[] getEgdes(){
        Edge[] array = new Edge[edges.size()];
        for (int i = 0; i <edges.size() ; i++) {
            array[i] = edges.get(i);
        }
        return array;
    }

    @Override
    public String toString() {
        return name.toString();
    }

    @Override
    public int compareTo(Vertex o) {
        return calulatedDistance.compareTo(o.calulatedDistance);
    }
}
