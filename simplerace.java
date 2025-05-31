package projectofjava;
class car extends Thread{
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
class bike extends Thread{
	public void run(){
		for (int i=0;i<=3;i++)
		{
			System.out.println("kawasaki car moving"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class simplerace {
	public static void main(String[] args)
	{
		car c=new car();
		bike b=new bike();
		c.start();
		b.start();
	}
}
