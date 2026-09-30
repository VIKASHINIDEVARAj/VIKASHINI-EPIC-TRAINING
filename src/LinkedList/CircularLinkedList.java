package LinkedList;
import java.util.Scanner;

class NodeC {
    int data;
    NodeC next;

    NodeC(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLL {
    NodeC head = null;
    NodeC tail = null;

    void insertTail(int val) {
        NodeC newNode = new NodeC(val);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void insertHead(int val) {
        NodeC newNode = new NodeC(val);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    void insertMiddle(int pos, int val) {
        if (pos <= 1) {
            insertHead(val);
            return;
        }
        NodeC temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        NodeC newNode = new NodeC(val);
        newNode.next = temp.next;
        temp.next = newNode;
        if (temp == tail) {
            tail = newNode;
            tail.next = head;
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
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        tail.next = head;
    }

    void deleteTail() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        NodeC temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
    }

    void deleteMiddle(int pos) {
        if (pos <= 1) {
            deleteHead();
            return;
        }
        NodeC temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        if (temp.next == head) return;
        temp.next = temp.next.next;
        if (temp.next == head) {
            tail = temp;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        NodeC temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLL li = new CircularLL();

        while (true) {
            System.out.println("\n1)Insert Bulk\n2)Insert Head\n3)Insert Tail\n4)Insert Middle\n5)Display\n6)Delete Head\n7)Delete Tail\n8)Delete Middle\n9)Exit");
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
                    li.deleteHead();
                    break;

                case 7:
                    li.deleteTail();
                    break;

                case 8:
                    System.out.println("Enter position:");
                    li.deleteMiddle(sc.nextInt());
                    break;

                case 9:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

