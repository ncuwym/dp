package d3.test2;

public class Test {

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = new Calculator();
        AddCommand addCommand = new AddCommand();
        calculator.setCommand(addCommand);
        System.out.println("计算过程");
        calculator.compute(1);
        calculator.compute(2);
        calculator.compute(3);
        calculator.compute(4);
        System.out.println("撤回过程");
        calculator.undo();
        calculator.undo();
        calculator.undo();
        calculator.undo();
        System.out.println("恢复过程");
        calculator.redo();
        calculator.redo();
        calculator.redo();
        calculator.redo();
    }
}
