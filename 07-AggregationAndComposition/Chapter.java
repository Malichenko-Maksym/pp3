public class Chapter {
    private String chapterTitle;
    private int startingPage;
    private int numberOfPages;
    private Book belongTo = null;

    public Chapter(String chapterTitle, int startingPage, int numberOfPages) {
        this.chapterTitle = chapterTitle;
        this.startingPage = startingPage;
        this.numberOfPages = numberOfPages;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public int getStartingPage() {
        return startingPage;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void belongingTo(Book book ){
        belongTo = book;
    }
}
