public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoaneOut;
    private BookSingleton(){
        author="Game,helm,jonson";
        title="object pool design pattern";
        book=null;
        isLoaneOut=false;
    }
    public static BookSingleton borrowBook(){
        if (!isLoaneOut){
            if (book==null){
                book=new BookSingleton();
            }
            isLoaneOut=true;
            return book;
        }
        return  null;
    }
    public void returnBook(BookSingleton bookReturned){
        isLoaneOut=true;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static BookSingleton getBook() {
        return book;
    }

    public static void setBook(BookSingleton book) {
        BookSingleton.book = book;
    }

    public static boolean isIsLoaneOut() {
        return isLoaneOut;
    }
    public String getAuthorAndTitle(){
        return getTitle()+" by "+getAuthor();
    }

    public static void setIsLoaneOut(boolean isLoaneOut) {
        BookSingleton.isLoaneOut = isLoaneOut;
    }
}
