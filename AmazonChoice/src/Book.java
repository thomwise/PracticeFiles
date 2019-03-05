public class Book extends Product {

    private int isbn;
    private String author;
    private String genre;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book(String name, double price, String description, int isbn, String author, String genre) {
        super(name, price, description);
        this.isbn = isbn;
        this.author = author;
        this.genre = genre;
        System.out.println("This book's title is called " + this.name + ".\n");
    }

    public Book() {
    }

    @Override
    public void foo() {
        super.foo();
        System.out.println("SUB\n");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
