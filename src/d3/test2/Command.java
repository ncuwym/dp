package d3.test2;

public abstract class Command {
    public abstract int execute(int value);
    public abstract int undo();
    public abstract int redo();
}
