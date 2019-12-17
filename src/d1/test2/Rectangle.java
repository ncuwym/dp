package d1.test2;

public class Rectangle extends Graph {
    @Override
    public void draw() {
        System.out.println("正在画矩形");
    }

    @Override
    public void erase() {
        System.out.println("正在擦除矩形");
    }
}
