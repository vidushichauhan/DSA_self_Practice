package LinkedList;

class Node{
    int num;
    Node next;
    Node(int x){
        num = x;
        next = null;
    }
}

public class BasicStructure {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        Node start = head;
        while(start.next!=null){
            System.out.println(start.num);
            start = start.next;
        }
    }
    
}
