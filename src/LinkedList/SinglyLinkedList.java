package LinkedList;

import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(){

    }
}
class LinkedL{
    Node head=null;
    Node tail=null;

    void insertTail(int val){
        Node newNode = new Node(val,null);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }

    }
    void insertHead(int val){
        Node newNode = new Node(val,null);
        if(head == null){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }

    void insertMiddle(int pos,int val){

        if(pos<=1){
            insertHead(val);
            return;
        }
        Node newNode = new Node(val,null);
        Node temp=head;

        for (int i = 1; i < pos-1 && temp!=null ; i++) {//pos 3-->3-1-->2
            temp=temp.next;
        }
        if(temp==null||temp==tail){//pos more then the list size
            insertTail(val);
            return;
        }
        newNode.next=temp.next;//left side
        temp.next=newNode;//right side

    }

    void deleteHead(){
        if (head == null) {
            System.out.println("Empty list");
        }
        head=head.next;
        if (head == null) {
            tail=null;
        }
    }

    void deleteMiddle(int pos){
        if (pos <= 1){
            deleteHead();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos-1 && temp !=null && temp.next!=null; i++) {
            temp=temp.next;
        }
        if(temp==null||temp.next==null){
            System.out.println("invalid position");
            return;
        }
        temp.next=temp.next.next;//data 10 ---> 30  deleting 20 in middle

    }
    void deleteTail() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {//if one car is existing
            head=tail=null;
            return;
        }
        Node temp=head;
        while (temp.next.next!=null){ //second from last is not null so stop
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }

    void display(){
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    void reverse(){
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node prev=null;
        Node current = head;
        Node newnode=null;
        tail=head;
        while (current!=null){
            newnode=current.next;
            current.next=prev;//reverse
            prev=current;
            current=newnode;

        }
        head=prev;
        return;
    }

}

public class SinglyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedL li = new LinkedL();
        while (true) {
            System.out.println("1)Insert Data\n2)Insert Head\n3)Insert Tail\n4)Insert Middle\n5)Display\n6)Delete Head\n7)Delete Tail\n8)Delete middle\n9)Reverse");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("enter no of data:");
                    int no = sc.nextInt();
                    System.out.println("enter values:");
                    for (int i = 0; i < no; i++) {
                        li.insertTail(sc.nextInt());
                    }
                    break;
                }
                case 2: {
                    System.out.println("enter the value:");
                    li.insertHead(sc.nextInt());
                    break;
                }
                case 3: {
                    System.out.println("enter the value:");
                    li.insertTail(sc.nextInt());
                    break;
                }
                case 4: {
                    System.out.println("enter the position:");
                    int post = sc.nextInt();
                    System.out.println("enter the value:");
                    li.insertMiddle(post, sc.nextInt());
                    break;
                }
                case 5: {
                    System.out.println("display linkedlist");
                    li.display();
                    break;
                }
                case 6:{
                    li.deleteHead();
                    break;
                }
                case 7:{
                    li.deleteTail();
                    break;
                }
                case 8:{
                    System.out.println("enter te position:");
                    li.deleteMiddle(sc.nextInt());
                    break;
                }
                case 9: {
                    li.reverse();
                    li.display();
                    break;
                }
                case 10:{
                    sc.close();
                    return;
                }
                default: {
                    System.out.println("invalid choice");
                }

            }
        }

    }

}