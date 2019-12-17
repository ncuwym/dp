package d2.test10;
//Coffee类
public class Coffee {
    protected Cup cup;
    protected Milk milk;

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    public void show() {
        cup.size();
        milk.milk();
    }
}
