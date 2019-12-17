package d3.test8;
//小说策略类
public class NovelStrategy implements Strategy {
    @Override
    public double subPrice(double price) {
        System.out.println("小说每100元有10元折扣");
        return price-((int)(price/100)*10);
    }
}
