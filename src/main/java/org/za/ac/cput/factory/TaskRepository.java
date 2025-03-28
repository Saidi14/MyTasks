package za.ac.cput.Repository;

import za.ac.cput.domain.Task;

import java.util.List;

public interface TaskRepository {

    void create(Task task);

    Task read(int taskId); //

    void update(Task task); //

    void delete(int taskId); //


    List<Task> findTasksByStatus(String status);
    List<Task> findTasksByPriority(Task.Priority priority);
}

