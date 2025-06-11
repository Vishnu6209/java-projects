package projectofjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {
	public static void main(String[] args) {
		ArrayList<String> ss=new ArrayList<String>();
		ss.add("akhil");
		ss.add("sumanth");
		ss.add("praveen");
		ss.add("vishnu");
		Collections.sort(ss);
		System.out.println(ss);
		String[] ss1= {"akhil","sumanth","praveen","vishnu"};
		for(int i=0;i<ss1.length-1;i++) {
			for (int j=0;j<ss1.length-1-i;j++) {
				if(ss1[j].compareTo(ss1[j + 1]) > 0) {
					String temp=ss1[j];
					ss1[j]=ss1[j+1];
					ss1[j+1]=temp;
				}
			}
		}
		for(String n:ss1) {
			System.out.println(n);
		}
		Collections.reverse(ss);
		System.out.println(ss);
		List<Integer> ll=new ArrayList<>();
		ll.add(20);
		ll.add(33);
		ll.add(35);
		Collections.reverse(ll);
		System.out.println(ll);
	}
}
