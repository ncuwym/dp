package d1.test91;

//浅克隆，只需Customer类实现Cloneable接口
public class Customer implements Cloneable {
    private Address address;
    public Customer() {
        this.address = new Address();
    }
    public Object clone() { Customer clone = null;
        try { clone = (Customer) super.clone(); }
        catch (CloneNotSupportedException e) { e.getMessage(); }
        return clone;
    }
    public Address getAddress() {
        return this.address;
    }
}
