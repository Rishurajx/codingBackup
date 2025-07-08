package LinkedListt;

public class doubleLL {
    public static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data=data;
        }
    }
    public static class implimentation{
        node head;
        node tail;


        void insertAtEnd(int data){
            node temp= new node(data);
            if(head==null){
                head=temp;
            }
            else{
                temp.prev=tail;
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtBegening(int data){
            node temp= new node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                head.prev=temp;
                temp.next=head;
                head=temp;
            }
        }
        void insertAt(int idx,int data){
            node temp=new node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                for(int i=0;i<idx;i++){
                    temp=temp.next;
                }


            }
        }
    }
}