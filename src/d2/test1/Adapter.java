package d2.test1;
//双向适配器类
public class Adapter implements ICat,IDog {
    //私有两个接口的引用
    private IDog dog;
    private ICat cat;

    public Adapter(IDog dog, ICat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    @Override
    //适配器中猫的抓老鼠方法调用狗的叫方法
    public void catchMouse() {
        System.out.print("猫:");
        dog.bark();
    }
    //适配器中狗的叫方法调用猫的抓老鼠方法
    @Override
    public void bark() {
        System.out.print("狗:");
        cat.catchMouse();
    }

}
