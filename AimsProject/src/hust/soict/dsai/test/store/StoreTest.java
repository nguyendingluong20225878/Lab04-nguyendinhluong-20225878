package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a store
        Store store = new Store();

        // Create some Media items (DVDs, Books, etc.)
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.99f);
        Book book1 = new Book(1,"Java Programming", "Education", 50.0f);
        Book book2 = new Book(2,"The Art of War", "Strategy", 15.0f);

        // Add Media items to the store
        System.out.println("Adding Media items to the store...");
        store.addMedia(dvd1, dvd2, dvd3, book1, book2);

        // Print the store contents
        System.out.println("\nCurrent items in the store:");
        store.printStore();

        // Remove a Media item from the store
        System.out.println("\nRemoving a Media item from the store...");
        store.removeMedia(dvd2);

        // Print the store contents again
        System.out.println("\nCurrent items in the store after removal:");
        store.printStore();

        // Attempt to remove a Media item not in the store
        System.out.println("\nAttempting to remove a Media item not in the store...");
        store.removeMedia(dvd2); // DVD2 has already been removed
    }
}
