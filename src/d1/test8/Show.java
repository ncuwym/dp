package d1.test8;
//指挥者类
public class Show {
    private  ModelBuilder modelBuilder;

    public void setModelBuilder(ModelBuilder modelBuilder) {
        this.modelBuilder = modelBuilder;
    }
    public SoftWare construct() {

        modelBuilder.builderControl();
        modelBuilder.builderMenu();
        modelBuilder.builderWindow();
        modelBuilder.builderList();

        return modelBuilder.getSoftWare();
    }
}
