import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		String userName;
		String taskInfo;
		String dueDate;
		String markTaskComplete;

		ArrayList<Task> tasks = new ArrayList();

		while (userInput != 5) {
			System.out.println("1. List tasks");
			System.out.println("2. Add task");
			System.out.println("3. Delete task");
			System.out.println("4. Mark task complete");
			System.out.println("5. Quit");

			userInput = scan.nextInt();

			switch (userInput) {
			case 1:
				int counter = 1;

				for (Task t : tasks) {
					System.out.println(counter++ + ". " + t);
				}
				System.out.println();
				break;

			case 2:
				scan.nextLine();
				System.out.println("Input Task information");
				System.out.println("Team member's name: ");
				userName = scan.nextLine();
				System.out.println("Task Description: ");
				taskInfo = scan.nextLine();
				System.out.println("Due Date: (xx/xx/xxxx) ");
				dueDate = scan.nextLine();
				System.out.println("Task Entered");
				Task t = new Task(userName, taskInfo, dueDate);
				tasks.add(t);

				System.out.println(tasks);
				break;
			case 3:
				System.out.println("Enter the number of the task you'd like to delete:");
				int userChoice = scan.nextInt();
				tasks.remove(userChoice - 1);
				System.out.println(tasks);
				break;
			case 4:
				System.out.println("Which task would you like to mark Complete: ");
				int userNum = scan.nextInt();
				int userNum1 = (userNum - 1);
				Task.setMarkTaskComplete(true);

			case 5:
				System.out.println("Thank you for using Q's Task Manager!");
				break;
			}

		}

	}

}
