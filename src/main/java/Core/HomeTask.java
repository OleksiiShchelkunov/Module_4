package Core;

import java.util.*;

public class HomeTask {

    interface StringFunction {
        String run(String str);
    }

    public static void main(String[] args) {

        //Task 1
        TextProcessor textProcessor = new TextProcessor();
        String string = "V's background and identity are never revealed. He is at one point an inmate at \"Larkhill Resettlement Camp\"—one of many concentration camps where black people, Jews, leftists, be";
        String[] testData = string.split("[ —]");
        List<String> initialArray = new ArrayList<>(Arrays.asList(testData));
        System.out.println(initialArray);

        System.out.println("Selected words :" + textProcessor.selectStringThatStartsWithO(initialArray));

        //Task 2
        BookFactory factory = new BookFactory();
        BookProcessor bookProcessor = new BookProcessor();
        ArrayList<Book> list = factory.createBooksList(10);
        System.out.println(list);
        //Sub-task 1
        System.out.println("Books names:" + bookProcessor.selectBooksNameList(list));
        System.out.println("Books total price:" + bookProcessor.booksTotalPrice(list));
        System.out.println("Book name with A: " + bookProcessor.selectBookNameWithLetter(list));
        System.out.println("Book name = " + bookProcessor.selectBookNameWithHighestPrice(list).getName());
        System.out.println("Books with 5 characters in name " + bookProcessor.selectBooksWith5CharactersName(list));
        System.out.println("Books with price 30 or less " + bookProcessor.selectBooksCheeperThan30(list));
        System.out.println("List of the desc sorted books " + bookProcessor.sortBooksByNameAndPriceDesc(list));
        //Sub-task 2

        Book book1 = new Book("myBook", 5);
        Book book2 = new Book("myBook", 5);


        Map<Book, String> mapWithBook = new HashMap();
        mapWithBook.put(book1, "library1");
        System.out.println(mapWithBook.get(book2));

        //Task 3
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 17));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("   ", "Stevenson", 19));
        personList.add(new Person("      ", "Stevenson", 19));
        personList.add(new Person(" Arnold", "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron", "Bortnicker", 18));

        PersonDetailsOperator operator = new PersonDetailsOperator();

        System.out.println(operator.selectUniquePersonsNames(personList));

        //Task 4
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);

    }
        public static void printFormatted(String str, StringFunction format) {
            String result = format.run(str);
            System.out.print(result);
        }
    }

