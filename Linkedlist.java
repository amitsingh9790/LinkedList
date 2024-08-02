package LinkedList;
class Node{
    int data;
    Node next;
    public Node(){
    }
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist {
    public static Node head;
    Linkedlist(int data){
        head = new Node(data);
    }
    public static int SizeofLL(){
        Node Temp=head;
        int size = 0;
        while ((Temp!=null)){
            ++size;
            Temp=Temp.next;
        }
        return size;
    }
    public static void insertNode(int pos, int value){
        Node temp = head;
        int size = SizeofLL();
        if(pos<1 || pos>size)
            return;
        Node newNode = new Node(value);
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        for(int i = 0; i < pos-1; i++) {
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void insertAtLast(int value){
        Node temp = head;
        Node newNode = new Node(value);
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public static void deleteNode(int pos){
        Node temp = head;
        int size = SizeofLL();
        if(pos<1 || pos>size)
            return;
        if(pos==1){
            head=head.next;
            return;
        }
        for(int i = 0; i < pos-1; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public static void print(){
        Node temp = head;
        while (temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
    public static void ReverseList(){
        Node t1=null,t2=head.next;
        if(head.next == null)
            return;
        while (t2!=null){
                head.next=t1;
                t1=head;
                head=t2;
                t2=t2.next;
            }
            head.next=t1;
    }
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist(1);
        Linkedlist.insertAtLast(2);
        Linkedlist.insertAtLast(3);
        Linkedlist.insertAtLast(4);
        Linkedlist.print();
        Linkedlist.ReverseList();
        System.out.println();
        Linkedlist.print();


    }
}