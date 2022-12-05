import java.util.ArrayList;

public class Book {
    private int yearOfCreation;
    private String content;
    private Bookcase placedIn = null;

    public Bookcase getPlacedIn() {
        return placedIn;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    private String title;

    public String getTitle() {
        return title;
    }

    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    ArrayList<String> categories = new ArrayList<String>();
    ArrayList<Chapter> chapters = new ArrayList<Chapter>();

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public Book(int yearOfCreation, String title, int numberOfPages, String[] categories, String content) {
        this.yearOfCreation = yearOfCreation;
        this.title = title;
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

    public void placeIn(Bookcase bookcase ){
        placedIn = bookcase;
    }

    public void addChapter(Chapter chapter){
        chapters.add(chapter);
        chapter.belongingTo(this);
    }



}