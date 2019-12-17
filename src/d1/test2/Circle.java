package d1.test2;

public class Circle extends Graph {
    @Override
    public void draw() {
        System.out.println("正在画圆");
    }

    @Override
    public void erase() {
        System.out.println("正在擦除园");
    }
}
