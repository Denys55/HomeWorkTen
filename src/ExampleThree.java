import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleThree {

    public static void main(String[] args) {
        String[] task = {"1, 2, 0", "4, 5"};
        List<Integer> collect = Arrays.stream(task)
                .map(s -> s.split(", "))
                .flatMap(strings -> Arrays.stream(strings))
                .map(s -> Integer.parseInt(s))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
