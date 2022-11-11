package homeWork12;

import java.util.*;

public class FileNavigator {

    Map<String, ArrayList<FileData>> fileStorage = new HashMap<>();

    public void add(String pathToFile, FileData file) {

        if (!fileStorage.containsKey(file.getPath())) {
            System.err.println("Path-key and file direction are different");
        } else if (!fileStorage.containsKey(pathToFile)) {
            fileStorage.put(pathToFile, new ArrayList<FileData>());
            fileStorage.get(pathToFile).add(file);
        } else {
            fileStorage.get(pathToFile).add(file);
        }
    }

    public ArrayList<FileData> find(String pathToFile) {

        if (fileStorage.containsKey(pathToFile)) {
            System.out.println("Found: " + fileStorage.get(pathToFile).toString());
        } else {
            System.err.println("Not found");
        }
        return fileStorage.get(pathToFile);
    }

    public ArrayList<FileData> filterBySize(int size) {

        ArrayList<FileData> filteredBySizeFiles = new ArrayList<>();

        for (ArrayList<FileData> value : fileStorage.values()) {
            value.stream()
                    .filter(s -> (s.getSize() <= size))
                    .forEach(filteredBySizeFiles::add);
            System.out.println("Filtered by size: " + filteredBySizeFiles);
        }
        return filteredBySizeFiles;
    }

    public void remove(String pathToFile) {
        fileStorage.remove(pathToFile);
    }

    public ArrayList<FileData> sortBySize() {

        ArrayList<FileData> sortedBySizeFiles = new ArrayList<>();

        List<FileData> files = fileStorage.values()
                .stream().flatMap(Collection::stream)
                .sorted(Comparator.comparingInt((FileData::getSize)).reversed()).toList();
        System.out.println("Sorted by size: " + files);
        return sortedBySizeFiles;
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "files=" + fileStorage +
                '}' + "\n";
    }
}