//Author: Saidi Mwamchera
package org.za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import org.za.ac.cput.domain.Comment;
import org.za.ac.cput.domain.User;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CommentFactoryTest {
    @Test
    public void testCreateComment(){
        Comment comment = CommentFactory.createComment(1,
                "A test comment",
                new Date(),
                TaskFactory.createTask("Test task", "test description", "High", "2312", "testStatus"),
                new User()
                );
        System.out.println(comment.toString());
    }
    @Test
    public void testEmptyComment(){
        Comment comment = CommentFactory.createComment(1,
                "",
                new Date(),
                TaskFactory.createTask("Test task", "test description", "High", "2312", "testStatus"),
                new User()
        );
        System.out.println(comment.toString());
    }
}