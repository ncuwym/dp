package d2.test4;
//具体的书本，拥有借书和还书的功能
public class BookImpl implements Book {
    @Override
    public void borrowBook() {
        System.out.println("借书");
    }

    @Override
    public void returnBook() {
        System.out.println("还书");
    }
}
