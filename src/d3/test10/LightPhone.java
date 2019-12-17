package d3.test10;
//铃声+震动+闪光灯的手机
public class LightPhone extends Decorator {
    public LightPhone(Phone phone) {
        super(phone);
    }
    public void shake() {
        System.out.println("震动");
    }
    public void light() {
        System.out.println("闪光灯");
    }

}
