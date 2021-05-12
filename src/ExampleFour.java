import java.text.CollationElementIterator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ExampleFour {

    public static void main(String[] args) {
    long c = 11l;
    long m = (long) Math.pow(2,48);


        Stream<Long> result = random3(c, m, 12l);
        result.forEach(System.out::println);

    }

    public static Stream<Long> random3 (long c, long m, long seed){
        return Stream.iterate(seed, val -> Math.abs((25214903917L*val+c)%m))
                .limit(100);


    }

}
