import DijkstraAlgorithm.DijkstraAlgorithm;
import DijkstraAlgorithm.Vertex;
import DijkstraAlgorithm.Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2017-11-02.
 */
public class Main {
    public static void main(String[] args) {
        Vertex<String>wroclaw=new Vertex<String>("Wroclaw");
        Vertex<String>katowice=new Vertex<String>("Katowice");
        Vertex<String>lodz=new Vertex<String>("Lodz");
        Vertex<String>warszawa=new Vertex<String>("Warszawa");
        Vertex<String>poznan=new Vertex<String>("Poznan");
        Vertex<String>krakow=new Vertex<String>("Krakow");
        Vertex<String>gdansk=new Vertex<String>("Gdansk");
        Vertex<String>gdynia=new Vertex<String>("Gdynia");
        Vertex<String>newYork=new Vertex<String>("NewYork");
        Vertex<String>boston=new Vertex<String>("Boston");
        wroclaw.link(lodz,216.8f);
        wroclaw.link(poznan,184.4f);
        wroclaw.link(katowice,194.5f);
        krakow.link(katowice,80.36f);
        krakow.link(warszawa,294.8f);
        krakow.link(lodz,266.8f);
        lodz.link(warszawa,139.1f);
        poznan.link(lodz,217.8f);

        poznan.link(gdansk,337.9f);
        lodz.link(gdansk,336.9f);
        warszawa.link(gdansk,417.4f);
        gdynia.link(gdansk,22.4f);
        boston.link(newYork,345.6f);
        Graph graph = new Graph();
        graph.addVertex(wroclaw);
        graph.addVertex(katowice);
        graph.addVertex(warszawa);
        graph.addVertex(lodz);
        graph.addVertex(poznan);
        graph.addVertex(krakow);
        graph.addVertex(gdansk);
        graph.addVertex(gdynia);
        graph.addVertex(newYork);
        graph.addVertex(boston);
        DijkstraAlgorithm l = new DijkstraAlgorithm();
        System.out.println(l.DijkstraDistance(graph,wroclaw, lodz));


    }
}
