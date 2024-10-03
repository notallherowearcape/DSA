import java.util.Scanner; 
 
public class InfixToPostfix { 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        String infix; 
        System.out.println("Enter the Infix Expression:"); 
        infix = scanner.nextLine(); 
        scanner.close(); // Closing scanner to avoid resource leak 
 
        Stack stack = new Stack(infix.length()); 
        int index = 0; 
        char cs; 
 
        // While loop iterates through the infix expression one character at a time. 
        while (index < infix.length()) { 
            cs = infix.charAt(index); 
 
            // If the current character is an operand (letter or digit), print it. 
            if (Character.isLetterOrDigit(cs)) { 
                System.out.print(cs); 
            } 
            // If it's an opening parenthesis, push it onto the stack. 
            else if (cs == '(') { 
                stack.push(cs); 
            } 
            // If it's a closing parenthesis, pop and print until '(' is found. 
            else if (cs == ')') { 
                while (!stack.isEmpty() && stack.topElement() != '(') { 
                    System.out.print(stack.pop()); 
                } 
                stack.pop(); // Discard the opening '(' 
            } 
            // If it's an operator, check for precedence and pop accordingly. 
            else { 
                while (!stack.isEmpty() && priority(cs) <= priority(stack.topElement())) { 
                    System.out.print(stack.pop()); 
                } 
                stack.push(cs); 
            } 
            index++; 
        } 
 
        // After reading the entire expression, pop remaining operators in the stack. 
        while (!stack.isEmpty()) { 
            System.out.print(stack.pop()); 
        } 
    } 
 
    // priority() returns precedence levels for operators. 
    public static int priority(char op) { 
        switch (op) { 
            case '(': 
                return 0; 
            case '+': 
            case '-': 
                return 1; 
            case '*': 
            case '/': 
            case '%': 
                return 2; 
            case '^': 
                return 3; 
        } 
        return -1; // For unknown operators 
    } 
} 
