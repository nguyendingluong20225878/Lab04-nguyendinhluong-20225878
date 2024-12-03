package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();

    // Constructor không tham số (nếu cần)
    public Book() {}

    // Constructor có tham số đầy đủ
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    // Phương thức thêm tác giả
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("Author already exists: " + authorName);
        }
    }

    // Phương thức xóa tác giả
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Author not found: " + authorName);
        }
    }

    // Getter cho danh sách tác giả
    public List<String> getAuthors() {
        return authors;
    }

    // Phương thức hiển thị chi tiết sách
    public void displayDetails() {
        System.out.println("Book ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Category: " + getCategory());
        System.out.println("Cost: $" + getCost());
        System.out.println("Authors: " + String.join(", ", authors));
    }
    @Override
    public String toString() {
        return super.toString() + "\nAuthors: " + String.join(", ", authors);
    }
}
