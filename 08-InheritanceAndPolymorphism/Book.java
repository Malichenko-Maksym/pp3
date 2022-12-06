import java.util.ArrayList;

public class Book {
    protected int yearOfCreation;
    protected String content;
    protected Library placedIn = null;
    protected String author;
    protected String title;
    protected int numberOfPages;

    public String getAuthor() {
        return author;
    }

    public Library getPlacedIn() {
        return placedIn;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    

    public String getTitle() {
        return title;
    }

    

    public int getNumberOfPages() {
        return numberOfPages;
    }

    ArrayList<String> categories = new ArrayList<String>();

    public ArrayList<String> getCategories() {
        return categories;
    }

    public Book(int yearOfCreation, String title, String author, int numberOfPages, String[] categories,
            String content) {
        this.yearOfCreation = yearOfCreation;
        this.title = title;
        this.author = author;
        this.content = content;
        this.numberOfPages = numberOfPages;
        for (int id = 0; id < categories.length; id++) {
            addCategory(categories[id]);
        }

    }

    public void addCategory(String category) {
        categories.add(category);
    }

    public String readBook() {
        return content;
    }

    public void placeIn(Library Library) {
        placedIn = Library;
    }

    public void display(){
        System.out.println(title+", written by "+author);
    }

}