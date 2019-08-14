import java.util.ArrayList;

public class Task {
	private String userName;
	private String taskInfo;
	private String dueDate;
	private static boolean markTaskComplete;

	public Task() {
		markTaskComplete = false;

	}

	public Task(String userName, String taskInfo, String dueDate) {
		this.userName = userName;
		this.taskInfo = taskInfo;
		this.dueDate = dueDate;
		markTaskComplete = false;

	}

	
	public static void setMarkTaskComplete(boolean markTaskComplete) {
		Task.markTaskComplete = markTaskComplete;
	}

	public static boolean getMarkTaskComplete() {
		return markTaskComplete;
	}

	@Override
	public String toString() {
		return "Team Member = " + userName + ", Description = " + taskInfo + ", Due Date = " + dueDate
				+ ", Task Complete = " + markTaskComplete;
	}
}