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
        return null;
    }

    /*public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.add("Anna", "+79864522312");
        phoneBook1.add("Niko", "+79164522312");
        phoneBook1.add("Boris", "+79264522312");
        phoneBook1.findByNumber("+79264522312");
    }*/
}
