import java.util.*;


public class MyLinkedList {

    public static void main(String args[]) {
       LinkedList<String> list = new LinkedList<String>();
       list.add("is");
       list.add("a");
       list.addLast("list");
       list.addFirst("this");
       list.add(3, "linked");
       System.out.println(list);


       System.out.println(list.get(0));
       System.out.println(list.size());   
       list.remove(3);
       list.removeFirst();
       list.removeLast();
      
       System.out.println(list);
    }


    


}


// //scratch implementation for linked list

// public class LinkedListDemo {

//     static class LL {
//         Node head;
//         private int size;

//         LL() {
//             size = 0;
//         }

//         // Node class
//         public class Node {
//             String data;
//             Node next;

//             Node(String data) {
//                 this.data = data;
//                 this.next = null;
//                 size++;
//             }
//         }

//         // Add to the beginning
//         public void addFirst(String data) {
//             Node newNode = new Node(data);
//             newNode.next = head;
//             head = newNode;
//         }

//         // Add to the end
//         public void addLast(String data) {
//             Node newNode = new Node(data);

//             if (head == null) {
//                 head = newNode;
//                 return;
//             }

//             Node lastNode = head;
//             while (lastNode.next != null) {
//                 lastNode = lastNode.next;
//             }

//             lastNode.next = newNode;
//         }

//         // Print the list
//         public void printList() {
//             Node currNode = head;

//             while (currNode != null) {
//                 System.out.print(currNode.data + " -> ");
//                 currNode = currNode.next;
//             }

//             System.out.println("null");
//         }

//         // Remove first node
//         public void removeFirst() {
//             if (head == null) {
//                 System.out.println("Empty List, nothing to delete");
//                 return;
//             }

//             head = this.head.next;
//             size--;
//         }

//         // Remove last node
//         public void removeLast() {
//             if (head == null) {
//                 System.out.println("Empty List, nothing to delete");
//                 return;
//             }

//             size--;
//             if (head.next == null) {
//                 head = null;
//                 return;
//             }

//             Node currNode = head;
//             Node lastNode = head.next;
//             while (lastNode.next != null) {
//                 currNode = currNode.next;
//                 lastNode = lastNode.next;
//             }

//             currNode.next = null;
//         }

//         // Get size of the list
//         public int getSize() {
//             return size;
//         }

//         // Insert at a specific index
//         public void addInMiddle(int index, String data) {
//             if (index > size || index < 0) {
//                 System.out.println("Invalid Index value");
//                 return;
//             }

//             Node newNode = new Node(data);

//             if (head == null || index == 0) {
//                 newNode.next = head;
//                 head = newNode;
//                 return;
//             }

//             Node currNode = head;
//             for (int i = 1; i < size; i++) {
//                 if (i == index) {
//                     Node nextNode = currNode.next;
//                     currNode.next = newNode;
//                     newNode.next = nextNode;
//                     break;
//                 }
//                 currNode = currNode.next;
//             }
//         }
//     }

//     // Main method to test everything
//     public static void main(String[] args) {
//         LL list = new LL();
//         list.addLast("is");
//         list.addLast("a");
//         list.addLast("list");
//         list.printList();         // is -> a -> list -> null

//         list.addFirst("this");
//         list.printList();         // this -> is -> a -> list -> null

//         System.out.println("Size: " + list.getSize()); // 4

//         list.removeFirst();
//         list.printList();         // is -> a -> list -> null

//         list.removeLast();
//         list.printList();         // is -> a -> null

//         list.addInMiddle(1, "new");
//         list.printList();         // is -> new -> a -> null
//     }
// }



    

