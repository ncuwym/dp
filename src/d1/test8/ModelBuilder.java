package d1.test8;
//抽象创建者类
public abstract class ModelBuilder {

    protected SoftWare softWare = new SoftWare();

    public abstract void builderMenu();
    public abstract void builderList();
    public abstract void builderWindow();
    public abstract void builderControl();

    public SoftWare getSoftWare() {
        return softWare;
    }
}
