package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;

public class CartTest { 
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Create sample Media objects using correct constructors
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.99f);
        
        CompactDisc cd1 = new CompactDisc(4, "The Best of Rock", "Music", 15.99f, 60, "Various Artists", "Various Artists");
        Book book1 = new Book(5, "Java Programming", "Education", 50.0f);

        // Add media to the cart
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        cart.addMedia(cd1);
        cart.addMedia(book1);

        // Test print method
        cart.print();

        // Test search by ID
        System.out.println("\nSearching for Media with ID 1:");
        cart.searchById(1);
        System.out.println("\nSearching for Media with ID 3:");
        cart.searchById(3);
        System.out.println("\nSearching for Media with ID 5:");
        cart.searchById(5);

        // Test search by title
        System.out.println("\nSearching for Media with title 'Aladdin':");
        cart.searchByTitle("Aladdin");

        System.out.println("\nSearching for Media with title 'Frozen':");
        cart.searchByTitle("Frozen");
    }
}
