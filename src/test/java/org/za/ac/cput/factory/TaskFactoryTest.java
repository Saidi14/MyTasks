package za.ac.cput.TaskFactory;

import org.junit.Test;
import za.ac.cput.domain.Task;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTest {
    private static Task t1 = TaskFactory.createTask(1,"Factory Check in progress","Check the succes of the production",
            LocalDate.of(2025, 3, 27),Task.Priority.HIGH,"In Progress","Lisakhanya Mpahla 230126669");

    @Test
public void testCreateTask(){
     assertNotNull(t1);
     System.out.println(t1.toString());
    }
   @Test
   public void testCreatetaskWithAllAttributes(){

   }
   @Test
    public void testCreateTaskThatFails(){
       // fail();
   }
   @Test
   public void testNootImplementesYet(){}
}