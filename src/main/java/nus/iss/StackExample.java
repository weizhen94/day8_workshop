package nus.iss;

import java.util.Iterator;
import java.util.Stack;


public class StackExample {
    public static void main(String[] args) {
        example(); 
    }
    public static void example(){
        //like a stack of bricks on top of each other, you take from the top
        Stack<Integer> stack = new Stack<Integer>();

        //pushing or putting something on the stack(FILO, LIFO)
        for (int i = 0; i < 10; i++){
            stack.push(i); 
        }

        //pop or taking something from the stack, this takes 5 items from the top
        for (int i = 0; i<5; i++){
            Integer stackItem = stack.pop(); 
            System.out.println("Stack item (pop): " + stackItem);
        }

        //see what is the last item on top of the stack, so the item on top is 4
        Integer item = stack.peek(); 
        System.out.println(item);

        //get the first element on the stack
        Integer firstItem = stack.firstElement(); 
        System.out.println("First element of Stack: " + firstItem);

        //search for an item in the stack and return the index where its found on the stack
        Integer idxElement = stack.search(2); 
        System.out.println("Stack element found at index " + idxElement);

        //iterating through a stack, to look through a stack, like a loop
        Iterator<Integer> its = stack.iterator(); 
        while(its.hasNext()){
            Integer stackIt = its.next(); 
            System.out.println("Iterator stack item: " + stackIt);
        }

    }
    
}
