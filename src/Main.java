public class Main {
    public static void main(String[] args) {

        Author firstAuthor = new Author("Stephen", " King");

        Book firstBook = new Book("It", firstAuthor, 1985);
            firstBook.setYearOfPublication(1986);

        System.out.println(firstBook);

        Author secondAuthor = new Author("Dante", "Alighieri");

        Book secondBook = new Book("The Divine Comedy", secondAuthor, 13200);
            secondBook.setYearOfPublication(1320);

        System.out.println(secondBook);


    }
}