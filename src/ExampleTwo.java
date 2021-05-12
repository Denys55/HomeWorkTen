import java.util.*;
import java.util.stream.Collectors;

public class ExampleTwo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "Andrey", "Nikolay", "Petr", "Alexey", "Vladimir", "Oleg");

        List<String> result = list.stream()
                .map(s -> s.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
