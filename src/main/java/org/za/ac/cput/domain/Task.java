package org.za.ac.cput.domain;

import java.time.LocalDate;

public class Task {
    //Attributes
    private String title;
    private String description;
    private String priority;
    private String taskID;
    private String status;
    private LocalDate deadLine;

    //Constructors
    private Task() {

    }

    private Task(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.priority = builder.priority;
        this.taskID = builder.taskID;
        this.status = builder.status;
        this.deadLine = builder.deadLine;
    }

    //toString method

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", taskID='" + taskID + '\'' +
                ", status='" + status + '\'' +
                ", deadLine=" + deadLine +
                '}';
    }

    public static class Builder {
        //Attributes
        private String title;
        private String description;
        private String priority;
        private String taskID;
        private String status;
        private LocalDate deadLine;

        //Setters
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }
        public Builder setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public Builder setTaskID(String taskID) {
            this.taskID = taskID;
            return this;
        }
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }
        public Builder setDeadLine(LocalDate deadLine) {
            this.deadLine = deadLine;
            return this;
        }

        //Copy method
        public Builder copy(Task task) {
            this.title = task.title;
            this.description = task.description;
            this.priority = task.priority;
            this.taskID = task.taskID;
            this.status = task.status;
            this.deadLine = task.deadLine;
            return this;
        }

        //Build method
        public Task build() {
            return new Task(this);
        }
    }
}

