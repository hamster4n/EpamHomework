package ua.org.crazy.homework19.task02;

import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class UserTest {
    private static User user1;
    private static User user1TheSame;
    private static User user2;

    @BeforeClass
    public static void init() {
        String name1 = "Igor";
        String name2 = "John";
        String surname1 = "Ivanov";
        String surname2 = "Petrov";
        Address address1 = new Address("Kiev");
        Address address2 = new Address("Oslo");
        LocalDate birthday1 = LocalDate.of(1978, 1, 13);
        LocalDate birthday2 = LocalDate.of(1980, 10, 7);
        int index1 = 17324;
        int index2 = 55145;
        Sex sex1 = Sex.FEMAIL;
        Sex sex2 = Sex.FEMAIL;

        user1 = new User(name1, surname1, address1, birthday1, index1, sex1);
        user1TheSame = new User(name1, surname1, address1, birthday1, index1, sex1);
        user2 = new User(name2, surname2, address2, birthday2, index2, sex2);
    }

    @Test
    public void methodEqualsShouldReturnTrue() {
        boolean actual = user1.equals(user1TheSame);
        assertTrue(actual);
    }

    @Test
    public void methodEqualsShouldReturnFalse() {
        boolean actual = user1.equals(user2);
        assertFalse(actual);
    }

    @Test
    public void methodHashCodeShouldReturnTheSameHashToSameDifferentObjects() {
        int hashCode1 = user1.hashCode();
        int hashCode2 = user1TheSame.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void methodHashCodeShouldReturnTheSameHashToSameObject() {
        int hashCode1 = user1.hashCode();
        int hashCode2 = user1.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void methodHashCodeShouldReturnDifferentHashToDifferentObjects() {
        int hashCode1 = user1.hashCode();
        int hashCode2 = user2.hashCode();
        assertNotEquals(hashCode1, hashCode2);
    }
}
