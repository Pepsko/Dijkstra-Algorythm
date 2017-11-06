package DijkstraAlgorithm;

import java.util.*;


/**
 * Created by Lenovo on 2017-11-02.
 */
public class DijkstraAlgorithm {


    public Float DijkstraDistance(Graph graph, Vertex origin, Vertex destination){
        Set<Vertex> set = new HashSet<>(graph.getVertices());
        /*for (Vertex vertex:set) {
            if(vertex !=origin)
            vertex.setCalulatedDistance(Float.MAX_VALUE);
            else vertex.setCalulatedDistance(0f);
        }
        origin.setCalulatedDistance(0f);*/ //Stream zamiast pętli.
        set.stream().filter(vertex->vertex != origin).forEach(v-> v.setCalulatedDistance(Float.MAX_VALUE));
        origin.setCalulatedDistance(0f);
        Queue<Vertex> vertices = new PriorityQueue<Vertex>(set);
        while(!vertices.isEmpty()){
            Vertex temp = vertices.remove();
            for (Edge edge:temp.getEgdes()) {
                if(edge.getLength()+temp.getCalulatedDistance()<edge.getOtherVertex(temp).getCalulatedDistance())edge.
                        getOtherVertex(temp).setCalulatedDistance(edge.getLength()+temp.getCalulatedDistance());
            }
        }

        return destination.getCalulatedDistance();
    }



}

