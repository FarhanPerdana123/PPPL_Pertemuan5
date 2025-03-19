package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {

    static UserManager um;

    @BeforeAll
    static void classSetup() {
        um = new UserManager();
        System.out.println("Gass Mulai");
    }

    @AfterAll
    static void classCleanup() {
        System.out.println("Selesai");
    }

    @BeforeEach
    void methodSetup() {
        um.addUser("user1");
        System.out.println("method setup");
    }

    @AfterEach
    void methodCleanup() {
        System.out.println("method cleanup");
    }

    @Test
    void testAddUser() {
        um.addUser("user1");
        assertTrue(um.userExist("user1"));
    }

    @Test
    void testRemoveUser() {
        um.removeUser("user1");
        assertFalse(um.userExist("user1"));
    }

    @Test
    void testGetUserCount() {
        assertEquals(1, um.getUserCount());
    }

    @Test
    void testUserExist() {
        um.addUser("user1");
        assertTrue(um.userExist("user1"));
    }

    @Test
    void testClearUsers() {
        um.clearUsers();
        assertEquals(0, um.getUserCount());
    }
}