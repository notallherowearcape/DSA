import java.util.Scanner;
public class LLoperations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList l1 = new LinkedList();
            int choice = 0;

            while (true) {
                System.out.println("1.Display 2.Insert-End 3.Insert-Beg 4.Insert-Pos 5.Insert-Before 6.Insert-After 7.Delete-Beg 8.Delete-End 9.Delete-Pos 10.Search 11.Exit");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        l1.display();
                        break;
                    case 2:
                        System.out.println("Data:");
                        l1.insertEnd(scanner.nextInt());
                        break;
                    case 3:
                        System.out.println("Data:");
                        l1.insertBeg(scanner.nextInt());
                        break;
                    case 4:
                        System.out.println("Position:");
                        int pos = scanner.nextInt();
                        System.out.println("Data:");
                        l1.insertPos(pos, scanner.nextInt());
                        break;
                    case 5:
                        System.out.println("Data to insert:");
                        int bNodeData = scanner.nextInt();
                        System.out.println("Node data (Before):");
                        l1.insertBefore(scanner.nextInt(), bNodeData);
                        break;
                    case 6:
                        System.out.println("Data to insert:");
                        int aNodeData = scanner.nextInt();
                        System.out.println("Node data (After):");
                        l1.insertAfter(scanner.nextInt(), aNodeData);
                        break;
                    case 7:
                        System.out.println("Deleted node: " + l1.deleteBeg());
                        break;
                    case 8:
                        System.out.println("Deleted node: " + l1.deleteEnd());
                        break;
                    case 9:
                        System.out.println("Enter the Position:");
                        System.out.println("Deleted Element: " + l1.deletePos(scanner.nextInt()));
                        break;
                    case 10:
                        System.out.println("Data:");
                        System.out.println("Data Found: " + l1.search(scanner.nextInt()));
                        break;
                    case 11:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
        }
    }
}
