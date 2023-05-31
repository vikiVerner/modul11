package Task4;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.*;

public class RandomStream {
    public static void main(String[] args) {
        RandomAlg randomAlg = new RandomAlg(25214903917L, (long)Math.pow(2,48));
        Stream<Long> stream = Stream.iterate(11L, (seed) -> randomAlg.c(seed).next());
        stream
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
