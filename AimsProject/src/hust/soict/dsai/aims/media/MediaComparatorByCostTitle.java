package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        // So sánh theo chi phí trước
        int result = Float.compare(m1.getCost(), m2.getCost());
        
        // Nếu chi phí bằng nhau, tiếp tục so sánh theo tiêu đề
        if (result == 0) {
            result = m1.getTitle().compareToIgnoreCase(m2.getTitle());
        }
        
        return result;
    }
}
