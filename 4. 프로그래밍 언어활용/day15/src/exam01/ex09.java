package exam01;

import java.util.Optional;

public class ex09 {
    public static void main(String[] args) {
        Book book = null;
        Optional<Book> opt = Optional.ofNullable(book);
    }
}
