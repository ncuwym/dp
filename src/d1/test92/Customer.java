package d1.test92;

import java.io.*;

//深克隆：Customer实现Serializable接口
public class Customer implements Serializable {
    private Address address;

    public Customer() {
        this.address = new Address();
    }

    public Object deepClone() throws Exception {

        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ois.readObject());
    }

    public Address getAddress() {
        return this.address;
    }


}
