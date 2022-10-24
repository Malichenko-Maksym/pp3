public class Book {
    String title;
    int allPages;
    int currentPage;

    Book(String name,int pages) {
        allPages = pages;
        currentPage = 1;
        title = name;
    }
    
    public void ShowTitle() {
        System.out.println(title);
    }

    public void ShowCurrentPage() {
        System.out.println(currentPage);
    }
    public void NextPage() {
        if (allPages > currentPage){
            currentPage +=1;
        }
        else {
            System.out.println("You finished the book");
        }
    }
    
  
  

public static void main(String[] args) {
    Book SpiderMan = new Book("SpiderMan",300);
    SpiderMan.ShowTitle();
    SpiderMan.ShowCurrentPage();
    SpiderMan.NextPage();
    SpiderMan.NextPage();
    SpiderMan.ShowCurrentPage();
    Book Potter = new Book("Potter",140);
    Potter.ShowTitle();

}
}