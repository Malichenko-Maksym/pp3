import java.util.ArrayList;
import java.util.Iterator;

public class Bookcase {
    private int id;
    private int numberOfBooks= 0;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Bookcase(int id, Book[] books) {
        this.id = id;
        for (Book book : books) {
            addBook(book);
        }
    }

    public Bookcase(int id) {
        this.id = id;
        }
    

    public Bookcase(int id, Book book) {
        this.id = id;
        addBook(book);
    }

    public int getId() {
        return id;
    } 

    public void addBook(Book book){
        this.numberOfBooks += 1;
        this.books.add(book);
        book.placeIn(this);
    }

    public void removeBook(String title){
        for(int index=0; index<books.size(); index+=1){
            if(title==books.get(index).getTitle()){
                books.remove(index);
            }
        }
    }

    public void showBookcase(){
        System.out.println("Bookcase id: "+getId()+"\n"+"Books:");
        Iterator<Book> it = books.iterator();
        while(it.hasNext()) {
            Book b1 = it.next();
            System.out.println(b1.getTitle()+" pages:"+b1.getNumberOfPages()+" year:"+b1.getYearOfCreation()+" in:"+b1.getPlacedIn());
          }
    }

    public static void main(String[] args) {
        String[] categories = {"abb","eop"};
        Bookcase bc1= new Bookcase(1, new Book(2004, "Me", 456, categories, "Long time ago..."));
        bc1.addBook(new Book(2005, "Game", 46, categories, "Playing..."));
        bc1.showBookcase();
    }
}
