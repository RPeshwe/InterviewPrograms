package StringPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> listOfNames = Arrays.asList(
                "Avinash",
                "Ashish",
                "Rushikesh",
                "Neha",
                "Chetan"
        );

        List<String> listOfNamesN = Arrays.asList(
                "Nimish",
                "Nachiket",
                "Niharika",
                "Neha",
                "Niranjan"
        );

        List<Integer> numbers = Arrays.asList(1,2,3,66,44);
        var dd = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(dd);

        var ss = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(ss);

       var x = listOfNames.stream().filter(nameOfA -> nameOfA.startsWith("A")).count();

       var noMatch = listOfNamesN.stream().noneMatch(name -> name.contains("Harish"));
       System.out.println(noMatch);

       List<String> listOfNamesStartsWithA = listOfNames.stream()
               .filter(namesOfA -> namesOfA.startsWith("A"))
               .toList();

       var n = listOfNamesN.stream().allMatch(name -> name.startsWith("N"));

       var z = listOfNames.stream().anyMatch(name -> name.contains("Neha"));

        Optional<String> optionalName = listOfNamesN.stream().findAny();

       var nn = optionalName.get();

       var firstElement  = listOfNamesN.stream().findFirst();
            
       System.out.println(n);
       System.out.println(firstElement.get());
    }
}
