package d3.test5;
//用户信息类
public class User {
    private String account;
    private String password;

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Memento saveMemento() {
        return new Memento(account,password);
    }

    public void restoreMemento(Memento memento) {
        this.account = memento.getAccount();
        this.password = memento.getPassword();
    }

    @Override
    public String toString() {
        return account + ":" + password;
    }
}
