public class Main {

    public static void main(String[] args) {

        Book a = new Book("Lord of the Rings", 20.20,
                "Fantasy", 78932902, "JRR Tolkien", "Fantasy");
        Product p = new Product();

        p.foo();
        a.foo();
        System.out.println(a.name);
    }
}
