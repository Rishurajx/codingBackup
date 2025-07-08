package LinkedListt;

public class display {
    node head;
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public  static void display(node head) {
        node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        }
        while (temp != null);
    }


    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        display(a);
    }
}
