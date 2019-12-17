package d2.test10;
//测试类
public class Test10 {
    public static void main(String[] args) {
        BigCup bigCup = new BigCup();
        SmallCup smallCup = new SmallCup();
        AddMilk addMilk = new AddMilk();
        NoMilk noMilk = new NoMilk();
        Coffee coffee = new Coffee();

        coffee.setCup(smallCup);
        coffee.setMilk(noMilk);
        coffee.show();

        coffee.setCup(bigCup);
        coffee.setMilk(addMilk);
        coffee.show();
    }
}
