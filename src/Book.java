public class Book {

    private String titleName;
    private Author Author;
    private int yearOfPublication;

    public Book(String titleName, Author author, int yearOfPublication) {

        this.titleName = titleName;
        this.Author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitleName() {

        return this.titleName;
    }
    public Author getAuthor() {

        return (Author) this.Author;
    }
    public int getYearOfPublication() {

        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }
}

