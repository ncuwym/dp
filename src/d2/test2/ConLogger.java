package d2.test2;

//输出到控制台的日志记录器
public class ConLogger extends Logger {
    @Override
    public void loggerInfo() {
        System.out.println(os.info() + "环境支持"
                + lang.info() + "的conLogger");
    }
}
