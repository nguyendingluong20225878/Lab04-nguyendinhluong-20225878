public class StoreTest {
    public static void main(String[] args) {
        // Create a store
        Store store = new Store();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.99f);

        // Add DVDs to the store
        System.out.println("Adding DVDs to the store...");
        store.addDVD(dvd1, dvd2, dvd3);

        // Print the store contents
        System.out.println("\nCurrent DVDs in the store:");
        store.printStore();

        // Remove a DVD from the store
        System.out.println("\nRemoving a DVD from the store...");
        store.removeDVD(dvd2);

        // Print the store contents again
        System.out.println("\nCurrent DVDs in the store after removal:");
        store.printStore();

        // Attempt to remove a DVD not in the store
        System.out.println("\nAttempting to remove a DVD not in the store...");
        store.removeDVD(dvd2);
    }
}
