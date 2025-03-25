package org.za.ac.cput;

import org.za.ac.cput.domain.Task;
import org.za.ac.cput.factory.TaskFactory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Task task = TaskFactory.createTask("Clean shoes", "Clean the white shoes", "Low", "sh234k", "Not complete");

        System.out.println(task.toString());

    }
}