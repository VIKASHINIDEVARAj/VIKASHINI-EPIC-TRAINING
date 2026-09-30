package LinkedList;

import java.util.Scanner;
class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int data, DNode prev, DNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    DNode() {

    }
}

class DoublyLinkedL {

    DNode head = null;
    DNode tail = null;
    void insertTail(int val) {
        DNode newNode = new DNode(val, null, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    void insertHead(int val) {

        DNode newNode = new DNode(val, null, null);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    void insertMiddle(int pos, int val) {
        if (pos <= 1) {
            insertHead(val);
            return;
        }
        DNode newNode = new DNode(val, null, null);
        DNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp == tail) {
            insertTail(val);
            return;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;
    }
    void deleteHead() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        else {
            head.prev = null;
        }
    }
    void deleteMiddle(int pos) {
        if (pos <= 1) {
            deleteHead();
            return;
        }
        DNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid position");
            return;
        }
        DNode deleteNode = temp.next;
        temp.next = deleteNode.next;
        if (deleteNode.next != null) {
            deleteNode.next.prev = temp;
        }
        if (deleteNode == tail) {
            tail = temp;
        }
    }

    void deleteTail() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        DNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    void reverseDisplay() {
        if (tail == null) {
            System.out.println("List is Empty");
            return;
        }
        DNode temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
        System.out.println();
    }
    void reverse() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        DNode current = head;
        DNode temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedL li = new DoublyLinkedL();
        while (true) {
            System.out.println("1)Insert Data\n2)Insert Head\n3)Insert Tail\n4)Insert Middle\n5)Display\n6)Delete Head\n7)Delete Tail\n8)Delete Middle\n9)Reverse\n10)Reverse Display\n11)Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter no of data:");
                    int no = sc.nextInt();
                    System.out.println("Enter values:");
                    for (int i = 0; i < no; i++) {
                        li.insertTail(sc.nextInt());
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter the value:");
                    li.insertHead(sc.nextInt());
                    break;
                }
                case 3: {
                    System.out.println("Enter the value:");
                    li.insertTail(sc.nextInt());
                    break;
                }
                case 4: {
                    System.out.println("Enter the position:");
                    int post = sc.nextInt();
                    System.out.println("Enter the value:");
                    li.insertMiddle(post, sc.nextInt());
                    break;
                }
                case 5: {
                    System.out.println("Display Linked List:");
                    li.display();
                    break;
                }
                case 6: {
                    li.deleteHead();
                    break;
                }
                case 7: {
                    li.deleteTail();
                    break;
                }
                case 8: {
                    System.out.println("Enter the position:");
                    li.deleteMiddle(sc.nextInt());
                    break;
                }
                case 9: {
                    li.reverse();
                    li.display();
                    break;
                }
                case 10: {
                    System.out.println("Reverse Display:");
                    li.reverseDisplay();
                    break;
                }
                case 11: {
                    sc.close();
                    return;
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}

