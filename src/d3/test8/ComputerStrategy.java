package d3.test8;
//计算机书籍策略
public class ComputerStrategy implements Strategy {
    @Override
    public double subPrice(double price) {
        System.out.println("计算机书籍10%的折扣");
        return price*0.9;
    }
}
