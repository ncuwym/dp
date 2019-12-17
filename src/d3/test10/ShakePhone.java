package d3.test10;
//铃声+震动的手机
public class ShakePhone extends Decorator {
    public ShakePhone(Phone phone) {
        super(phone);
    }
    public void shake() {
        System.out.println("震动");
    }
}
