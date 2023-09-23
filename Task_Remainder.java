import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//Task class to represent individual tasks
class Task {
    private String title;
    private String description;
    private Date dueDate;
    private boolean completed;

    public Task(String title, String description, Date dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = false;
    }

    //getter methods
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    //method to mark a task as completed
    public void markAsCompleted() {
        completed = true;
    }
}

//TaskRemainder class to manage tasks
class TaskRemainder {
    private List<Task> tasks = new ArrayList<>();

    //method to add new tasks
    public void addTask(Task task) {
        tasks.add(task);
    }

    //method to retrieve all tasks
    public List<Task> getTasks() {
        return tasks;
    }

    //method to retrieve completed tasks
    public List<Task> getCompletedTasks() {
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }
}

public class Task_Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskRemainder taskRemainder = new TaskRemainder();

        while (true) {
            System.out.println("\nTask Reminder System");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. List Completed Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {

                case 1:
                //option to add new book
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter due date (yyyy-MM-dd): ");
                    String dueDateStr = scanner.nextLine();

                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Date dueDate = dateFormat.parse(dueDateStr);
                        Task task = new Task(title, description, dueDate);
                        taskRemainder.addTask(task);
                        System.out.println("Task added successfully.");
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                    }
                    break;
                case 2:
                    //option to list tasks
                    listTasks(taskRemainder.getTasks());
                    break;
                case 3:
                    //option to mark a task as completed
                    markTaskAsCompleted(scanner, taskRemainder);
                    break;
                case 4:
                    //
                    listTasks(taskRemainder.getCompletedTasks());
                    break;
                case 5:
                    //option to exit the program
                    System.out.println("\nThank You!! Please Visit Again.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please Enter a Valid Option.");
            }
        }
    }

    //method to list tasks
    private static void listTasks(List<Task> tasks) {
        System.out.println("\nTasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". Title: " + task.getTitle());
            System.out.println("   Description: " + task.getDescription());
            System.out.println("   Due Date: " + new SimpleDateFormat("yyyy-MM-dd").format(task.getDueDate()));
            System.out.println("   Status: " + (task.isCompleted() ? "Completed" : "Not Completed"));
        }
    }

    //method to mark a task as completed
    private static void markTaskAsCompleted(Scanner scanner, TaskRemainder taskRemainder) {
        System.out.print("Enter the task number to mark as completed: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber >= 1 && taskNumber <= taskRemainder.getTasks().size()) {
            Task taskToComplete = taskRemainder.getTasks().get(taskNumber - 1);
            taskToComplete.markAsCompleted();
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
