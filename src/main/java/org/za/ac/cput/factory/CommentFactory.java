//Author: Saidi Mwamchera
package org.za.ac.cput.factory;

import org.za.ac.cput.domain.Comment;
import org.za.ac.cput.domain.Task;
import org.za.ac.cput.domain.User;
import org.za.ac.cput.util.Helper;

import java.util.Date;

public class CommentFactory {
    public static Comment createComment(int commentId, String content, Date timeStamp, Task task, User user){
        if(Helper.isNullOrEmpty(content)){
            throw new IllegalArgumentException("Content cannot be empty");
        }

        return new Comment.Builder()
                .setCommentId(commentId)
                .setContent(content)
                .setTask(task)
                .setTimeStamp(timeStamp)
                .setUser(user)
                .build();
    }
}
