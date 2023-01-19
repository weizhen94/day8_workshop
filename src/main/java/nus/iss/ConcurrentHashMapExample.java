package nus.iss;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        example(); 
    }

    public static void example(){
        Map<String, Integer> laptops = new ConcurrentHashMap<>(); 
        laptops.put("Acer", 5); 
        laptops.put("Apple", 10); 
        laptops.put("MSI", 10); 
        laptops.put("Asus", 15);
        
        //get the total size of the map objects
        System.out.println("Total laptops: " + laptops.size());

        //iterate through the map (laptops), use KeySet method
        for (String key : laptops.keySet()){
            System.out.println(key + "-" + laptops.get(key));
        }

        String searchString = "Asus"; 
        if (laptops.containsKey(searchString)){
            System.out.println(searchString + "-" + laptops.get(searchString));
        }

        //like scanner, it loops through the objects, it's another type of iterater
        //concurrenthashmap allows you to use elements 
        Enumeration<Integer> elems = ((ConcurrentHashMap<String, Integer>)laptops).elements(); 
        while(elems.hasMoreElements()){
            System.out.println(elems.nextElement());
        }

        Integer retValue = laptops.putIfAbsent("Apple", 25); 
        if (retValue != null){
            System.out.println("Item found: " + retValue);
        }

        retValue = laptops.putIfAbsent("Microsoft", 18); 
        // laptops.put("Microsoft", null); 
        for (String key : laptops.keySet()){
            System.out.println(key + "-" + laptops.get(key));
        }

    }
    
}
