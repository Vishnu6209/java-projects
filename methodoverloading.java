package projectofjava;

public class methodoverloading {
	public int adds(int a,int b) {
		return a+b;
	}
	public double adds(double a,double b) {
		return a*b;
	}
	public String adds(String a,String b) {
		return a+b;
	}
	public static void main(String[] args) {
		methodoverloading ml=new methodoverloading();
		System.out.println(ml.adds(2, 30));
		System.out.println(ml.adds(12.3, 13.3));
		System.out.println(ml.adds("mukka", "vishnu"));
	}
}
