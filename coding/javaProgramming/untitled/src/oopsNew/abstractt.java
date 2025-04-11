package oopsNew;
abstract class abc{
    abstract void greet();
    abstract int hehe();
    void huihui(){
        System.out.println("ha ha ha");
    }
}
class abcchild extends abc{
    void greet(){
        System.out.println("hello");
    }
    int hehe(){
        return 1;
    }
}
public class abstractt {
    public static void main(String[] args) {
        abcchild obj=new abcchild();
        obj.greet();
        obj.hehe();
        obj.huihui();
    }
}
