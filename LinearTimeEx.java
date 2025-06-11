package projectofjava;

public class LinearTimeEx {
	public static void printAllElements(int[] arr) {
		for(int i=0;i< arr.length;i++) {
			System.out.println("Element "+i+":"+arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,20,30,40,50,60,70,80,90,100,55,4,45,48,49,74,12};
		printAllElements(num);
	}

}
