package projectofjava;

public class QuadraticTimeEx {
	public static void main(String[] args) {
		int[] n= {10,02,30,40,50};
		boolean dup=false;
		for(int i=0;i<n.length;i++)
		{
			for (int j=0;j<n.length;j++) {
				if(n[i]==n[j]) {
					dup=true;
					System.out.println("duplicate found:"+n[i]);
				}
			}
		}
		if(!dup) {
			System.out.println("no duplicate found");
		}
	}

}
