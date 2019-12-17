package d2.test9;
//抽象装饰者
public class Decorator implements ICar{
    private ICar iCar;

    public Decorator(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void move() {
        iCar.move();
    }
}
