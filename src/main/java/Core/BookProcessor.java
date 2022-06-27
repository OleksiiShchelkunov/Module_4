package Core;

import org.apache.commons.lang3.RandomUtils;

import java.util.*;
import java.util.stream.Collectors;

public class BookProcessor {

    public List<String> selectBooksNameList (List<Book> list) {

        return list
                .stream()
                .map(Book::getName)
                .collect(Collectors.toList());
    }

    public int booksTotalPrice (List<Book> list) {

        return list
                .stream()
                .map(Book::getPrice)
                .reduce(0, (acc, x) -> acc + x);
    }

    public String selectBookNameWithLetter (List<Book> list) {

        try {
            List<String> selectedBook = list
                    .stream()
                    .map(Book::getName)
                    .filter((name -> name.contains("a"))).toList();

            return selectedBook.get(RandomUtils.nextInt(0,selectedBook.size()));
        } catch (Exception e) {
        return "Unfortunately, there is no book with \"a\" in name";
    }}

    public Book selectBookNameWithHighestPrice (List<Book> list) {

        List<Book> selectedBook = list
                .stream()
                .sorted(Comparator.comparingInt(Book::getPrice)).toList();
        return selectedBook.get(selectedBook.size()-1);
    }

    public List<String> selectBooksWith5CharactersName (List<Book> list) {

            List<String> selectedBooks = list
                    .stream()
                    .map(Book::getName)
                    .filter((name -> name.length() == 5))
                    .collect(Collectors.toList());

        if (!selectedBooks.isEmpty()) {
            return selectedBooks;
        }
        else return Collections.singletonList("Unfortunately, no books with 5 characters in name");
    }

    public List<Book> selectBooksCheeperThan30 (List<Book> list) {

        return list
                .stream()
                .filter((price -> price.getPrice()<= 30)).toList();
    }

    public List <Book> sortBooksByNameAndPriceDesc (List<Book> list) {

        Comparator <Book> sortByName = Comparator.comparing(Book::getName).thenComparing(Book::getPrice).reversed();
        return list
                .stream()
                .sorted(sortByName).toList();
    }
}
