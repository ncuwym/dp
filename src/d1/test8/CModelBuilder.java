package d1.test8;

public class CModelBuilder extends ModelBuilder {
    @Override
    public void builderMenu() {
        softWare.setMenu("菜单");
    }

    @Override
    public void builderList() {
        softWare.setList("列表");
    }

    @Override
    public void builderWindow() {
        softWare.setWindow("主窗口");
    }

    @Override
    public void builderControl() {
        softWare.setControl("控制条");
    }
}
