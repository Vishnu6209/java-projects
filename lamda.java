package projectofjava;
interface msg{
	void say();
}

public class lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		msg hm=()->System.out.println("this is lamdda function");
		hm.say();
	}

}
