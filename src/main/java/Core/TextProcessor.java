package Core;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TextProcessor {

        public List <String> selectStringThatStartsWithO (List<String> list) {

            return list
                    .stream()
                    .filter(str -> str.toLowerCase().startsWith("o"))
                    .collect(Collectors.toList());
    }
}
