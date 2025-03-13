package org.example;

import org.example.Kalkulator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class KalkulatorTest {

//    @BeforeAll
//    static void setup(){
//        System.out.println("beforeAll");
//    }
//
//    @BeforeEach
//    void setupMethod(){
//        System.out.println("beforeEach");
//    }
//
//    @AfterAll
//    static void afterAll(){
//        System.out.println("afterAll");
//    }
//
//    @AfterEach
//    void afterEach(){
//        System.out.println("afterEach");
//    }

//    @Test
//    void testTambahNotNull() {
//        Kalkulator calc = new Kalkulator(10, 5);
//        Assertions.assertNotNull(calc.tambah());
//    }
//
//    @Test
//    void testTambahResultValue() {
//        Kalkulator calc = new Kalkulator(10, 5);
//        assertEquals(15, calc.tambah(), "Hasil penjumlahan salah");
//    }
//
//    @Test
//    void testTambahComplete() {
//        Kalkulator calc = new Kalkulator(5, 10);
//        assertAll(
//                () -> assertEquals(5, calc.a),
//                () -> assertEquals(10, calc.b),
//                () -> assertEquals(15, calc.tambah())
//        );
//    }
//
//    @Test
//    void testKurang() {
//        Kalkulator calc = new Kalkulator(10, 5);
//        assertEquals(5, calc.kurang(), "Hasil pengurangan salah");
//    }
//
//    @Test
//    void testKali() {
//        Kalkulator calc = new Kalkulator(10, 5);
//        assertEquals(50, calc.kali(), "Hasil perkalian salah");
//    }
//
//    @Test
//    void testBagi() {
//        Kalkulator calc = new Kalkulator(10, 5);
//        assertEquals(2, calc.bagi(), "Hasil pembagian salah");
//    }
//
//    @Test
//    void testBagiDenganNol() {
//        Kalkulator calc = new Kalkulator(10, 0);
//        Exception exception = assertThrows(ArithmeticException.class, calc::bagi);
//        assertEquals("/ by zero", exception.getMessage(), "Harus melempar ArithmeticException saat dibagi nol");
//    }

    @Order(2)
    @ParameterizedTest
    @ValueSource(ints = {2, 10, 4, 8, 16})
    void testIsEven(int number) {
        Kalkulator calc = new Kalkulator();
        assertTrue(calc.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"www", "aaa", "sss", "ppp"})
    void testCheckName(String name){
        assertNotNull(name);
    }

    static Stream<List<String>> provideArrayData(){
        return Stream.of(
                Arrays.asList("www", "aaa", "sss", "ppp"),
                Arrays.asList("aa", "uu", "dd", "hh")
        );
    }

    @Order(3)
    @ParameterizedTest
    @MethodSource("provideArrayData")
    void testUsingArray(List<String> names){
        //test
    }

    @Order(1)
    @ParameterizedTest
    @CsvSource(
            {
                    "5, 10, 15",
                    "15, 10, 25",
                    "25, 10, 35"
            }
    )
    void testAddition(int a, int b, int expected){
        Kalkulator calc = new Kalkulator();
        assertEquals(expected, calc.tambah(a,b));
    }

    @Order(4)
    @ParameterizedTest
    @MethodSource("org.example.ProviderData#provideDataAdd")
    void testTambahOke(int a, int b, int c){
        Kalkulator calc = new Kalkulator();
        Assertions.assertEquals(c, calc.tambah(a, b));
    }
}
