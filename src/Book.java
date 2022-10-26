public class Book {

    private String titleName;
    private Object Author;
    private int yearOfPublication;

    public Book(String titleName, Object author, int yearOfPublication) {

        this.titleName = titleName;
        this.Author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitleName() {
        return this.titleName;
    }
    public Object getAuthor() {
        return (Author) this.Author;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
}

