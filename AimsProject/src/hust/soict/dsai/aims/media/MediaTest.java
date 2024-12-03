package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class MediaTest {
    public static void main(String[] args) {
        // Tạo một ArrayList chứa các đối tượng Media
        List<Media> mediaList = new ArrayList<>();

        // Tạo các đối tượng cụ thể của Media
        Media cd = new CompactDisc(1, "Best Hits", "Music", 19.99f, 60, "John Doe", "Artist X");
        Media dvd = new DigitalVideoDisc("Action Movie", "Action", "Jane Smith", 120, 15.99f);
        Media book = new Book(3, "Java Programming", "Education", 39.99f);

        // Thêm các đối tượng vào ArrayList
        mediaList.add(cd);
        mediaList.add(dvd);
        mediaList.add(book);

        // Duyệt qua ArrayList và in thông tin các đối tượng sử dụng phương thức toString()
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}
