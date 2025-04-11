package oopsNew;
class father{
    int x;
    int y;
    public void met(){
        System.out.println("namaste duniya");
    }
    public father (){
        System.out.println("hari ommm");
    }
    public void met2(){
        System.out.println("kya haal chal puttar");
    }
}

class son extends father{
    int a;
    int b;
    public void met(){
        System.out.println("hello world");
    }
    public son(){
        System.out.println("excuse me please");
    }
}
public class inheritance {
    public static void main(String[] args) {
        son obj = new son();
        obj.met2();
    }
}
