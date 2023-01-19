package nus.iss;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {
    public static void main(String[] args) {
        
        //custom array with data
        String name[] = {"darryl", "elaine", "james", "zoanne", "chris", "mark", "sophia", "asher", "brandon", "helen", "daniel", "marcus"}; 

        //print out unsorted array
        System.out.println("unsorted array = " + Arrays.toString(name));

        //sort the array in ascending order
        Arrays.sort(name); 

        //print out sorted array
        System.out.println("sorted array = " + Arrays.toString(name));

        //sort array in descending order
        Arrays.sort(name, Collections.reverseOrder()); 

        //print out the reverse sorted array
        System.out.println("sorted array(reverse) = " + Arrays.toString(name));

        //only this can be used for collection.reverseOrder 
        Integer numbers[] = {10, 5, 1, 2, 3, 4, 7, 6, 9, 8}; 
        
        // //this cannot be used for collection.reverseOrder
        // int[] numbers = {10, 5, 1, 2, 3, 4, 7, 6, 9, 8}; 

        Arrays.sort(numbers, Collections.reverseOrder()); 

        System.out.println("sorted array(reverse) = " + Arrays.toString(numbers));


    }
    
}
