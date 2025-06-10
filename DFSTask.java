package projectofjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFSTask {
	private Map<String,List<String>> homemap=new HashMap<String, List<String>>();
	private Set<String> visited=new HashSet<String>();
	public void assRoom(String room,String crooms) {
		homemap.computeIfAbsent(room, k-> new ArrayList<>()).add(crooms);
		homemap.computeIfAbsent(crooms,k-> new ArrayList<>()).add(room);
	}
	public void dfs(String crr) {
		if(visited.contains(crr)) return ;
		visited.add(crr);
		System.out.println("visited:"+crr);
		for (String n:homemap.getOrDefault(crr, new ArrayList<String>())) {
			dfs(n);
		}
	}
	public static void main(String[] args) {
		DFSTask obj=new DFSTask();
		obj.assRoom("A", "B");
		obj.assRoom("A", "C");
		obj.assRoom("B", "D");
		obj.assRoom("B", "E");
		obj.assRoom("C", "F");
		obj.assRoom("C", "G");
		obj.dfs("A");
	}

}
