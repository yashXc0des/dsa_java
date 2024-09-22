package linkedlist;

class Node {
    int data;
    Node next;
    Node previous;  // Ensure the 'previous' field is present

    Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;  // Initialize 'previous' to null
    }
}
