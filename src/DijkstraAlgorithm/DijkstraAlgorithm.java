package DijkstraAlgorithm;

import java.util.*;


/**
 * Created by Lenovo on 2017-11-02.
 */
public class DijkstraAlgorithm<T> {
    private List<Object> pastVertices = new ArrayList<>();


    public DestinationVertex<T> DijkstraDistance(Graph<T> graph, Vertex<T> origin, Vertex<T> destination) {
        Set<Vertex<T>> set = new HashSet<>(graph.getVertices());
        /*for (Vertex<T vertex:set) {
            if(vertex !=origin)
            vertex.setCalulatedDistance(Float.MAX_VALUE);
            else vertex.setCalulatedDistance(0f);
        }
        origin.setCalulatedDistance(0f);*/ //Stream zamiast pętli.
        set.stream().filter(vertex -> vertex != origin).forEach(v -> v.setCalulatedDistance(Float.MAX_VALUE));
        origin.setCalulatedDistance(0f);
        Queue<Vertex<T>> vertices = new PriorityQueue<Vertex<T>>(set);
        while (!vertices.isEmpty()) {
            Vertex<T> CurrentVertex = vertices.remove();
            for (Edge<T> edge : CurrentVertex.getEgdes()) {
                float newCalculatedDistane = edge.getLength() + CurrentVertex.getCalulatedDistance();
                if (newCalculatedDistane < edge.getOtherVertex(CurrentVertex).getCalulatedDistance()){
                    edge.getOtherVertex(CurrentVertex).setCalulatedDistance(newCalculatedDistane);
                    edge.getOtherVertex(CurrentVertex).add(CurrentVertex.getName());
                }
            }
        }

        return new DestinationVertex<T>(origin, destination);
    }


}

