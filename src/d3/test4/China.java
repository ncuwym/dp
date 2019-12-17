package d3.test4;
//具体同事
public class China extends Country {

    @Override
    public void getMessage(String message) {
        System.out.println("中国收到信息：" + message);
    }

}