package d1.test2;

public class Triangle extends Graph {
    @Override
    public void draw() {
        System.out.println("正在画三角形");
    }

    @Override
    public void erase() {
        System.out.println("正在擦除三角形");
    }
}
