package DijkstraAlgorithm;

/**
 * Created by Lenovo on 2017-11-02.
 */
public class Edge {
    private static final int numberOfVertex = 2;
    private Float length;
    private Vertex[] vertex = new Vertex[numberOfVertex];


    Edge( Vertex vertex1, Vertex vertex2, float weight)throws IllegalArgumentException {
        if(vertex1==vertex2) throw new IllegalArgumentException("Edge must link different vertices");
        this.length = weight;
        this.vertex[0] = vertex1;
        this.vertex[1] = vertex2;
    }
    public Vertex getOtherVertex(Vertex other){
        if(other == vertex[0])
        return vertex[1];
        else return vertex[0];
    }
    public Float getLength(){
        return this.length;
    }
}
