import java.util.ArrayList;

public class library2 {

    private ArrayList<book2>books;

    public library2() {

        books = new ArrayList<book2>();
    }

    public void setBooks(ArrayList<book2> books) {
        this.books = books;
    }

    public ArrayList<book2> getBooks() {
        return books;
    }

    public void addbbooks(book2 book){

        books.add(book);
    }
    public void removebooks(book2 book){

        books.remove(book);
    }

    public static void main(String[] args) {
        library2 libgen = new library2();
        book2 book1name = new book2("firstbook", "party");
        book2 book2name = new book2("secondbook", "party2");
        book2 book3name = new book2("thirdbook", "party3");

        libgen.addbbooks(book1name);
        libgen.addbbooks(book2name);
        libgen.addbbooks(book3name);

        System.out.println("these are all the books present inside the array" + libgen.getBooks() );


    }
}
