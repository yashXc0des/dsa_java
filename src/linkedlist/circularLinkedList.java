package linkedlist;

public class circularLinkedList {
    Node head;
    Node tail;

    circularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insert at the beginning
    public void insertionAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) { // empty linked list
            head = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        } else {
            newNode.next = head; // newNode points to current head
            head = newNode; // head becomes newNode
            tail.next = head; // tail still points to new head (circular link)
        }
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { // Empty list
            head = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        } else {
            tail.next = newNode; // old tail points to new node
            tail = newNode; // new node becomes tail
            tail.next = head; // Circular link from tail to head
        }
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node currNode = head;
        while (true) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
            if (currNode == head) {  // Stop when we reach the head again
                break;
            }
        }
        System.out.println("(back to head)");
    }
    public void delete(){
        
    }


    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        list.printList();  // Expecting "Empty List"
        System.out.println();
        list.insertionAtBeginning(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.printList();  // Output: 20 -> 30 -> 40 -> 50 -> 60 -> (back to head)
    }
}

// Node class definition
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
