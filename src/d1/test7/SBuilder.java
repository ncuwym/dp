package d1.test7;

//具体建造者S
public class SBuilder extends Builder {
    @Override
    public void builderHead() {
        person.setHead("小脑袋-");
    }
    @Override
    public void builderBody() {
        person.setBody("小肚子-");
    }
}
