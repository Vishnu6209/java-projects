package projectofjava;

public class LOGTIMEEXAMPLE {

	public static void main(String[] args) {
		int[] n={10,20,30,40,50,80,90,100,110,120};
		int tar=40;
		int low=0;
		int high=n.length-1;
		while(low<= high) {
			int mid=(low + high)/2;
			if(n[mid]==tar) {
				System.out.println("found number "+tar+"  at positin"+mid);
				return ;
			}else if(n[mid]<tar) {
				low=mid+1;
				
			}
			else {
				high=mid-1;
			}
		}
		System.out.println("number not found");
	}

}
