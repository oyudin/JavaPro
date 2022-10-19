package homeWork10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String str = "hello";
        ArrayList<String> arr1 = new ArrayList<>() {
        };
        arr1.add("Hello");
        arr1.add("this");
        arr1.add("beautiful");
        arr1.add("world");
        arr1.add("hello");
        arr1.add("hello");
        arr1.add("hello");
        arr1.add("goodbye");
        arr1.add("No");
        arr1.add("Fantasy");
        arr1.add("Ideas");

        countOccurance(arr1, str);


        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(toList(numbers));


        Integer[] numbers2 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7};
        System.out.println(findUnique(numbers2));


        ArrayList<String> animals = new ArrayList<>();
        animals.add("bird");
        animals.add("bird");
        animals.add("bird");
        animals.add("bird");
        animals.add("bird");
        animals.add("fox");
        animals.add("fox");
        animals.add("fox");
        animals.add("fox");
        animals.add("cat");
        animals.add("cat");
        animals.add("cat");

        calcOccurance(animals);


        System.out.println(Occurrence.findOccurance(animals));
    }


    public static void countOccurance(List<String> words, String str) {

        int count = 0;
        for (String elements : words) {
            if (elements.equals(str)) count += 1;
        }
        System.out.println(count);
    }


    public static List<Integer> toList(int[] numbers) {

        ArrayList<Integer> numbersList = new ArrayList<>();
        for (Integer number : numbers) {
            numbersList.add(number);
        }
        return numbersList;
    }


    public static List<Integer> findUnique(Integer[] numbers) {

        List<Integer> uniqueValues = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueValues.contains(number))
                uniqueValues.add(number);
        }
        return uniqueValues;
    }


    public static void calcOccurance(List<String> animals) {
        List<String> uniqueValues = new ArrayList<>();

        for (String words : animals) {
            int counter = 0;
            if (uniqueValues.contains(words)) continue;
            else uniqueValues.add(words);
            for (String words2 : animals) {
                if (words.equals(words2)) counter++;
            }
            System.out.println(words + ": " + counter);
        }
    }

}