import java.io.PrintStream;

public class TaskImpl implements Task{


    private String name;

    public TaskImpl(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void perform(PrintStream out) {
        out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.getName();
    }
}
