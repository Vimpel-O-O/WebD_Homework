import org.testng.annotations.Test;

public class TestBook {
    @Test
    public void test0001() {
        Book book01 = new Book("Harry Potter", "J. K. Rowling", 25);

        book01.buy("Harry Potter ");

    }
}