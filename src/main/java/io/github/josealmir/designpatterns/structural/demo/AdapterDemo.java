package io.github.josealmir.designpatterns.structural.demo;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        ShopInventory shop = new ShopInventory();
        GroceryItem item = new GroceryItem("Milk", 2);
        GroceryItemAdapter adapter = new GroceryItemAdapter(item);
        shop.addProduct(adapter);
    }

    static class GroceryItem {
        private final String itemName;
        private final int costPerUnit;

        public GroceryItem(String itemName, int costPerUnit) {
            this.itemName = itemName;
            this.costPerUnit = costPerUnit;
        }

        public String getItemName() {
            return itemName;
        }

        public int getCostPerUnit() {
            return costPerUnit;
        }
    }

    interface Product {
        String getName();

        int getPrice();
    }

    static class GroceryItemAdapter implements Product {
        private final GroceryItem groceryItem;

        public GroceryItemAdapter(GroceryItem groceryItem) {
            this.groceryItem = groceryItem;
        }

        @Override
        public String getName() {
            return groceryItem.getItemName();
        }

        @Override
        public int getPrice() {
            return groceryItem.getCostPerUnit();
        }
    }

    static class ShopInventory {
        List<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(Product product) {
            products.remove(0);
        }
    }
}

