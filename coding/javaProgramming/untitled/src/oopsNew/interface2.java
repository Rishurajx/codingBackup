package oopsNew;
interface itf2{
    void greet();
    void sayHello();
    void fuk();
}
abstract class itfdemo implements itf2{
    public void greet(){
        System.out.println("hello morning");
    }
    abstract public void sayHello();
    public void fuk() {
        System.out.println("fk u");
    }

}
class ifk3 extends itfdemo{
    public void sayHello(){
        System.out.println("hello");
    }
}
public class interface2 {
    public static void main(String[] args) {
        ifk3 obj=new ifk3();
        obj.sayHello();
        obj.fuk();
        obj.greet();
    }
}