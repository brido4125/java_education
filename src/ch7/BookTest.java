package ch7;

class Book{
    String name;
    String author;

    void savePage() {
        System.out.println("Book.savePage");
    }
}

class EBook extends Book{
    @Override
    void savePage() {
        System.out.println("EBook.savePage");
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        //book.savePage();

        EBook eBook = new EBook();
        //eBook.savePage();

        Book book1 = new EBook();
        book1.savePage();
        //EBook eBook1 = new Book();

        /*
        * book2의 자식 타입으로의 Casting 조건 : 자식 Instance의 주소를 참조변수 값으로 갖고 있어야함
        * */
        Book book2 = new EBook();
        EBook eBook2 = null;
        eBook2 = (EBook) book2;
        eBook2.savePage();

        /*
        * 부모 타입의 참조변수에 자식
        * */
        Book book3 = null;
        EBook eBook3 = new EBook();
        book3 = eBook3;
        book3.savePage();

    }
}
