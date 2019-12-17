package d1.test8;

/**
 * 精简模式
 */
public class SModelBuilder extends ModelBuilder {
    @Override
    public void builderMenu() {
        softWare.setMenu("");
    }

    @Override
    public void builderList() {
        softWare.setList("");
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
