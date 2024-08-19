package LinkedList;

import java.util.Scanner;
import java.util.*;

class Node{
    int num;
    Node next;
    Node(int x){
        num = x;
        next = null;
    }
}


// This is for inserting the data in begin of linked list

public class InsertAtBegin {
    public static Node insertAtBegining(int x, Node head){

        if(head==null){return new Node(x);}
        Node temp1 = new Node(x);
        temp1.next =head;
        head = temp1;
        return head;
    }
    
    public static void main(String args[]){
        Node head = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);
        head.next =temp1;
        temp1.next= temp2;

        System.out.println("what you want to add in begin: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node head1 = insertAtBegining(x,head);
        //display
        System.out.println("Current List:\n");
        Node curr = head1;
        while(curr!=null){
            System.out.println(curr.num+"\n");
            curr = curr.next;
        }

    }

}


