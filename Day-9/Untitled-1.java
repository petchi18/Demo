import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Pop element
        System.out.println("Popped: " + stack.pop()); // Output: 30
        
        // Peek top element
        System.out.println("Top: " + stack.peek()); // Output: 20
        
        // Check if stack is empty
        System.out.println("Is Stack Empty? " + stack.isEmpty()); // Output: false
    }
}
