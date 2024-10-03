public class Stack {
    int size;
    int[] stack;
    int top;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public int top() {
        return stack[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top >= size - 1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = element;
        }
    }

    public int pop() {
        int deletedElement;
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        } else {
            deletedElement = stack[top];
            top--;
            return deletedElement;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("No Element to display");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print("| " + stack[i]);
            }
        }
    }
}

