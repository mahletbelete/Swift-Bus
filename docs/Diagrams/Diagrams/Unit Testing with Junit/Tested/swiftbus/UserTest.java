package Swiftbus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User(1, "John Doe", "john@example.com");
    }

    @Test
    void testUserIdGetterSetter() {
        user.setUserId(2);
        assertEquals(2, user.getUserId());
    }

    @Test
    void testNameGetterSetter() {
        user.setName("Alice");
        assertEquals("Alice", user.getName());
    }

    @Test
    void testEmailGetterSetter() {
        user.setEmail("alice@example.com");
        assertEquals("alice@example.com", user.getEmail());
    }

    @Test
    void testParameterizedConstructor() {
        User newUser = new User(3, "Bob", "bob@example.com");
        assertEquals(3, newUser.getUserId());
        assertEquals("Bob", newUser.getName());
        assertEquals("bob@example.com", newUser.getEmail());
    }
}
