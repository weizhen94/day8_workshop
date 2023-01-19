package nus.iss;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        example(); 
    }
    
    public static void example(){
    
    //this is a linked list setup, if it's list, you cannot do ll.removeFirst(); or ll.removeLast(); 
    LinkedList<String> ll = new LinkedList<String>(); 

    //this adds items into the list
    ll.add("A"); 
    ll.add("B");
    ll.add("C");
    ll.add("D");
    ll.add("E");
    ll.add("F");
    ll.add("G");

    ll.remove("C"); 
    //print out the linkedlist, same as System.out.println(ll); 
    ll.forEach(itm -> System.out.println(itm));

    ll.removeFirst(); 
    ll.removeLast(); 

    System.out.println(ll);

    }
    
}
