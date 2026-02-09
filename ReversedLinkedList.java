package com.manikanta.Collections;

public class ReversedLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = reversedLL(head);
        printList(head);

    }
    public static Node reversedLL(Node head){
        Node prev = null;
        Node curr = head;

        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
    public static void printList(Node head){
        Node Current = head;

        while(Current!=null){
            System.out.println(Current.data+" ");
            Current = Current.next;
        }
    }

}
