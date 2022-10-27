public class Main {
    public static void main(String[] args) {

        Author firstAuthor = new Author("Stephen", " King");
        Book firstBook = new Book("It", firstAuthor, 1985);
            firstBook.setYearOfPublication(1986);
        Author secondAuthor = new Author("Dante", "Alighieri");
        Book secondBook = new Book("The Divine Comedy", secondAuthor, 13200);
            firstBook.setYearOfPublication(1320);
    }
}