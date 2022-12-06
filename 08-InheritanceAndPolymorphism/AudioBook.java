public class AudioBook extends Book {

    private int minutes;
    private int seconds;

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public AudioBook(int yearOfCreation, String title, String author, int numberOfPages, String[] categories,
            String content, int minutes, int seconds) {
        super(yearOfCreation, title, author, numberOfPages, categories, content);
        //TODO Auto-generated constructor stub

        this.minutes=minutes;
        this.seconds = seconds;
    }

    public void display(){
        System.out.println(title+", written by "+author+" minutes : "+minutes+" seconds:"+seconds);
    }

    
}
