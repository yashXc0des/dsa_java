package linkedlist;


public class DoublyLinkedList {
 Node head;
 Node tail;
 DoublyLinkedList(){
    this.head=null;
    this.tail=null;
 }
 public void insertAtBeginning(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        tail=newNode;
        return;
    }
    head.previous=newNode;
    newNode.next=head;
    head=newNode;
 }
 public void insetAtEnd(int data){
    Node newNode = new Node(data);
    if(tail==null){
        head=newNode;
        tail = newNode;
        return;
    }
    tail.next=newNode;
    newNode.previous=tail;
    tail=newNode;
 }
 public  void insertInBetween(int data,int position){
   Node newNode = new Node(data);
   Node currNode= head;
   if(position==0){
    if(head==null){
        head=newNode;
        tail=newNode;
        return;
    }
    head.previous=newNode;
    newNode.next=head;
    head=newNode;
   }
   for(int i=0;i<position-1;i++){
        // If the position is out of bounds (greater than the length of the list)
        if (currNode == null) {
            System.out.println("Position out of bounds");
            return;
        }
    currNode=currNode.next;
   }
   if(currNode==tail){
    currNode.next=newNode;
    newNode.previous=currNode;
    tail=newNode;
   }else{                     //agr bech me dalna ho node
    Node nextNode=currNode.next;
    currNode.next=newNode;
    newNode.previous=currNode;
    newNode.next=nextNode;
    if(nextNode!=null){
        nextNode.previous=newNode;
    }

   }
 }
 public void deletionfromposition(int position){
    Node currNode=head;
    if(position==0){
        if(currNode==null){
            System.out.println("Empty array already");
            return;
        }
        if(currNode.next==null){
            head=null;
            tail=null;
            System.out.println("Now this List is Empty");
            return;
        }
        head=currNode.next;
        head.previous=null;
    }
    for(int i=0;i<position-1;i++){
        if(currNode==null || currNode.next==null){
            System.out.println("index out of bound");
            return;
        }
        currNode=currNode.next;
    }
    Node nextNode=currNode.next;
    currNode.next=nextNode.next;
    if(nextNode.next!=null){
        nextNode.next.previous=currNode;
    }
    else{
        tail=currNode;
    }
 }
 public void printList(){
    Node currNode=head;
    if(currNode==null){
        System.out.println("Empty List");
        return;
    }
    while(currNode!=null){
        System.out.print(currNode.data+"  ->  ");
        currNode=currNode.next;
    }
    System.out.print("null");
 }
 public static void main(String[] args) {
    DoublyLinkedList list = new DoublyLinkedList();
    list.printList();
    list.insertAtBeginning(15);
    list.insertAtBeginning(30);
    list.printList();
    list.insetAtEnd(20);
    System.out.println();
    list.printList();
    System.out.println();
    list.insertInBetween(17, 1);
    list.printList();
    list.deletionfromposition(1);
    System.out.println();
    list.printList();

 }
    
}