package org.za.ac.cput.factory;

import org.za.ac.cput.domain.Task;
import org.za.ac.cput.util.Helper;

//Samnkelo Ngxande 221311564

public class TaskFactory {

    public static Task createTask(String title, String description, String priority, String taskID, String status) {
        if(Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(priority) || Helper.isNullOrEmpty(taskID) || Helper.isNullOrEmpty(status)) {
            throw new IllegalArgumentException("Check the arguments in 'createTask()'");
        }

        //For priority and status
        Task.Priority taskPriority;
        try {
            taskPriority = Task.Priority.valueOf(priority);
        }catch(IllegalArgumentException iae) {
            throw new IllegalArgumentException("Invalid input: " + priority);
        }

        Task.Status taskStatus;
        try{
            taskStatus = Task.Status.valueOf(status);
        }
        catch(IllegalArgumentException iae) {
            throw new IllegalArgumentException("Invalid input: " + status);
        }


        return new Task.Builder().setTitle(title)
                    .setDescription(description)
                    .setPriority(taskPriority)
                    .setTaskID(taskID)
                    .setStatus(taskStatus)
                    .build();
    }

}
