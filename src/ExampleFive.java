import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleFive {

    public static void main(String[] args) {
        zip(number1.stream(), number2.stream()).forEach(System.out::println);
    }
    public static List<Integer> number1 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    public static List<Integer> number2 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2);

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> listFirst = first.collect(Collectors.toList());
        List<T> listSecond = second.collect(Collectors.toList());
        Stream.Builder<T> streamBuilder = Stream.builder();
        IntStream.range(0, Math.min(listFirst.size(), listSecond.size())).forEach(i -> {
            streamBuilder.add(listFirst.get(i));
            streamBuilder.add(listSecond.get(i));
        });
        return streamBuilder.build();
    }
}
