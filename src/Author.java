import java.util.Objects;

public class Author {

    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {

        return this.name;
    }

    public String getSurname() {

        return this.surname;
    }

    public String toString() {
        return name + " " + surname;
    }

    public boolean equals(Author other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Author author = (Author) other;
            return surname.equals(author.surname) && name.equals(author.name);
    }
    public int hashCode() {
        return Objects.hash(surname, name);
    }
}
