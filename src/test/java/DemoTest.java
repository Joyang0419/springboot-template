import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    @Test
    void testAddition() {
        // Arrange
        int a = 1;
        int b = 2;
        int expected = 3;

        // Act
        int result = a + b;

        // Assert
        assertEquals(expected, result, "1 + 2 should equal 3");
    }

    @Test
    void testString() {
        // Arrange
        String text = "Hello";

        // Act & Assert
        assertNotNull(text, "String should not be null");
        assertTrue(text.length() > 0, "String should not be empty");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Test starting...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test finished.");
    }

    @Test
    void testException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Invalid argument");
        });

        assertEquals("Invalid argument", exception.getMessage());
    }
}