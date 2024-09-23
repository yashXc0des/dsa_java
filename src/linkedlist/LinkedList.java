package linkedlist;

import java.lang.classfile.components.ClassPrinter.ListNode;

import recurssion.recurssion1;

public class LinkedList {
    Node head;
    Node tail;
    int size;

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
            size++;
        } else {
            // For subsequent insertions, head is updated but tail remains unchanged
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void insertInBetween(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            size++;
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
        size++;
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
    public Node insertionAtGivenPointRecursion(int data, int index, Node currentNode) {
        // Base case: If the index is 0, create a new node
        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = currentNode; // Link new node to the current node
            return newNode; // Return the new node to update the link
        }
    
        // If current node is null, index is out of bounds
        if (currentNode == null) {
            System.out.println("Index out of bounds");
            return null; // Exit if we reach the end of the list without inserting
        }
    
        // Recursive call: Move to the next node
        currentNode.next = insertionAtGivenPointRecursion(data, index - 1, currentNode.next);
    
        // Return the current node (unchanged)
        return currentNode;
    }
     public Node insertusingRecurssion(int data, int index, Node currentNode){
        if(index==0){
            Node newNode= new Node(data);
            newNode.next=currentNode;
            head=newNode;
        }
        if(currentNode==null){
            System.out.println("list out of bound");
            return null;
        }
        currentNode=insertusingRecurssion(data, index-1, currentNode.next);
        return currentNode;
     }
    public void deleteDuplicates() {
        Node currNode= head;
        while(currNode!=null && currNode.next!=null){
            if(currNode.data==currNode.next.data){
                Node nextNode=currNode.next.next;
                currNode.next=nextNode;
            }
            currNode=currNode.next;
        }

    }
    public void deleteDuplicates2() {
        Node currNode = head;
    
        while (currNode != null && currNode.next != null) {
            if (currNode.data == currNode.next.data) {
                // Skip the duplicate node
                currNode.next = currNode.next.next;
            } else {
                // Move to the next node if no duplicate is found
                currNode = currNode.next;
            }
        }
    }
    public void mergetwoSortedLinkedList(LinkedList list1,LinkedList list2){
        LinkedList listresult=new LinkedList();
        Node head1 = list1.head;
        Node head2 = list2.head;
        while(head1!=null &&head2!=null){
            if(head1.data<=head2.data){
                listresult.insertAtEnd(head1.data);
                head1=head1.next;
            }
            else{
                listresult.insertAtEnd(head2.data);
                head2=head2.next;
            }
        } 
        while(head1!=null){
            listresult.insertAtEnd(head1.data);
            head1=head1.next;
        }
        while(head2!=null){
            listresult.insertAtEnd(head2.data);
            head2=head2.next;
        }
        listresult.printList();
    }
    


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1=new LinkedList();
        LinkedList list2= new LinkedList();
        list1.insertAtBeginning(4);
        list1.insertAtBeginning(2);
        list1.insertAtBeginning(1);
        list2.insertAtBeginning(4);
        list2.insertAtBeginning(3);
        list2.insertAtBeginning(1);
        list1.printList();
        list2.printList();
        list.mergetwoSortedLinkedList(list1, list2);
    }

}
