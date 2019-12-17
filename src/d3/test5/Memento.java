package d3.test5;
//备忘录类
public class Memento {
    private String account;
    private String password;

    public Memento(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

}
