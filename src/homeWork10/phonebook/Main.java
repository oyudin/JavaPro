package homeWork10.phonebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook1 = new PhoneBook();

        Record record1 = new Record("Walter", "0631232333");
        Record record2 = new Record("John", "0631232334");
        Record record3 = new Record("John", "0631232335");


        phoneBook1.add(record1);
        phoneBook1.add(record2);
        phoneBook1.add(record3);

        phoneBook1.find(record2);

        phoneBook1.findAll(new Scanner(System.in).next());

    }
}