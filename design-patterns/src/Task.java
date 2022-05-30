import java.io.PrintStream;

public interface Task {

    String getName();
    void perform(PrintStream out);
    void addObserver(TaskObserver observer);
}
