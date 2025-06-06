package projectofjava;

public class PriorityProgram {
	public static void main(String[] args) {
		Thread lowpriorityThread=new Thread(()->{
		for(int i=1;i<=5;i++) {
			System.out.println("Low priority Thread"+i);
		}
	});
	Thread HighPriorityThread = new Thread(() ->{
		for(int i=1;i<=5;i++) {
			System.out.println("high priority thrad"+i);
		}});
		lowpriorityThread.setPriority(Thread.MIN_PRIORITY);
		HighPriorityThread.setPriority(Thread.MAX_PRIORITY);
		
		lowpriorityThread.start();
		HighPriorityThread.start();
}
}