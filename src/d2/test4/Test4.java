package d2.test4;
//测试类
public class Test4 {
    public static void main(String[] args) {
        BookImpl bookImpl= new BookImpl();
        bookImpl.borrowBook();
        bookImpl.returnBook();
        System.out.println("-------");
        FreezeBook freezeBook = new FreezeBook(bookImpl);
        freezeBook.borrowBook();
        freezeBook.returnBook();
        freezeBook.freeze();
        System.out.println("-------");
        LoseBook loseBook = new LoseBook(bookImpl);
        loseBook.borrowBook();
        loseBook.returnBook();
        loseBook.lose();

    }
}
