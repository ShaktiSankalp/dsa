class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    private Node head = null;
    private Node tail = null;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // ✅ Insert at the beginning
    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Maintain circular link
        }
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) return;

        Node current = head;
        Node prev = null;

        do {
            if (current.data == data) {
                if (prev != null) {
                    prev.next = current.next;
                    if (current == tail) tail = prev;
                } else {
                    if (head == tail) {
                        head = tail = null;
                        return;
                    }
                    head = head.next;
                    tail.next = head;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular List: ");

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insert(20);
        cll.insert(30);
        cll.display();          // 20 30

        cll.insertAtHead(10);
        cll.display();          // 10 20 30

        cll.insertAtHead(5);
        cll.display();          // 5 10 20 30
    }
}
