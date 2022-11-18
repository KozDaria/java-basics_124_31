public class Book {
    String Author;
    String name;
    double price;
    int year;

    public Book() {
    }

    public Book(String author, String name, double price, int year) {
        Author = author;
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
