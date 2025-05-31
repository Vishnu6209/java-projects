package projectofjava;
class Car implements Runnable{
	public void run(){
		for (int i=0;i<=3;i++)
		{
			System.out.println("BMW car moving"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}
class Bike implements Runnable{
	public void run(){
		for (int i=0;i<=3;i++)
		{
			System.out.println("ninja h20r bike moving"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class runnablei {
	public static void main(String[] args)
	{
		Thread cat=new Thread(new Car());
		Thread bk=new Thread(new Bike());
		System.out.println("Goooo..");
		cat.start();
		bk.start();
	}
}