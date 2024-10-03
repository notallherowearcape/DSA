 
import java.util.Scanner; 
 
public class EvaluationOfPostfix { 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        String postfix; 
        int index = 0; 
        char currentSymbol; 
         
        // Take the postfix expression input from the user 
        System.out.println("Enter the Postfix Expression:"); 
        postfix = scanner.nextLine(); 
         
        Stack stack = new Stack(postfix.length()); 
        int operand1, operand2, result; 
         
        // Loop through the postfix expression 
        while (index < postfix.length()) { 
            currentSymbol = postfix.charAt(index); 
             
            // If the symbol is an operand, push its numeric value onto the stack 
            if (Character.isDigit(currentSymbol)) { 
                stack.push(Character.getNumericValue(currentSymbol)); 
            }  
            // If the symbol is an operator, pop two operands and compute the result 
            else { 
                operand2 = stack.pop(); 
                operand1 = stack.pop(); 
                result = compute(operand1, operand2, currentSymbol); 
                stack.push(result); 
            } 
            index++; 
        } 
         
        // Final result will be the only element left in the stack 
        System.out.println("The Result: " + stack.pop()); 
        scanner.close(); 
    } 
 
    // Method to compute the result of two operands based on the operator 
    public static int compute(int op1, int op2, char op) { 
        switch (op) { 
            case '+': return op1 + op2; 
            case '-': return op1 - op2; 
            case '*': return op1 * op2; 
            case '/': return op1 / op2; 
            case '%': return op1 % op2; 
            case '^': return (int) Math.pow(op1, op2); // Exponentiation 
        } 
        return -1; 
    } 
} 
