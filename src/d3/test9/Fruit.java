package d3.test9;
//具体商品，水果类
public class Fruit extends Product {
    private String name;
    private int price;
    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        notifyObserver();
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
        notifyObserver();
    }
}
