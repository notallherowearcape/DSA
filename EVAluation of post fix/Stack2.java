 public class Stack2 { 
    int stack[]; 
    int top; 
    int size; 
 
    public Stack2(int size) { 
        this.size = size; 
        top = -1; 
        stack = new int[size]; 
    } 
 
    // Pushes an element onto the stack 
    public void push(int element) { 
        top++; 
        stack[top] = element; 
    } 
 
    // Pops an element from the stack 
    public int pop() { 
        int delement = stack[top]; 
        top--; 
        return delement; 
    } 
 
    // Returns the top element of the stack without removing it 
    public int topElement() { 
        return stack[top]; 
    } 
} 
 
