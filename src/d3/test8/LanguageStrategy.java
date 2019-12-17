package d3.test8;

public class LanguageStrategy implements Strategy {
    @Override
    public double subPrice(double price) {
        System.out.println("小说每本2元折扣");
        return price-2.0;
    }
}
