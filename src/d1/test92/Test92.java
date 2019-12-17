package d1.test92;

//测试类
public class Test92 {
    public static void main(String[] args) {
        Customer c,copyC = null;
        c = new Customer();
        try { copyC = (Customer) c.deepClone(); }
        catch (Exception e) { e.printStackTrace(); }
        System.out.println(c == copyC);
        System.out.println(c.getAddress() == copyC.getAddress());
    }
}
