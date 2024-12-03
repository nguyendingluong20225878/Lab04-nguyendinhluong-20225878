public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD1", "Animation", "A", 80, 14.80f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD2", "Science", "B", 120, 25.50f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD3", "Animation", "C", 122, 17.00f);
        
        cart.addDigitalVideoDisc(dvd1, dvd2);

        System.out.println("Total cost: " + cart.totalCost());

        cart.removeDigitalVideoDisc(dvd1);
        System.out.println("Total cost after removal: " + cart.totalCost());
    }
}