package Task1Task2;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NamesList {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger(1);
        List<String> names = Arrays.asList("John", "Bill","Max","Jakob");
        //First task
        String nameStream = names
                .stream()
                .map(name -> i.getAndIncrement()+"."+name)
                .filter(name -> Integer.parseInt(name.substring(0,1))%2 == 1)
                .collect(Collectors.joining(", "));


        System.out.println("nameStream = " + nameStream);

        //Second Task

        List<String> wordsStream = names
                .stream()
                .map(word -> word.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        Collections.reverse(wordsStream);
        System.out.println("wordsStream = " + wordsStream);
    }


}
