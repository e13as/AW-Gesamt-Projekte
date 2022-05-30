import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTaskManager implements TaskManager {

    public List<Task> taskList;

    public ListTaskManager(List<Task> taskList){
        this.taskList = taskList;
    }

    @Override
    public void addTask(Task task) {
        this.taskList.add(task);
    }

    @Override
    public void performTasks() {
        for(Task task : taskList){
            task.perform(System.out);//Davor: System.out.println(task)
            }
    }
}
