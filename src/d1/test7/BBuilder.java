package d1.test7;

//具体建造者类B
public class BBuilder extends Builder {
    @Override
    public void builderHead() {
        person.setHead("大脑袋");
    }
    @Override
    public void builderBody() {
        person.setBody("大肚子");
    }
}
