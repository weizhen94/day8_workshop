package nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {
    public static void main(String[] args) {
        example01(); 
        example02(); 
    }
    
    public static void example01() {
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
        //can use comparator to sort in reverse order because of the number data type
        numbers.sort(Comparator.reverseOrder()); 

        System.out.println("Sorted list (revers):" + numbers);

    }

    public static void example02() {
        Employee emp1 = new Employee("12345", "darryl ng", "ss", "lecturer", "darryl@nus.edu", 20000); 
        Employee emp2 = new Employee("23456", "thomas eng", "s", "lecturer", "thomas@nus.edu", 10000);
        Employee emp3 = new Employee("00434", "gab tan", "ssa", "lecturer", "gab@nus.edu", 21000);

        List<Employee> employees = new ArrayList<Employee>(); 
        employees.add(emp1); 
        employees.add(emp2); 
        employees.add(emp3); 

        System.out.println("employees before sorting = " + employees);

        //sorting by name 
        Collections.sort(employees); 

        System.out.println("employees after sorting = " + employees);

        //Sorting using comparator and lambda
        employees.sort(Comparator.comparing(e -> e.getSalary()));
        System.out.println("Sorted employee (salary) + " + employees); 

    }
    
}
