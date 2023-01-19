package nus.iss;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        example(); 
    }

    public static void example(){
        //hashmap is a type of map object
        Map<String, Integer> phones = new HashMap<>(); 

        phones.put("iphone", 10); 
        phones.put("Huawei", 2); 
        phones.put("Oppo", 4); 
        phones.put("Samsung", 20); 

        System.out.println("Total phone type " + phones.size());

        for (String key: phones.keySet()){
            System.out.println(key + "-" + phones.get(key));
        }

        //this is a dynamic input, using searchString, "" means you can type the value 
        String searchString = ""; 
        Console con = System.console(); 

//while loops makes it such that it will keep looping until you type quit
while (!searchString.equals("quit")){
    searchString = con.readLine("Enter searchString = "); 
    if (phones.containsKey(searchString)){
            System.out.println(searchString + "-" + phones.get(searchString));
        } else {
            System.out.println("Item not found");
        }
        }

        //remove all the Map data
        phones.clear(); 

        //check size of map after clear
        System.out.println("Total phone types: " + phones.size());
    }
    
}
