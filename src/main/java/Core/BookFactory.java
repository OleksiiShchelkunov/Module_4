package Core;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.Locale;

public class BookFactory {

    public ArrayList<Book> createBooksList (int listSize) {
        ArrayList<Book> bookList = new ArrayList <Book> ();
        for (int i = 0; i < listSize; i++) {
            bookList.add (new Book (RandomStringUtils.randomAlphabetic(3,10).toLowerCase(Locale.ROOT), RandomUtils.nextInt(1,99)));
        }
        return bookList;
    }
}
