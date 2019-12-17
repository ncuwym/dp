package d2.test5;
//客户端
public class Client {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        if(mainFrame.on() == true) {
            System.out.println(">>启动成功<<");
        }
    }
}
