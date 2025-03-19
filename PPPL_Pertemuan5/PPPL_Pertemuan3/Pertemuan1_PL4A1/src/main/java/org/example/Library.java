package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String book) {
        if (book == null || book.trim().isEmpty()) {
            throw new IllegalArgumentException("Judul buku tidak boleh kosong");
        }
        books.add(book);
    }

    public void removeBook(String book) {
        if (!books.contains(book)) {
            throw new IllegalArgumentException("Buku tidak ditemukan");
        }
        books.remove(book);
    }

    public boolean isBookAvailable(String book) {
        return books.contains(book);
    }

    public List<String> getAllBooks() {
        return new ArrayList<>(books);
    }
}
