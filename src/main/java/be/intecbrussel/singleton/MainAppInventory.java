package be.intecbrussel.singleton;

public class MainAppInventory {
    public static void main(String[] args) {


        Product toy = new Product("toy");

        Inventory.getInventory().addProduct(toy);

        Inventory.getInventory().printProducts().forEach(System.out::println);





    }
}
