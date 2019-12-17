package d2.test9;
//具体的实体类，具体构件
public final class Car implements ICar {
    @Override
    public void move() {
        System.out.println("在陆地跑");
    }
}
