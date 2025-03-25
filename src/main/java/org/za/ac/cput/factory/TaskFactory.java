package org.za.ac.cput.factory;

import org.za.ac.cput.domain.Task;
import org.za.ac.cput.util.Helper;

public class TaskFactory {

    public static Task createTask(String title, String description, String priority, String taskID, String status) {
        if(Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(priority) || Helper.isNullOrEmpty(taskID) || Helper.isNullOrEmpty(status));

        return new Task.Builder().setTitle(title)
                    .setDescription(description)
                    .setPriority(priority)
                    .setTaskID(taskID)
                    .setStatus(status)
                    .build();
    }

}
