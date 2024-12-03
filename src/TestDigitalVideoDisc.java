public class TestDigitalVideoDisc {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD1", "Animation", "A", 80, 14.80f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD2", "Science", "B", 120, 25.50f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD3", "Animation", "C", 122, 17.00f);

        // In ID và tiêu đề DVD
        System.out.println("DVD 1 ID: " + dvd1.getId() + ", Title: " + dvd1.getTitle());
        System.out.println("DVD 2 ID: " + dvd2.getId() + ", Title: " + dvd2.getTitle());
        System.out.println("DVD 3 ID: " + dvd3.getId() + ", Title: " + dvd3.getTitle());

        // Sử dụng tên lớp để gọi phương thức tĩnh
        System.out.println("Total DVDs created: " + DigitalVideoDisc.getNbDigitalVideoDiscs());
    }
}