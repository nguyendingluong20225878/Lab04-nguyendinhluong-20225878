package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private static final int MAX_ITEMS_IN_STORE = 50; // Maximum number of items the store can hold
    private ArrayList<Media> itemsInStore = new ArrayList<Media>(); // Use ArrayList to store Media items

    // Add a single Media item to the store
    public void addMedia(Media media) {
        if (itemsInStore.size() < MAX_ITEMS_IN_STORE) {
            itemsInStore.add(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more items.");
        }
    }

    // Add multiple Media items to the store
    public void addMedia(Media... mediaList) {
        for (Media media : mediaList) {
            addMedia(media);
        }
    }

    // Remove a Media item from the store
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" was not found in the store.");
        }
    }

    // Print all items in the store
    public void printStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i));
            }
        }
    }
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore; // itemsInStore là danh sách sản phẩm trong store
    }

}
