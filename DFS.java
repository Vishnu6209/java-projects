package projectofjava;
import java.util.*;
import java.util.HashSet;
public class DFS {
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
		DFS obj=new DFS();
		obj.assRoom("LivingRoom", "kitchen");
		obj.assRoom("LivingRoom", "BedRoom");
		obj.assRoom("BedRoom", "BathRoom");
		
		obj.dfs("LivingRoom");
	}

}