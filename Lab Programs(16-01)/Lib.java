import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void saveToFile(String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (Book book : books) {
                String bookInfo = book.getTitle() + "," + book.getAuthor() + "," + book.getISBN() + "\n";
                fos.write(bookInfo.getBytes());
            }
            System.out.println("Books saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving books to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int content;
            String bookInfo = "";
            while ((content = fis.read()) != -1) {
                bookInfo += (char) content;
            }
            String[] booksData = bookInfo.split("\n");
            for (String bookData : booksData) {
                String[] bookInfoArray = bookData.split(",");
                books.add(new Book(bookInfoArray[0], bookInfoArray[1], bookInfoArray[2]));
            }
            System.out.println("Books loaded from file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error loading books from file: " + e.getMessage());
        }
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class Lib {
    public static void main(String[] args) {
        Library library = new Library();
        
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", "0987654321");
        library.addBook(book1);
        library.addBook(book2);
    }
}
        
