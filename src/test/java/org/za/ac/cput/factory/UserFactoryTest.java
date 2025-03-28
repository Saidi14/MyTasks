package org.za.ac.cput.factory;

import org.junit.jupiter.api.*;
import org.za.ac.cput.domain.User;
import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserFactoryTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = UserFactory.createUser(1, "Samkelo", "Sam", "samkelo@cput.com", "password123",
                "0784561234", "User");
    }

    @Test
    @Order(1)
    void createUser_success() {
        assertNotNull(user);
        assertEquals(1, user.getUserId());
        assertEquals("Samkelo", user.getName());
        assertEquals("Sam", user.getLastName());
        assertEquals("samkelo@cput.com", user.getEmail());
        assertEquals("password123", user.getPassword());
        assertEquals("0784561234", user.getPhoneNumber());
        assertEquals("User", user.getRole());
        System.out.println(" User created successfully: " + user);
    }

    @Test
    @Order(2)
    void createUser_fail_emptyName() {
        User invalidUser = UserFactory.createUser(2, "", "Bloem", "saacbloem@gmail.com", "password123",
                "0784561234", "User");
        assertNull(invalidUser);
        System.out.println(" Failed to create user with empty name");
    }

    @Test
    @Order(3)
    void createUser_fail_nullRole() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserFactory.createUser(3, "Adam", "Hendricks", "adamhendricks@gmail.com", "pass123",
                    "0712345678", null);
        });
        System.out.println("⚠️ Exception for null role: " + exception.getMessage());
    }
}