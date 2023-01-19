package nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(); 

        for(int i=0; i<10; i++)
        //(Math.random()*100) is a double so you have to put (int) infront to do casting 
        numbers.add((int)(Math.random()*100)); 

        System.out.println("Unsorted list: " + numbers);

        //sort in ascending
        Collections.sort(numbers); 

        System.out.println("Sorted list: " + numbers);

        //sort in descending 
        Collections.sort(numbers, Collections.reverseOrder()); 

        System.out.println("Sorted list (revers):" + numbers);

    }
    
}
