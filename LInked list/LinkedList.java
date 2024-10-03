public class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Insert a node at the end of the list
    public void insertEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            Node cp = head;
            while (cp.link != null) {
                cp = cp.link;
            }
            cp.link = n;
        }
    }

    // Insert a node at the beginning of the list
    public void insertBeg(int data) {
        Node n = new Node(data);
        n.link = head;
        head = n;
    }

    // Get the position of a node with given data
    public int getPosition(int data) {
        Node cp = head;
        int pos = 0;
        while (cp != null) {
            if (cp.data == data) {
                return pos;
            }
            cp = cp.link;
            pos++;
        }
        return -1; // Not found
    }

    // Display the linked list
    public void display() {
        Node cp = head;
        System.out.print("Head->");
        while (cp != null) {
            System.out.print("|" + cp.data + "|->");
            cp = cp.link;
        }
        System.out.println("null");
    }

    // Insert a node at a specific position
    public void insertPos(int pos, int data) {
        if (pos == 0) {
            insertBeg(data);
            return;
        }

        Node n = new Node(data);
        Node cp = head;
        Node pp = null;
        int posIndex = 0;

        while (cp != null && posIndex < pos) {
            pp = cp;
            cp = cp.link;
            posIndex++;
        }

        if (posIndex == pos) {
            pp.link = n;
            n.link = cp;
        } else {
            System.out.println("Pos not found");
        }
    }

    // Insert a node before a specified node
    public void insertBefore(int bNodeData, int data) {
        Node cp = head;
        Node pp = null;
        Node n = new Node(data);

        while (cp != null && cp.data != bNodeData) {
            pp = cp;
            cp = cp.link;
        }

        if (cp != null) {
            if (pp == null) { // Insert before head
                insertBeg(data);
            } else {
                pp.link = n;
                n.link = cp;
            }
        } else {
            System.out.println("Node Not found");
        }
    }

    // Insert a node after a specified node
    public void insertAfter(int aNodeData, int data) {
        Node cp = head;
        Node n = new Node(data);

        while (cp != null && cp.data != aNodeData) {
            cp = cp.link;
        }

        if (cp != null) {
            n.link = cp.link;
            cp.link = n;
        } else {
            System.out.println("Node not Found:");
        }
    }

    // Delete the first node
    public int deleteBeg() {
        if (head == null) {
            System.out.println("Empty linked list");
            return -1;
        }
        Node cp = head;
        head = cp.link;
        return cp.data;
    }

    // Delete the last node
    public int deleteEnd() {
        if (head == null) {
            System.out.println("Empty linked list");
            return -1;
        }

        Node cp = head;
        Node pp = null;

        if (cp.link == null) { // Only one node
            head = null;
            return cp.data;
        }

        while (cp.link != null) {
            pp = cp;
            cp = cp.link;
        }
        pp.link = null; // Remove last node
        return cp.data;
    }

    // Delete a node at a specific position
    public int deletePos(int pos) {
        if (head == null) {
            System.out.println("Empty linked list");
            return -1;
        }

        if (pos == 0) {
            return deleteBeg();
        }

        Node cp = head;
        Node pp = null;
        int dpos = 0;

        while (cp != null && dpos < pos) {
            pp = cp;
            cp = cp.link;
            dpos++;
        }

        if (cp != null) {
            pp.link = cp.link;
            return cp.data;
        } else {
            System.out.println("Invalid Position");
            return -1;
        }
    }

    // Search for a node with the specified data
    public boolean search(int data) {
        Node cp = head;
        while (cp != null) {
            if (cp.data == data) {
                return true;
            }
            cp = cp.link;
        }
        return false;
    }
}

