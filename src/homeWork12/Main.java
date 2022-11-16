package homeWork12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.getFileStorage().put("src/homeWork12/folder0", new ArrayList<FileData>());


        FileData fileData0 = new FileData("File0", 3, "src/homeWork12/folder0");
        FileData fileData1 = new FileData("File1", 4, "src/homeWork12/folder0");
        FileData fileData2 = new FileData("File2", 7, "src/homeWork12/folder2");
        FileData fileData3 = new FileData("File3", 8, "src/homeWork12/folder0");

        fileNavigator.add("src/homeWork12/folder0",fileData0);
        fileNavigator.add("src/homeWork12/folder0",fileData1);
        fileNavigator.add("src/homeWork12/folder2",fileData2);
        fileNavigator.add("src/homeWork12/folder0",fileData3);


        fileNavigator.find("src/homeWork12/folder0");

        fileNavigator.filterBySize(4);

        fileNavigator.sortBySize();

        fileNavigator.remove("src/homeWork12/folder0");

    }
}
