package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

    // Constructor với tiêu đề
    public DigitalVideoDisc(String title) {
        super(++nbDigitalVideoDiscs, title, null, 0, 0, null); // Gọi constructor của Disc
    }

    // Constructor với tiêu đề, thể loại, chi phí
    public DigitalVideoDisc(String title, String category, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, null); // Gọi constructor của Disc
    }

    // Constructor với tiêu đề, thể loại, đạo diễn, chi phí
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, director); // Gọi constructor của Disc
    }

    // Constructor đầy đủ
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, length, director); // Gọi constructor của Disc
    }

    // Getter cho số lượng DVD
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // Phương thức kiểm tra tiêu đề
    public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    @Override
    public String toString() {
        return super.toString() + "\nDirector: " + director + "\nLength: " + length + " minutes";
    }
}
