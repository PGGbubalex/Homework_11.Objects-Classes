import java.util.Objects;

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

    public String toString() {
        return "Название книги: " + getTitleName() + ", автор: " + Author.toString() + ", год публикации: " + getYearOfPublication();
    }

    public boolean equals(Book other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Book book = (Book) other;
            return titleName.equals(book.titleName);
    }
    public int hashCode() {
        return Objects.hash(titleName);
    }
}

