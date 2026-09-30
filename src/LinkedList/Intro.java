package LinkedList;
class NodeI {
    int data;
    NodeI address;

    NodeI(int data, NodeI add) {
        this.data = data;
        this.address = add;
    }

    NodeI() {
    }
}

public class Intro {
    public static void main(String[] args) {
        NodeI obj1 = new NodeI(10, null);
        NodeI head = obj1;

        NodeI obj2 = new NodeI(20, null);
        obj1.address = obj2;

        NodeI obj3 = new NodeI(30, null);
        obj2.address = obj3;

        NodeI obj4 = new NodeI(40, null);
        obj3.address = obj4;

        NodeI temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.address;
        }
    }
}
