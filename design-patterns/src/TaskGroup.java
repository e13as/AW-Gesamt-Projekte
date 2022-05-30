import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class TaskGroup implements Task {

    private List<Task> liste;
    private String name;

    public TaskGroup(String name) {
        liste = new ArrayList<>();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubTask(Task task) {
        liste.add(task);
    }

    public List<Task> getlist(){
        return liste;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    void addObserver(TaskObserver observer){

    }

    @Override
    public void perform(PrintStream out) {
            out.println(this.name);
            for(Task task: liste){
                task.perform(System.out);
            }
    }
}
