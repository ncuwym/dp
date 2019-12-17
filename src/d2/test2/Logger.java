package d2.test2;

//父类，日志记录器
public class Logger {
    protected Lang lang;
    protected OS os;
    public void loggerInfo() {}
    public void setLang(Lang lang) {
        this.lang = lang;
    }
    public void setOs(OS os) {
        this.os = os;
    }
}
