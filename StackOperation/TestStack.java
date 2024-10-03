import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        int choice = 0;
        int size;
        int newElement;
        int deletedElement;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of Stack");
        size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (choice != 8) {
            System.out.println("1. PUSH 2. POP 3. Display 4. Find Top Element 5. Find the Size 6. Stack is Empty 7. Stack is Full 8. Exit");
            System.out.println("Enter Your Choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("New Element");
                    newElement = scanner.nextInt();
                    stack.push(newElement);
                    break;
                case 2:
                    deletedElement = stack.pop();
                    if (!stack.isEmpty()) {
                        System.out.println("The deleted Element is :" + deletedElement);
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Top Element:" + stack.top());
                    break;
                case 5:
                    System.out.println("Size:" + stack.size());
                    break;
                case 6:
                    System.out.println("IS Stack is Empty :" + stack.isEmpty());
                    break;
                case 7:
                    System.out.println("Is Stack is Full:" + stack.isFull());
                    break;
            }
            System.out.println("");
        }
        scanner.close();
    }
}