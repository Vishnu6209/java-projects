import java.util.*;
class ToDoListApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> tasks=new ArrayList<>();
		
		while(true){
			System.out.println("simple To-Do-List-App");
			System.out.println("1.Add a Task");
			System.out.println("2.view a task");
			System.out.println("3.Delete a Task");
			System.out.println("4.Exit");
			System.out.println("choose an option(1-4)");
			
			int choice=sc.nextInt();
			sc.nextLine();
			
		
		if(choice == 1){
			System.out.println("Enter your Task");
			String task=sc.nextLine();
			tasks.add(task);
			System.out.println("Task Added Succesfully");
		}
		if(choice==2){
			if(tasks.isEmpty()){
				System.out.println("No task found");
			}
			else{
				System.out.println("Your Task");
				for(int i=0;i<tasks.size();i++){
					System.out.println((i+1)+" "+tasks.get(i));
				}
			}
		}
		if(choice==3){
			if(tasks.isEmpty()){
				System.out.println("Noyhing to deleted");
			}
			else{
				System.out.println("Enter the task to Delete:");
				int tasknum=sc.nextInt();
				if(tasknum>1 && tasknum<=tasks.size()){
					tasks.remove(tasknum-1);
					System.out.println("Task Deleted");
				}
				
			}
		}else if(choice==4){
			System.out.println("Goodbye ||");
			break;
		}else{
			System.out.println("plese choose a valid option");
		}
		}
		
	}

}