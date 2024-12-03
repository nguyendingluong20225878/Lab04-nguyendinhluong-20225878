package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;  // Tên bài hát
    private int length;    // Độ dài bài hát

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getter cho title và length
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    // Phương thức kiểm tra xem hai track có giống nhau không (dựa trên tiêu đề)
    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu obj là instance của Track
        if (obj instanceof Track) {
            Track other = (Track) obj;
            // So sánh thuộc tính title và length
            return this.title != null && this.title.equals(other.getTitle())
                    && this.length == other.getLength();
        }
        return false; // Trả về false nếu obj không phải Track
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + this.title); 
        System.out.println("Track length: " + this.length); 
    } 
}
