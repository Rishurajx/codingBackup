package oopsNew;
class or1{
    void greet(){
        System.out.println("parent class method running......");
    }
    void oho(){
        System.out.println("hehehe");
    }
}
class or2 extends or1{
     void greet(){
        System.out.println("child class method running......");
    }
    void swagat(){
        System.out.println("kyse ho aap");
    }
}
public class overRidding {
    public static void main(String[] args) {
        or2 obj=new or2();

        obj.greet();
        obj.swagat();
        obj.oho();
    }
}
