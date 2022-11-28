public class Book {

    private String bookTitle;
    private int pages;
    private int printYear;
    private int price;
    private String bookType;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrintYear() {
        return printYear;
    }

    public void setPrintYear(int printYear) {
        this.printYear = printYear;
    }

    public int getPrice() {
        return price;
    }

    public void ChangeBookPrice(int price) {
        if (price>=0){this.price = price;
        } else {
            System.out.println("WTF?");
        }
        
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

}
