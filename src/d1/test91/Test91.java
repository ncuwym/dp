package d1.test91;

//测试类
public class Test91 {
    public static void main(String[] args) {
        Customer c, copyC;
        c = new Customer();
        copyC = (Customer) c.clone();
        System.out.println(c == copyC);//若false，说明该主体对象进行了复制
        //若true,说明其组合对象未复制
        System.out.println(c.getAddress() == copyC.getAddress());
    }
}
