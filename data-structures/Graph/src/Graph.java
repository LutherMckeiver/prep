import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Map<Integer, ArrayList<Integer>> adjacencyLists;

    public Graph(int vertices){
        adjacencyLists = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 1; i <= vertices; i++){
            ArrayList<Integer> neighbors = new ArrayList<>();
            adjacencyLists.put(i, neighbors);
        }
    }

    public void addEdge(int v, int w){
        if (v > adjacencyLists.size() || w > adjacencyLists.size()){
            return;
        }
        (adjacencyLists.get(v)).add(w);
        (adjacencyLists.get(w)).add(v);
    }

    public ArrayList<Integer> getNeighbors(int v){
        if (v > adjacencyLists.size()){
            return null;
        }
        return new ArrayList<Integer>(adjacencyLists.get(v));
    }

    public static void main(String[] args) {

    }
}
