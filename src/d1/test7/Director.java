package d1.test7;

//指挥者类
public class Director {
    private Builder builder;
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public Person construct() {
        builder.builderHead();
        builder.builderBody();
        return builder.getPerson();
    }
}
