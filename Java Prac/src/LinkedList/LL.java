package LinkedList;

 class Node {

     int data;
     Node next;

     Node(int data){
         this.data=data;
         this.next=null;
     }
}

class LinkedList{
     Node head;

    public void addToFront(int data){
        Node newNode = new Node(data); // creating the object Node
        newNode.next=head;             //  Sets the next reference of the new node to the current head of the list.
        head=newNode;                  // Updates the head of the list to be the new node.
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data  +"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToFront(10);
        list.addToFront(20);
        list.addToFront(30);

        list.printList();
    }


}