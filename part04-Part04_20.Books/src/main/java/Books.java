public class Books {
    private String name;
    private int pages;
    private int year;

    public Books(String bookName, int noPages, int bookYear) {
        this.name = bookName;
        this.pages = noPages;
        this.year = bookYear;
    }

    public String getBookName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year; 
    }
}
