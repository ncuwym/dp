package d2.test9;
//具体装饰者类
public class FlyCar extends Decorator {
    public FlyCar(ICar iCar) {
        super(iCar);
    }
    public void fly() {
        System.out.println("在天上飞");
    }
}
