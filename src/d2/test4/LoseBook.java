package d2.test4;
//具体的装饰类，实现了书本遗失功能
public class LoseBook extends Decorator {
    public LoseBook(Book book) {
        super(book);
    }
    public void lose() {
        System.out.println("书本遗失");
    }
}
