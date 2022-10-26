public class Main {
    public static void main(String[] args) {

        Author firstAuthor = new Author("Stephen", " King");
        Book firstBook = new Book("It", firstAuthor, 1986);
        Author secondAuthor = new Author("Dante", "Alighieri");
        Book secondBook = new Book("The Divine Comedy", secondAuthor, 1320);
    }
}