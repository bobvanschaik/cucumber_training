package examples;

import org.junit.jupiter.api.Test;

import java.util.UUID;

class RandomEmailExample {

    @Test
    void shouldConcatenateStrings() {
        String firstWord = "banana";
        String secondWord = "apple";
        String thirdWord = UUID.randomUUID().toString().substring(0,7);

        System.out.println(firstWord);
        System.out.println(secondWord);

        System.out.println(firstWord + secondWord);
        System.out.println(firstWord + " " + secondWord);
        System.out.println(firstWord + " " + secondWord + " " + thirdWord);
        System.out.println(thirdWord + "@mail.com");

        System.out.println(UUID.randomUUID().toString().substring(0,7) + "@mail.com");

    }
}
