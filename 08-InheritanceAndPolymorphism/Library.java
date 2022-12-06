import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private int id;
    private int numberOfBooks= 0;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Library(int id, Book[] books) {
        this.id = id;
        for (Book book : books) {
            addBook(book);
        }
    }

    public Library(int id) {
        this.id = id;
        }
    

    public Library(int id, Book book) {
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

    public void showLibrary(){
        System.out.println("Library id: "+getId()+"\n"+"Books:");
        Iterator<Book> it = books.iterator();
        while(it.hasNext()) {
            Book bookk = it.next();
            bookk.display();
          }
    }

    public static void main(String[] args) {
        String[] categories = {"we","wet"};
        Ebook eb1 = new Ebook(2004, "Me", "Malina", 456, categories, "Long time ago...", "book.txt");
        Book b1 = new Book(2005, "Game", "Kondrat", 46, categories, "Playing...");

        b1.display();
        eb1.display();
        
    }
}
