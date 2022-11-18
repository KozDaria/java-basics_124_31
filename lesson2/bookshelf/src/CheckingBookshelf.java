public class CheckingBookshelf {
    public static void main(String[] args) {
        Book bookOfSierra = new Book("Kathy Sierra", "Head First Java", 350, 2012);
        Book bookOfEckel = new Book();
        bookOfEckel.setPrice(bookOfSierra.getPrice()+49);
        bookOfEckel.setAuthor("Eckel");
        bookOfEckel .setName("Thinking in Java");
        System.out.println(bookOfEckel);
        System.out.println(bookOfSierra);
    }
}