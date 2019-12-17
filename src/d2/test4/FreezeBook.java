package d2.test4;
//具体的装饰类，实现了冻结功能
public class FreezeBook extends Decorator {
    public FreezeBook(Book book) {
        super(book);
    }
    public void freeze() {
        System.out.println("冻结书本");
    }
}
