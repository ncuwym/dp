package d3.test5;
//客户端
public class Test5 {
    public static void main(String[] args) {
        User user = new User();
        Caretaker caretaker1 = new Caretaker();
        Caretaker caretaker2 = new Caretaker();

        //第一次赋值并保存备忘录
        user.setAccount("wang");
        user.setPassword("123");
        System.out.println(user);
        caretaker1.setMemento(user.saveMemento());

        //第二次赋值并保存备忘录
        user.setAccount("liu");
        user.setPassword("456");
        System.out.println(user);
        caretaker2.setMemento(user.saveMemento());

        //第三次修改
        user.setAccount("yang");
        user.setPassword("789");
        System.out.println(user);

        //恢复到第二次备忘录状态
        user.restoreMemento(caretaker2.getMemento());
        System.out.println(user);

        //恢复到第一次备忘录的状态
        user.restoreMemento(caretaker1.getMemento());
        System.out.println(user);

    }
}
