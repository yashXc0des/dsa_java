package linkedlist;
public class DoublyLinkedList {
    Node head;
    Node tail;
    DoublyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void insertionatbeginning(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
        }

    }
    public void insertionatEnd(int data){
        Node newNode = new Node(data);
        Node curNode= head;
        if (head == null) {  // If the list is empty
            head = newNode;
            tail = newNode;   // The new node is both the head and tail
        }else{
        while(curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
        newNode.previous=curNode;
        tail=newNode;
    }
    }
    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"  ->  ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertionatbeginning(20);
        list.insertionatbeginning(30);
        list.insertionatbeginning(40);
        list.insertionatbeginning(50);
        list.insertionatbeginning(60);
        list.insertionatbeginning(70);
        list.insertionatEnd(10);
        list.printList();
    }
}
