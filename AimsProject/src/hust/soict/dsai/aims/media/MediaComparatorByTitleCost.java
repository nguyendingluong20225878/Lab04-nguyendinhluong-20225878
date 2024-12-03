package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        // So sánh theo tiêu đề trước
        int result = m1.getTitle().compareToIgnoreCase(m2.getTitle());
        
        // Nếu tiêu đề bằng nhau, tiếp tục so sánh theo chi phí
        if (result == 0) {
            result = Float.compare(m1.getCost(), m2.getCost());
        }
        
        return result;
    }
}
