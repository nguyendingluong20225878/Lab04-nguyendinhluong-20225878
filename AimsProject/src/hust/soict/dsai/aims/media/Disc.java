package hust.soict.dsai.aims.media;

public class Disc extends Media {
    protected int length;
    protected String director;

    // Constructor không tham số
    public Disc() {}

    // Constructor với các tham số từ lớp Media
    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost); // Gọi constructor của Media
        this.length = length;
        this.director = director;
    }

    // Getter và Setter cho length và director
    public int getLength() {
        return length;
    }
 
    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
