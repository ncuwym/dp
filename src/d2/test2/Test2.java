package d2.test2;
//测试类
public class Test2 {
    public static void main(String[] args) {
        Logger conLogger = new ConLogger();
        Logger fileLogger = new FileLogger();
        OS windows = new Windows();
        OS linux = new Linux();
        Lang java = new Java();
        Lang python = new Python();
        conLogger.setLang(python);
        conLogger.setOs(linux);
        conLogger.loggerInfo();
        fileLogger.setLang(java);
        fileLogger.setOs(windows);
        fileLogger.loggerInfo();
    }
}
