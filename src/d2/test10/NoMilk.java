package d2.test10;
//具体的不加奶类NoMilk
public class NoMilk extends Milk {
    @Override
    public void milk() {
        System.out.println("不加奶");
    }
}
