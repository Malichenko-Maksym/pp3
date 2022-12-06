public class Ebook extends Book{

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public Ebook(int yearOfCreation, String title, String author, int numberOfPages, String[] categories,
            String content, String fileName) {
        super(yearOfCreation, title, author, numberOfPages, categories, content);
        //TODO Auto-generated constructor stub
        this.fileName = fileName;
    }

    public void display(){
        System.out.println(title+", written by "+author+", file name: "+fileName);
    }

    
}
