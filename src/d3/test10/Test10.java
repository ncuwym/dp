package d3.test10;
//测试类
public class Test10 {
    public static void main(String[] args) {
        new VoicePhone().voice();
        System.out.println("-------");
        ShakePhone shakePhone = new ShakePhone(new VoicePhone());
        shakePhone.voice();
        shakePhone.shake();
        System.out.println("-------");
        LightPhone lightPhone = new LightPhone(new VoicePhone());
        lightPhone.voice();
        lightPhone.shake();
        lightPhone.light();
    }
}
