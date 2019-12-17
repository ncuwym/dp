package d1.test7;

//抽象建造者
public abstract class Builder {
    protected Person person = new Person();
    public abstract void builderHead();
    public abstract void builderBody();
    public Person getPerson() {
        return person;
    }
}
