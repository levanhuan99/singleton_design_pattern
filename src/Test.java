public class Test {

    public static void main(String[] args) {
        System.out.println("let`s test");

        BookBorrower bookBorrower1=new BookBorrower();
        BookBorrower bookBorrower2=new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book");
        System.out.println("BookBorrower1 Author and Title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the book");

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());


        System.out.println("end test");

    }
}
