package d2.test6;

//测试类，两个白棋是同一个对象，两个黑棋是同一个对象
public class Test6 {
    public static void main(String[] args) {
        ChessFactory factory = ChessFactory.getSingleFactory();
        AbstractChess c1 = factory.getChess("white");
        AbstractChess c2 = factory.getChess("white");
        System.out.println(c1 == c2);//若true,说明两个白棋为同一对象
        AbstractChess c3 = factory.getChess("black");
        AbstractChess c4 = factory.getChess("black");
        System.out.println(c3 == c4);//若true,说明两个黑棋为同一对象
        System.out.println(c1==c3);//若false,黑棋白棋为不同对象
    }
}
