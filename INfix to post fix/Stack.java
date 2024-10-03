public class Stack { 
    int size; 
    char stack[]; 
    int top; 
    public Stack(int size) { 
    this.size = size; 
    stack = new char[size]; 
    top = -1; 
    } 
    // isEmpty() checks if the stack is empty by returning true if top is -1. 
    public boolean isEmpty() { 
    return top == -1; 
    } 
     
        // isFull() checks if the stack is full by comparing the top index to size - 1. 
        public boolean isFull() { 
            return top == size - 1; 
        } 
     
        // topElement() returns the top element of the stack without removing it. 
        public char topElement() { 
            if (!isEmpty()) { 
                return stack[top]; 
            } 
            return '\0'; // null character to indicate empty stack 
        } 
     
        // push() adds an element to the stack if it is not full. 
        public void push(char symbol) { 
            if (isFull()) { 
                System.out.println("Stack Overflow"); 
            } else { 
                stack[++top] = symbol; 
            } 
        } 
     
        // pop() removes and returns the top element from the stack. 
        public char pop() { 
            if (!isEmpty()) { 
                return stack[top--]; 
            } 
            return '\0'; // null character to indicate empty stack 
        } 
    } 
    