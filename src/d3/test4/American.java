package d3.test4;
//具体同事，美国
public class American extends Country {
    @Override
    public void getMessage(String message) {
        System.out.println("美国收到信息：" + message);
    }
}
