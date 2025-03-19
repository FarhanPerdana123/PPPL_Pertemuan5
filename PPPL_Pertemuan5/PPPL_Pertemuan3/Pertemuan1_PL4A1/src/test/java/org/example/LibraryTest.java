package org.example;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Order(1)
    @Test
    public void testAddBookValid() {
        Library library = new Library();
        library.addBook("Harry Potter");
        assertTrue(library.isBookAvailable("Harry Potter"));
    }

    @Order(5)
    @ParameterizedTest
    @MethodSource("org.example.ProviderData#provideInvalidBooks")
    public void testAddBookInvalid(String book) {
        Library library = new Library();
        assertThrows(IllegalArgumentException.class, ()
                -> library.addBook(book), "Judul buku tidak boleh kosong");
    }

    @Order(2)
    @Test
    public void testRemoveBookValid() {
        Library library = new Library();
        library.addBook("Clean Code");
        library.removeBook("Clean Code");
        assertFalse(library.isBookAvailable("Clean Code"));
    }

    @Order(3)
    @Test
    public void testRemoveBookInvalid() {
        Library library = new Library();
        Exception exception = assertThrows(IllegalArgumentException.class, ()
                -> library.removeBook("Nonexistent Book"));
        assertEquals("Buku tidak ditemukan", exception.getMessage());
    }

    @Order(4)
    @Test
    public void testGetAllBooks() {
        Library library = new Library();
        library.addBook("Book A");
        library.addBook("Book B");
        List<String> books = library.getAllBooks();
        assertEquals(2, books.size());
        assertTrue(books.contains("Book A"));
        assertTrue(books.contains("Book B"));
    }
}