// Node class for doubly linked list
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

// DoublyLinkedList class
public class DoublyLinkedList {
    Node head;
    Node tail;

    // Insert at the beginning
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at the end
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Delete a node with a given value
    public void deleteNode(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) current.prev.next = current.next;
                else head = current.next;

                if (current.next != null) current.next.prev = current.prev;
                else tail = current.prev;

                return;
            }
            current = current.next;
        }

        System.out.println("Node with value " + data + " not found.");
    }

    // Traverse forward
    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Traverse backward
    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            // Swap next and prev
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            // Move to next node (actually previous)
            current = current.prev;
        }

        // Swap head and tail
        if (temp != null) {
            head = temp.prev;
        }
    }


    // Sort the list using insertion sort
    public void sort() {
        if (head == null) return;

        Node current = head.next;

        while (current != null) {
            Node key = current;
            Node prevNode = current.prev;

            // Detach key node
            current = current.next;

            // Find insertion point
            while (prevNode != null && key.data < prevNode.data) {
                prevNode = prevNode.prev;
            }

            // Remove key
            if (key.prev != null) key.prev.next = key.next;
            if (key.next != null) key.next.prev = key.prev;
            if (key == tail) tail = key.prev;

            // Insert key
            if (prevNode == null) {
                key.next = head;
                head.prev = key;
                key.prev = null;
                head = key;
            } else {
                key.next = prevNode.next;
                if (prevNode.next != null) prevNode.next.prev = key;
                key.prev = prevNode;
                prevNode.next = key;
                if (key.next == null) tail = key;
            }
        }
    }


    // Main method for testing
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtTail(30);
        dll.insertAtTail(40);

        dll.displayForward();   // 20 10 30 40
        dll.displayBackward();  // 40 30 10 20

        dll.deleteNode(10);
        dll.displayForward();   // 20 30 40

        dll.deleteNode(50);     // Node not found
    }
}

