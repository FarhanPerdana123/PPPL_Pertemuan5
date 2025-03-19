package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSystemTest {

    static TransactionSystem ts;

    @BeforeAll
    static void classSetup(){
        ts = new TransactionSystem(50000);
    }

    @AfterAll
    static void classCleanup(){
        TransactionSystem.closeConnection();
    }

    @AfterEach
    void methodCleanup(){
        System.out.println(ts.getBalance());
    }

    @BeforeEach
    void methodSetup(){
        ts.deposit(100000);
    }

    @Test
    void testDeposit() {
        ts.deposit(100000);
        assertEquals(250000, ts.getBalance());
    }

    @Test
    void testWithdraw() {
        ts.deposit(100000);
        ts.withdraw(50000);
        assertEquals(200000, ts.getBalance());
    }

    @Test
    void testGetBalance() {
    }

    @Test
    void resetBalance() {
    }

    @Test
    void openConnection() {
    }

    @Test
    void closeConnection() {
    }
}