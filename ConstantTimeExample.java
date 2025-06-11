package projectofjava;

public class ConstantTimeExample {
	public static void printFirstElement(int[] arr){
		if(arr.length>0) {
			System.out.println("first element is:" +arr[0]);}
		else {
			System.out.println("Array is empty");
	}
		}
	public static void main(String[] args) {
		int[] number= {10,20,30,40,50,60,70,80,90,100,55,4,45,48,49,74,12};
		printFirstElement(number);
		System.out.println(number);
	}

}
