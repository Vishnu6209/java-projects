package projectofjava;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class AdvancedGraph {
	static class graph{
		  private Map<Integer, java.util.List<Integer>> adj=new HashMap<Integer, List<Integer>>();
		  void addEdge(int u,int v) {
			  adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
			  adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
		  }
		  void printgraph() {
			  for(int node:adj.keySet()) {
				  System.out.println("Node "+node+" is connected to:");
			  
			  for(int neighbor:adj.get(node)) {
				  System.out.println(neighbor+" ");
			  }}
		  }
	}

	public static void main(String[] args) {
		graph g1=new graph();
		g1.addEdge(1, 2);
		g1.addEdge(1, 3);
		g1.addEdge(1, 4);
		g1.addEdge(1, 5);
		g1.printgraph();

	}

}
