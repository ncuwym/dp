package d2.test2;

//文件日志记录器
public class FileLogger extends Logger {
    @Override
    public void loggerInfo() {
        System.out.println(os.info()
                + "环境支持" + lang.info() + "的fileLogger");
    }
}
