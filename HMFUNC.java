package projectofjava;

import java.util.HashMap;

public class HMFUNC {

	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1,"subhash");
		hs.put(2,"sumanth");
		hs.put(3,"vishnu");
		hs.put(4,"viswa");
		hs.put(5,"mukkka");
		hs.remove(2);
		System.out.println(hs);
		hs.put(4, "pamuru");
		System.out.println(hs);
		System.out.println(hs.containsKey(5));//checking key is theire are not
		System.out.println(hs.containsValue("pamuru"));//checking values or objects are their or not
		Set<Integer> keys = hs.keySet();
		System.out.println("Keys: " + keys);
		Collection<String> values=hs.values();
		System.out.println("values: " + values);
		for (Map.Entry<Integer, String> entry : hs.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}

}
