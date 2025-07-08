package LinkedListt;

public class linkedlist {
    public static class node{
        int data;
        node next;
            node(int data){
                this.data=data;
        }
    }

    public static void main(String[] args) {
        node obj1=new node(1);
        node obj2=new node(2);
        obj1.next=obj2;

    }
    public static void display(node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void insertAtBegening(node head){

    }
}
