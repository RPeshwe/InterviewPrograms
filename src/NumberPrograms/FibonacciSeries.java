package NumberPrograms;

import java.util.stream.Stream;

public class FibonacciSeries {

    public static void main(String[] args) {
        int limit = 10;

        Stream.iterate(new int[]{0, 1}, feb -> new int[]{feb[1], feb[0] + feb[1]})
                .limit(limit)
                .map(feb -> feb[0])
                .forEach(System.out::println);
    }
}
