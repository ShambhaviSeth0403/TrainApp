import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UC14TEST {

    @Test
    void testException_ValidCapacityCreation() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("Sleeper", 50);
        assertEquals("Sleeper", bogie.getType());
        assertEquals(50, bogie.getCapacity());
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        InvalidCapacityException ex = assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("AC Chair", -10)
        );
        assertEquals("Capacity must be greater than zero", ex.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        InvalidCapacityException ex = assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("First Class", 0)
        );
        assertEquals("Capacity must be greater than zero", ex.getMessage());
    }

    @Test
    void testException_ExceptionMessageValidation() {
        InvalidCapacityException ex = assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("Sleeper", -5)
        );
        assertTrue(ex.getMessage().contains("greater than zero"));
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("Sleeper", 60);
        assertEquals("Sleeper", bogie.getType());
        assertEquals(60, bogie.getCapacity());
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws InvalidCapacityException {
        PassengerBogie b1 = new PassengerBogie("Sleeper", 50);
        PassengerBogie b2 = new PassengerBogie("AC Chair", 40);
        PassengerBogie b3 = new PassengerBogie("First Class", 20);

        assertNotNull(b1);
        assertNotNull(b2);
        assertNotNull(b3);
    }
}
