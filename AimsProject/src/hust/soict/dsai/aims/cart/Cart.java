package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); // Sử dụng ArrayList để chứa các Media
    private int qtyOrdered = 0;

    // Add a single DVD to the cart
    public void addMedia(Media media) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            qtyOrdered++;
            System.out.println("The media \"" + media.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is almost full. Cannot add more items.");
        }
    }
    public void addMedia(Media...mediaList ) {
    	for (Media media : mediaList) {
            addMedia(media);
        }
    } 
    public void removeMedia(Media media) {
    	if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            qtyOrdered--;
            System.out.println("The media \"" + media.getTitle() + "\" has been removed.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" was not found in the cart.");
        }
    }
    
    // Calculate the total cost of items in the cart, tính tổng chi phí
    public double totalCost() {
        double total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Print details of the cart, in chi tiết giỏ hàng
    public void print() {
        
        System.out.println("Ordered Items:");
        double totalCost = 0;

        for (int i = 0; i < qtyOrdered; i++) {
        	 Media media = itemsOrdered.get(i);
        	 System.out.println((i + 1) + ". " + media.getClass().getSimpleName() + " - " + media.getTitle());
             totalCost += media.getCost();
        }

        System.out.println("Total cost: " + totalCost + " $");
       
    }

    // Search for Media by ID
    public void searchById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Media Found: " + media.toString());
                return;
            }
        }
        System.out.println("No media found with ID: " + id);
    }

    // Search for Media by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            // Kiểm tra xem tiêu đề có trùng khớp không
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Media found: " + media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with title: " + title);
        }
    }
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered; // itemsOrdered là danh sách sản phẩm trong giỏ hàng
    }


}