import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "Andrey", "Nikolay", "Petr", "Alexey", "Vladimir", "Oleg");
        //System.out.println(list);

        String result = list.stream()
                .filter(s -> list.indexOf(s)%2==0)
                .map(s -> list.indexOf(s)+1 +". "+ s)
                .collect(Collectors.joining(", "));
        System.out.println(result);













    }
}
