package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/30/2021 , 
    CREATED ON : 3:51 PM
*/

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new HashMap<>();
    }

    public StockItem get(String key){
        return list.get(key);
    }

    public Map<String, Double> priceList(){
        Map<String, Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item: list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItem> items(){
        return Collections.unmodifiableMap(list);
    }

    public int addStock(StockItem item) {
        if(item != null) {
            // check if already have quantities of this item
               StockItem inStock = list.getOrDefault(item.getName(), item);
            // StockItem inStock = list.get(item.getName());
            // If there are already on this item, adjust the quantity
            if(inStock != item){
                item.adjustStock(inStock.getQuantityStock());
            }
            list.put(item.getName(), item);

            return item.getQuantityStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);
        if((inStock != null) && (inStock.getQuantityStock() >= quantity) && (quantity >0)){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item: list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.getQuantityStock();

            s = s + stockItem + ". There are " + stockItem.getQuantityStock() + " in stock. Value of items: ";
            s = s + String.format("%.2f", itemValue) + "\n"; // String.format (two decimal points)
            totalCost += itemValue;
        }

        return s + "Total stock value " + String.format("%.2f", totalCost);
    }
}
