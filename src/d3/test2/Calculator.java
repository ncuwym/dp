package d3.test2;

public class Calculator {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void compute(int value){
        command.execute(value);
    }
    public void undo(){
        int i = command.undo();
        if (i == -1){
            System.out.println("缓存中不存在数据");
        }
        else {
            System.out.println("执行成功,运算结果是"+i);
        }

    }
    public void redo(){
        int i = command.redo();
        if (i == -1){
            System.out.println("已恢复至最新数据");
        }
        else {
            System.out.println("执行成功，运算结果是"+i);
        }
    }
}
