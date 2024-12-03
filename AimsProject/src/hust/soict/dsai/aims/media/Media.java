package hust.soict.dsai.aims.media;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    // Constructor không tham số (nếu cần)
    public Media() {}

    // Constructor có tham số đầy đủ
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getter (giữ lại để lấy giá trị thuộc tính)
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    // Setter chỉ giữ lại nếu thực sự cần (xóa các setter không cần thiết)
    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu obj là instance của Media
        if (obj instanceof Media) {
            Media other = (Media) obj;
            // So sánh thuộc tính title
            return this.title != null && this.title.equals(other.getTitle());
        }
        return false; // Trả về false nếu obj không phải Media
    }
    @Override
    public String toString() {
        return "Title: " + title + "\nCategory: " + category + "\nCost: " + cost;
    }

}
