package org.za.ac.cput;

import org.za.ac.cput.domain.Task;
import org.za.ac.cput.factory.TaskFactory;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import java.time.LocalDate;

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

            System.out.println("\nEnter task title: ");
            String title = scanner.nextLine();

            System.out.print("\nTask description: ");
            String description = scanner.nextLine();

            System.out.print("\nTask priority (Low, Medium, or High: ");
            String priority = scanner.nextLine();

            Task task = TaskFactory.createTask(title, description, priority, taskId, "Not complete");
            System.out.println(task.toString());
        }

    }
}