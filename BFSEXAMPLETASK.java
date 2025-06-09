package projectofjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSEXAMPLETASK {

	public static void main(String[] args) {
		Map<String, List<String>> house=new HashMap<>();
		house.put("entrance", Arrays.asList("reptaile house","bird sanctuary","mammal zone"));
		house.put("reptaile house", Arrays.asList("snake pit"));
		house.put("bird sanctuary", Arrays.asList("parrot pavilion"));
		house.put("mammal zone", Arrays.asList("lion den","elephant enclosure"));
		house.put("repataile house", new ArrayList<String>());
		house.put("bird sanctuary", new ArrayList<String>());
		house.put("mammal zone", new ArrayList<String>());
		house.put("snake pit", new ArrayList<String>());
		house.put("parrot pavilion", new ArrayList<String>());
		house.put("lion den", new ArrayList<String>());
		house.put("elephant enclosure", new ArrayList<String>());
		bfs2(house, "entrance");

	}
	public static void bfs2(Map<String, List<String>>house,String sr) {
		Queue<String> q=new LinkedList<>();
		Set<String> s=new HashSet<String>();
		q.add(sr);
		s.add(sr);
		while (!q.isEmpty()) {
			String crr=q.poll();
			System.out.println("visited:"+crr);
			for( String nei:house.get(crr)) {
				if(!s.contains(nei)) {
					q.add(nei);
					s.add(nei);
				}
			}
		}
	}

}
