package Task3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedNumbers {
    public static void main(String[] args) {
        String [] numbersArray = {"1, 2, 0", "4, 5"};
        StringBuilder allData = new StringBuilder();
        for (String s : numbersArray) {
            allData.append(s);
        }
        char [] numbers = String.valueOf(allData).toCharArray();

        List<Integer> result = new ArrayList<>();
        for (char number : numbers) {
            if(number >= 48 && number<=57 ){
                result.add(Integer.parseInt(String.valueOf(number)));
            }
        }
        Stream<Integer> a = result
                .stream()
                .sorted();

        System.out.println("result = " + a.collect(Collectors.toList()));

    }

}

