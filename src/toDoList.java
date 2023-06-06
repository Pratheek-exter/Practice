import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class toDoList {
    private List<String> tasks;

    public toDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        toDoList todoList = new toDoList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the To-Do List!");

        while (true) {
            System.out.println();
            System.out.println("Select an option:");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. Display tasks");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a task: ");
                    String task = scanner.nextLine();
                    todoList.addTask(task);
                    System.out.println("Task added.");
                    break;
                case 2:
                    System.out.print("Enter the task index to remove: ");
                    int index = scanner.nextInt();
                    todoList.removeTask(index - 1);
                    System.out.println("Task removed.");
                    break;
                case 3:
                    System.out.println("Tasks:");
                    todoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
