package LinkedList;
import java.util.Scanner;
class NodeDCL {
    int data;
    NodeDCL next;
    NodeDCL prev;

    NodeDCL(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    NodeDCL(){

    }
}

class DoublyCircularLinkedL {
    NodeDCL head = null;
    NodeDCL tail = null;
    void insertTail(int val) {
        NodeDCL newNode = new NodeDCL(val);
        if (head == null) {
            head = tail = newNode;

            newNode.next = head;
            newNode.prev = tail;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }
    void insertHead(int val) {
        NodeDCL newNode = new NodeDCL(val);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            newNode.prev = tail;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }
    void insertMiddle(int pos, int val) {

        if (pos <= 1) {
            insertHead(val);
            return;
        }
        NodeDCL temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        NodeDCL newNode = new NodeDCL(val);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        if (temp == tail) {
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        }
    }

    void insertDataByPosition(Scanner in) {
        System.out.println("Enter the value:");
        int val = in.nextInt();

        System.out.println("Enter the position:");
        int pos = in.nextInt();

        if (pos <= 1) {
            insertHead(val);
        } else {
            insertMiddle(pos, val);
        }
    }

    void deleteHead() {
        if (head == null)
            return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = tail;
        tail.next = head;
    }
    void deleteTail() {
        if (head == null)
            return;

        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
    }
    void deleteMiddle(int pos) {
        if (head == null)
            return;
        if (pos <= 1) {
            deleteHead();
            return;
        }
        NodeDCL temp = head;
        for (int i = 1; i < pos && temp.next != head; i++) {
            temp = temp.next;
        }
        if (temp == head)
            return;
        if (temp == tail) {
            deleteTail();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        NodeDCL temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    void displayReverse() {
        if (tail == null) {
            System.out.println("List is empty!");
            return;
        }
        NodeDCL temp = tail;
        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != tail);

        System.out.println();
    }
}

public class DoublyCircularLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyCircularLinkedL li = new DoublyCircularLinkedL();
        while (true) {
            System.out.println("\n1)Insert Bulk\n2)Insert Head\n3)Insert Tail\n4)Insert Middle\n5)Display\n6)Display Reverse\n7)Delete Head\n8)Delete Tail\n9)Delete Middle\n10)Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter no of data:");
                    int no = sc.nextInt();
                    System.out.println("Enter values:");
                    for (int i = 0; i < no; i++) {
                        li.insertTail(sc.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("Enter value:");
                    li.insertHead(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter value:");
                    li.insertTail(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Enter position:");
                    int pos = sc.nextInt();
                    System.out.println("Enter value:");
                    li.insertMiddle(pos, sc.nextInt());
                    break;
                case 5:
                    li.display();
                    break;
                case 6:
                    li.displayReverse();
                    break;
                case 7:
                    li.deleteHead();
                    break;
                case 8:
                    li.deleteTail();
                    break;
                case 9:
                    System.out.println("Enter position:");
                    li.deleteMiddle(sc.nextInt());
                    break;
                case 10:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

