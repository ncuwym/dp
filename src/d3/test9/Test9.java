package d3.test9;
//测试类
public class Test9 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("土豆",5);
        VIP vip = new VIP("liu");
        fruit.addObserver(vip);
        vip.update(fruit);
        fruit.setName("马铃薯");
        fruit.setPrice(4);
    }


}
