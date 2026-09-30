package STACK;

import java.util.Scanner;

class Stack {
    int n = 10;
    int[] stack = new int[n];
    int top = -1;

    // push
    public void push(Scanner in) {
        System.out.println("Enter a value: ");
        int val = in.nextInt();

        if (top == n - 1) {
            System.out.println("Stack Overflow");
        }
        else {
            top++;
            stack[top] = val;
        }
    }

    // pop
    public void pop(Scanner in) {
        if (top == -1) {
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println("Deleted value: " + stack[top]);
            top--;
        }
    }

    // display
    public void display() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        }
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public void peek(){
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Top value: " + stack[top]);
        }
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Stack is not Empty");
        }
    }
}

public class StackImplementation  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack obj=new Stack();
        while (true) {
            System.out.println("1)push \n2)pop \n3) display \n4)peek \n5)isEmpty");
            int n = in.nextInt();
            switch (n) {
                case 1: {
                    obj.push(in);
                    break;
                }
                case 2: {
                    obj.pop(in);
                    break;
                }
                case 3: {
                    obj.display();
                    break;
                }
                case 4: {
                    obj.peek();
                    break;
                }
                case 5: {
                    obj.isEmpty();
                    break;
                }
            }
        }
    }
}