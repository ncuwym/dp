package d3.test8;

//价格计算类
public class SumPrice {
    private Strategy strategy;

    public SumPrice(Strategy strategy) {
        this.strategy = strategy;
    }

    public double sum(double price) {
        return this.strategy.subPrice(price);
    }
}
