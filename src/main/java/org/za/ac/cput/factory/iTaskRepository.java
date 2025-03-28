package za.ac.cput.Repository;


import za.ac.cput.domain.Task;

import java.util.ArrayList;
import java.util.List;

public class iTaskRepository implements TaskRepository {

    private List<Task> taskList = new ArrayList<>();

    @Override
    public void create(Task task) {
        taskList.add(task);
    }

    @Override
    public Task read(int taskId) {
        for (Task task : taskList) {
            if (task.getTaskId() == taskId) {
                return task;
            }
        }
        return null;
    }

    @Override
    public void update(Task task) {
        Task existingTask = read(task.getTaskId());
        if (existingTask != null) {
            taskList.remove(existingTask);
            taskList.add(task);
        }
    }

    @Override
    public void delete(int taskId) {
        Task task = read(taskId);
        if (task != null) {
            taskList.remove(task);
        }
    }

    @Override
    public List<Task> findTasksByStatus(String status) {
        List<Task> result = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getStatus().equalsIgnoreCase(status)) {
                result.add(task);
            }
        }
        return result;
    }

    @Override
    public List<Task> findTasksByPriority(Task.Priority priority) {
        List<Task> result = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getPriority() == priority) {
                result.add(task);
            }
        }
        return result;
    }
}
