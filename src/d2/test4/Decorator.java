package d2.test4;
//抽象的装饰者类
public class Decorator implements Book {
    private Book book;
    public Decorator(Book book) {
        this.book = book;
    }
    @Override
    public void borrowBook() {
        book.borrowBook();
    }
    @Override
    public void returnBook() {
        book.returnBook();
    }
}
