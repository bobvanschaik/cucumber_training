package examples;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ArrayExample {

    @Test
    void shouldPrintArray() {
        List<String> books = new ArrayList<>();

        books.add("The Fellowship of the Ring");
        books.add("The Two Towers");
        books.add("The Return of the King");

        // loop om te printen
        for (String book : books) {
            System.out.println(book);
        }
    }
}
