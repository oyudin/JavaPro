package homeWork10;

import java.util.ArrayList;
import java.util.List;

public class Occurrence {

    private String name;
    private int occurrence;

    public Occurrence(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    public static List<Occurrence> findOccurance(List<String> occurrences) {

        List<String> uniqueValues = new ArrayList<>();
        List<Occurrence> uniqueOccurrences = new ArrayList<>();

        for (String values : occurrences) {
            int counter = 0;
            if (uniqueValues.contains(values)) continue;
            else uniqueValues.add(values);
            for (String values2 : occurrences) {
                if (values.equals(values2)) counter++;
            }
            uniqueOccurrences.add(new Occurrence(values, counter));
        }
        return uniqueOccurrences;
    }

    @Override
    public String toString() {
        return "Occurrence{" +
                "name='" + name + '\'' +
                ", occurrence: " + occurrence +
                '}' + '\n';
    }
}
