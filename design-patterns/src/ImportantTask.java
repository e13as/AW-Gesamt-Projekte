import java.io.PrintStream;

public class ImportantTask implements Task{
    private String name;
    private Task task;

    public ImportantTask(Task task){
        this.name = task.getName();
        this.task = task;
    }


    @Override
    public String getName(){
        return name;
    }

    @Override
    public void perform(PrintStream out){
        out.println("ACHTUNG, das ist jetzt wichtig:");
        task.perform(System.out);
    }


}
