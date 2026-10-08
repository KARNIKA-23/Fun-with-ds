class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    void push(int data) {
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
    }

    void pop() {
        if (top == null) {
            System.out.println("underflow");
            return;
        }

        top = top.next;
    }

    void peek() {
        if (top == null) {
            System.out.println("underflow");
            return;
        }

        System.out.println(top.data);
    }

    void display() {
        if (top == null) {
            System.out.println("underflow");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;   
        }

        System.out.println();
    }
}

public class Stackwithlinkedlist {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(8);
        s.push(7);
        s.push(6);

        s.display();

        s.push(9);
        s.display();

        s.pop();
        s.pop();

        s.display();
    }
}