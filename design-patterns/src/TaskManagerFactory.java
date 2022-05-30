import java.util.ArrayList;

public class TaskManagerFactory {


    public static TaskManager createTaskManager() {
        TaskManager taskManager = new ListTaskManager(new ArrayList<>());
        return taskManager;
    }
}

