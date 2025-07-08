package LinkedListt;

public class implimentation {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        node head;
        node tail;

        void display(){
            node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        void insertAtEnd(int data){
            node temp=new node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtBeg(int data){
            node temp=new node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }


        void insertAtPosition(int idx,int data){
            node t= new node(data);
            node temp=head;
            for(int i=0;i<idx;i++)
                temp=temp.next;
            t.next=temp.next;
            temp.next=t;
        }



        void deleteAtEnd(){
            node temp=head;
            if(head==null){
                System.out.println("under flow");
                return;
            }
            else{
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
            }
        }

        void deleteAtBegening(){
            if(head==null){
                System.out.println("underflow");
            }
            else{
                head=head.next;
            }
        }

        void deleteAt(int idx){
            node temp=head;
            if(head==null){
                System.out.println("underflow");
            }
            else{
                for(int i=0;i<idx;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
        }
        void reverse(){
            node temp=head;
            node prev=null;
            node curr=head;
            while(temp!=null){
                temp.next=prev;
                prev=temp;
                temp=temp.next;
                curr=temp.next;
            }
            head=temp;
            return ;
        }
    }
    public static void main(String[] args) {
        linkedList ll= new linkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.display();
        ll.reverse();
        ll.display();

    }
}