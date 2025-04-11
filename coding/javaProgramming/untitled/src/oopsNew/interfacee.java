package oopsNew;

import org.w3c.dom.ls.LSOutput;

class iks{
    interface basics{
        void greet();
        void snacks();
        void water();
    }

}
class itf1 implements iks.basics {
      public void greet(){
          System.out.println("hello");
    }
    public void snacks() {
        System.out.println("snacks");
    }


    public void water() {
        System.out.println("water");
    }

}
public class interfacee {
    public static void main(String[] args) {
        itf1 obj=new itf1();
        obj.water();
        obj.greet();
        obj.snacks();
    }
}