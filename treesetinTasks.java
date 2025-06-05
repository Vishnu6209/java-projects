package projectofjava;
import java.util.*;
public class treesetinTasks {
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				TreeSet<Integer> TS=new TreeSet<Integer>();
				TS.add(5002);
				TS.add(4998);
				TS.add(5005);
				TS.add(4999);
				TS.add(5001);
				System.out.println(TS.first());
				System.out.println(TS.last());
				System.out.println(TS.higher(4999));
				System.out.println(TS.lower(5005));
				TreeSet<String> student=new TreeSet<String>();
				student.add("sumit");
				student.add("karan");
				student.add("anjali");
				student.add("mohan");
				student.add("zoya");
				Iterator<String> it=student.descendingIterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				String s=sc.next();
				if(student.contains(s)) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
			}

		}
