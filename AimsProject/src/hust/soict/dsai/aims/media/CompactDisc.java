package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;                 // Tên nghệ sĩ
    private ArrayList<Track> tracks;      // Danh sách các bài hát

    // Constructor mặc định
    public CompactDisc() {
        this.tracks = new ArrayList<>();
    }

    // Constructor đầy đủ
    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director); // Gọi constructor của Disc
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    // Getter cho artist
    public String getArtist() {
        return artist;
    }

    // Phương thức thêm track vào CD
    public void addTrack(Track track) {
        if (tracks.contains(track)) { // Kiểm tra track đã tồn tại
            System.out.println("Track already exists: " + track.getTitle());
        } else {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        }
    }

    // Phương thức xóa track khỏi CD
    public void removeTrack(Track track) {
        if (tracks.contains(track)) { // Kiểm tra track có tồn tại không
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }

    // Phương thức tính tổng độ dài của CD
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("Artist: " + this.artist);
        System.out.println("Tracks in the CD:");
        for (Track track : tracks) {
            track.play(); // Gọi phương thức play() của Track
        }
    }
    @Override
    public String toString() {
        return super.toString() + "\nArtist: " + artist + "\nTracks: " + tracks.size();
    }
}
