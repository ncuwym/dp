package d2.test7;
//代理主题
public class Picture extends AbstractSubject{
    private  Application application = new Application();
    @Override
    public void run() {
        application.run();
    }
}
