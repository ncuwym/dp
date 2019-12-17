package d2.test1;

//测试类
public class Test1 {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new DogImpl(), new CatImpl());
        adapter.catchMouse();
        adapter.bark();
    }

}
