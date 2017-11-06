package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2017-11-06.
 */
public class DestinationVertex<T> extends Vertex<T>  {
    private T name;
    private T originName;
    private List<T> path = new ArrayList<T>();
    private Float calulatedDistance = 0f;
    public DestinationVertex(Vertex<T> origin, Vertex<T> dest) {
        this.name = dest.getName();
        this.path = dest.path;
        this.originName = origin.getName();
        this.calulatedDistance = dest.getCalulatedDistance();
    }

    @Override
    public String toString() {
        return originName+"->"+name+"\n"+calulatedDistance+"\n"+path.toString();
    }
}
