package homeWork13;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BookParser {

    private static final String symbolsToRemove = "!,.?():[]*!«»";

    private BufferedReader fileBuffer() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(BookInfo.pathToBook));
        } catch (IOException e) {
            System.out.println("The book is not found! \n");
            System.exit(0);
        }
        return bufferedReader;
    }

    public List<Map.Entry<String, Long>> tenPopularWords() {
        List<Map.Entry<String, Long>> topTenWordsCount;

        topTenWordsCount = fileBuffer().lines().map(line -> {
                    for (Character str : symbolsToRemove.toCharArray()) {
                        line = line.replace(str.toString(), "");
                    }
                    return line;
                })
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .filter(word -> word.length() > 2)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((Map.Entry<String, Long> first, Map.Entry<String, Long> second)
                        -> (int) (second.getValue() - first.getValue()))
                .limit(10)
                .toList();
        return topTenWordsCount;
    }

    public long uniqueWordsCount() {
        long uniqueWordsCount;

        uniqueWordsCount = fileBuffer().lines().map(line -> {
                    for (Character str : symbolsToRemove.toCharArray()) {
                        line = line.replace(str.toString(), "");
                    }
                    return line;
                })
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .distinct()
                .count();
        return uniqueWordsCount;
    }

    public Map<String, Integer> wordsLength() {

        Map<String, Integer> wordsWithLength = new HashMap<>();
        tenPopularWords()
                .forEach(word -> wordsWithLength.put(word.getKey(), word.getKey().length()));
        return wordsWithLength;
    }

    public ArrayList<String> writeBookStatisticToFile() {

        ArrayList<String> totalStatisticList = new ArrayList<>();
        totalStatisticList.add("The most popular words and their count: " + tenPopularWords() + "\n");
        totalStatisticList.add("The sum of all unique words:  " + uniqueWordsCount() + "\n");
        totalStatisticList.add("The most popular words and their length: " + wordsLength() + "\n");

        try (FileOutputStream fileOutputStream = new FileOutputStream(BookInfo.pathToStatistic)) {
            fileOutputStream.write(totalStatisticList.toString().getBytes());
        } catch (IOException e) {
            System.out.println("Cannot write data to the file");
        }
        return totalStatisticList;
    }

}