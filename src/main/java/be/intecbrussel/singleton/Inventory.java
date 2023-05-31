package be.intecbrussel.singleton;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static Inventory inventory;
    private List<Product> inventoryList;
    private Inventory(){
       inventoryList = new ArrayList<>();
    }
    public static Inventory getInventory() {

        if(inventory == null){
            return inventory =  new Inventory();
        }
        return inventory;
    }

    public void addProduct(Product product){
        inventoryList.add(product);
    }
    public void removeProduct(Product product){
        inventoryList.remove(product);
    }

    public List<Product> printProducts(){
        return inventoryList;
    }
}
