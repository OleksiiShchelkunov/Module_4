package Core;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class PersonDetailsOperator {

    public List<String> selectUniquePersonsNames (List<Person> list) {

        return list
                .stream()
                .filter((person -> person != null && !person.getFirstName().isBlank()))
                .filter((age -> age.getAge()>=18))
                .map((Person -> Person.getFirstName().trim().toUpperCase()))
                .collect(Collectors.toList());
    }
}
