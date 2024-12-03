package hust.soict.dsai.aims;

import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.Media;

public class Aims {
    private static final Store store = new Store();
    private static final Cart cart = new Cart();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMainMenu();
    }

    public static void showMainMenu() {
        while (true) {
            System.out.println("\nAIMS:");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    viewCart();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void viewStore() {
        store.printStore();
        System.out.println("\nOptions:");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                seeMediaDetails();
                break;
            case 2:
                addMediaToCart();
                break;
            case 3:
                playMedia();
                break;
            case 4:
                viewCart();
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

    public static void updateStore() {
        System.out.println("\nUpdate Store:");
        System.out.println("1. Add Media");
        System.out.println("2. Remove Media");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter title of new media: ");
                String title = scanner.nextLine();
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                System.out.print("Enter cost: ");
                float cost = scanner.nextFloat();
                store.addMedia(new DigitalVideoDisc(title, category, cost));
                break;
            case 2:
                System.out.print("Enter title of media to remove: ");
                title = scanner.nextLine();
                DigitalVideoDisc toRemove = findMediaByTitleInStore(title);
                if (toRemove != null) {
                    store.removeMedia(toRemove);
                } else {
                    System.out.println("Media not found in store.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void viewCart() {
        cart.print();
        System.out.println("\nOptions:");
        System.out.println("1. Search Media by Title");
        System.out.println("2. Remove Media from Cart");
        System.out.println("3. Place Order");
        System.out.println("0. Back");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter media title: ");
                String title = scanner.nextLine();
                cart.searchByTitle(title);
                break;
            case 2:
                System.out.print("Enter media title to remove: ");
                title = scanner.nextLine();
                DigitalVideoDisc toRemove = findMediaByTitleInCart(title);
                if (toRemove != null) {
                    cart.removeMedia(toRemove);
                } else {
                    System.out.println("Media not found in cart.");
                }
                break;
            case 3:
                System.out.println("Order placed successfully!");
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

    public static void seeMediaDetails() {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();
        DigitalVideoDisc media = findMediaByTitleInStore(title);
        if (media != null) {
            System.out.println("Media Details:");
            System.out.println(media);
        } else {
            System.out.println("Media not found in store.");
        }
    }

    public static void addMediaToCart() {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();
        DigitalVideoDisc media = findMediaByTitleInStore(title);
        if (media != null) {
            cart.addMedia(media);
        } else {
            System.out.println("Media not found in store.");
        }
    }

    public static void playMedia() {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();
        DigitalVideoDisc media = findMediaByTitleInStore(title);
        if (media != null) {
            media.play();
        } else {
            System.out.println("Media not found in store.");
        }
    }

    private static DigitalVideoDisc findMediaByTitleInStore(String title) {
        for (Media media : store.getItemsInStore()) {
            if (media instanceof DigitalVideoDisc && media.getTitle().equalsIgnoreCase(title)) {
                return (DigitalVideoDisc) media;
            }
        }
        return null;
    }

    private static DigitalVideoDisc findMediaByTitleInCart(String title) {
        for (Media media : cart.getItemsOrdered()) {
            if (media instanceof DigitalVideoDisc && media.getTitle().equalsIgnoreCase(title)) {
                return (DigitalVideoDisc) media;
            }
        }
        return null;
    }
}
