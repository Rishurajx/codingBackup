package oopsNew;
class ol1{
    void greet(){
        System.out.println("hello ");
    }
    void greet(String a){
        System.out.println("hello "+a);
    }
    ol1(){
        System.out.println("welcome constructor running....");
    }
}
public class overloading {
    public static void main(String[] args) {
        ol1 obj=new ol1();
        obj.greet();
        obj.greet("he he he");
    }
}