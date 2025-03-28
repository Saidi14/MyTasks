/*
Author: Saidi Mwamchera 230017363
*/
package org.za.ac.cput.domain;

import java.util.Date;

public class Comment {
    private int commentId;
    private String content;
    private Date timeStamp;
    private Task task;
    private User user;

    private Comment(Builder builder){
        this.commentId = builder.commentId;
        this.content = builder.content;
        this.timeStamp = builder.timeStamp;
        this.task = builder.task;
        this.user = builder.user;
    }

    public int getCommentId() {
        return commentId;
    }

    public String getContent() {
        return content;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public Task getTask() {
        return task;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", content='" + content + '\'' +
                ", timeStamp=" + timeStamp +
                ", task=" + task +
                ", user=" + user +
                '}';
    }

    public static class Builder{
        private int commentId;
        private String content;
        private Date timeStamp;
        private Task task;
        private User user;

        public Builder setCommentId(int commentId){
            this.commentId = commentId;
            return this;
        }

        public Builder setContent(String content){
            this.content = content;
            return this;
        }
        public Builder setTimeStamp(Date timeStamp){
            this.timeStamp = timeStamp;
            return this;
        }
        public Builder setTask(Task task){
            this.task = task;
            return this;
        }
        public Builder setUser(User user){
            this.user = user;
            return this;
        }
        public Comment build(){
            return new Comment(this);
        }
    }
}
