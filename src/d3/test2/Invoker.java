package d3.test2;

public class Invoker {
    private int num = 0;
    public int add(int value){
        System.out.print(num + "+" + value + "=");
        num += value;
        System.out.println(num);
        return num;
    }
}
