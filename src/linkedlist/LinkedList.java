package linkedlist;
public class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        // If the list is empty, both head and tail point to the new node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // For subsequent insertions, head is updated but tail remains unchanged
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertInBetween(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;
        for (int i = 1; i < position; i++) {
            if (currNode == null) {
                System.out.println("Index Out Of Bound");
                return;
            }
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public void printList() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "  ->  ");
            curNode = curNode.next;
        }
        System.out.print("null\n");
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;  // Add return here to avoid further execution
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void insertatEnd2(int data) {
        Node newNode = new Node(data);

        // If the list is empty, the new node becomes the head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;  // Add return here to avoid further execution
        }

        // Traverse the list to find the last node
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        // Once the last node is found, add the new node
        currNode.next = newNode;
    }
    public void detetionatposition(){

    }
    public void deletionAtBeginning(){
        if(head==null){
            System.out.println("empty list");
        }
        Node currNode=head;
        head=currNode.next;
        //if list become empty
        if (head == null) {
            tail = null;
        }

    }
    public void deleteFromEnd(){
        Node cuuNode=head;
        while(cuuNode.next.next!=null){
            cuuNode=cuuNode.next;
        }
        cuuNode.next=null;
        tail=cuuNode;
    }
    public void deleteFromSpecificPosition(int position){
        Node currNode = head;
        for(int i =1;i<position;i++){
            currNode=currNode.next;
        }
        currNode.next=currNode.next.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        list.insertAtBeginning(60);
        list.insertAtBeginning(70);
        list.insertInBetween(35, 4);
        // list.insertAtEnd(10);
        list.insertatEnd2(10);
        list.printList();
        list.deletionAtBeginning();
        list.deleteFromEnd();
        list.printList();
        list.deleteFromSpecificPosition(3);
        list.printList();
    }
}
