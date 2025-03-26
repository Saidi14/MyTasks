package org.za.ac.cput;

import org.za.ac.cput.domain.Task;
import org.za.ac.cput.factory.TaskFactory;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        //Random
        Random random = new Random();

        System.out.print("Enter 'A' to create a task or 'E' to exit: ");

        if(scanner.nextLine().equalsIgnoreCase("A")) {
            int randomNumber = random.nextInt(1111)+1111;
            String taskId = Integer.toString(randomNumber);

            System.out.print("\nEnter task title: ");
            String title = scanner.nextLine();

            System.out.print("\nTask description: ");
            String description = scanner.nextLine();

            //Testing the new way of selecting priority
            System.out.print("\nTask priority (1.Low, 2.Medium, or 3.High: )");
            System.out.print("\nEnter priority number (1, 2, or 3): ");
            int priorityChoice = scanner.nextInt();
            System.out.println(); // This line is not necessary, it's just for format on the console.

            Task.Priority priority;
            switch (priorityChoice) {
                case 1:
                    priority = Task.Priority.Low;
                    break;
                case 2:
                    priority = Task.Priority.Medium;
                    break;
                case 3:
                    priority = Task.Priority.High;
                    break;
                default:
                    priority = Task.Priority.Low;
            }

            Task task = TaskFactory.createTask(title, description, priority.toString(), taskId, String.valueOf(Task.Status.Not_Complete));
            System.out.println(task.toString());
        }

    }
}