package d3.test4;

//抽象同事类
public abstract class Country {
    protected UN unitedNation;

    public void setUnitedNation(UN unitedNation) {
        this.unitedNation = unitedNation;
    }

    //定义发送消息的方法，让其调用UN实例的消息发送方法
    public void sendMessage(String message) {
        unitedNation.sendMessage(message, this);
    }

    public abstract void getMessage(String message);
}
