import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    public void startOfTest() {
        System.out.println("---------------------------------------\n[START OF THE TEST]");
        phoneBook = new PhoneBook();
    }

    @Test
    public void testingAddingSingleContact() {
        //Arrange
        int expected = 1;
        // Act
        int result = phoneBook.add("Anna", "+79864522312");
        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testingAddingTwoContacts() {
        //Arrange
        int expected = 2;
        // Act
        phoneBook.add("Anna", "+79864522312");
        int result = phoneBook.add("Kim", "+79812121212");
        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber() {
        // Arrange
        String expected = "Petr";
        phoneBook.add("Kim", "+79812121212");
        phoneBook.add("Anna", "+79864522312");
        phoneBook.add("Petr", "+79864666666");
        // Act
        String result = phoneBook.findByNumber("+79864666666");
        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByName() {
        // Arrange
        String expected = "+79864666666";
        phoneBook.add("Kim", "+79812121212");
        phoneBook.add("Anna", "+79864522312");
        phoneBook.add("Petr", "+79864666666");
        // Act
        String result = phoneBook.findByName("+Petr");
        // Assert
        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    public void endOfTest() {
        System.out.println("[END OF THE TEST]\n---------------------------------------");
    }
}
