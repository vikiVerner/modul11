package Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MixingData {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("A","B","C");
        Stream<String> second = Stream.of("1","2","3");
        Stream<String> result = zip(first,second);
        result.peek(System.out::println).collect(Collectors.toList());
    }


    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> resultList = new ArrayList<T>();
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();

        while (iteratorFirst.hasNext()&&iteratorSecond.hasNext()){
            resultList.add(iteratorFirst.next());
            resultList.add(iteratorSecond.next());
        }

        return resultList.stream();

    }
}
