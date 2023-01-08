import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    public Map<String, String> phoneBook = new TreeMap<>();

    public int add(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name))
            phoneBook.put(name, phoneNumber);

        return phoneBook.size();
    }

    public String findByNumber(String phoneNumber) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(phoneNumber))
                return entry.getKey();
        }
        return null;
    }

    public String findByName(String name) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(name))
                return entry.getValue();
        }
        return null;
    }

    public List<String> printAllNames() {
        return null;
    }
}
