package homeWork10.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    List<Record> userInfoRecords = new ArrayList<>();

    public void add(Record record) {
        userInfoRecords.add(record);
    }

    public Record find(Record record) {
        for (Record records : userInfoRecords) {
            if (records.getName().equals(record.getName())) {
                System.out.println(records);
                break;
            }
        }
        return null;
    }


    public void findAll(String string) {
        for (Record records : userInfoRecords) {
            if (records.getName().equals(string)) {
                System.out.println(records);
            }
        }
    }
}
