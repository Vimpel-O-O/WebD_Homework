public class Book {
    String name;
    String author;
    int price;

    public Book(String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;

    }

    public void buy(String name){
        System.out.println(name + "book bought");
    }
}