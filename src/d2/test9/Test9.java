package d2.test9;

//测试类
public class Test9 {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("--------");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        flyCar.fly();
    }


}
