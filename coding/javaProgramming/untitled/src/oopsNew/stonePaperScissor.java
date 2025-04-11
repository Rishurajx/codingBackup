package oopsNew;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
class sps{
    Scanner sc=new Scanner(System.in);
    Random ran=new Random();
    int key;
    int comp;
    sps(){
        comp= ran.nextInt(1,4);
    }
    void getterSetter(){
        System.out.println();
        System.out.println("          Enter 1, 2 or 3         ");
        System.out.println();
        System.out.println("STONE:1      PAPER:2      SCISSOR:3");
        key=sc.nextInt();
        while (key < 1 || key > 3) {
            System.out.println("Invalid input! Please enter 1, 2, or 3.");
            key = sc.nextInt();
        }
    }
    boolean check(){
        if((comp==1 && key==2)||(comp==2&&key==3)||(comp==3&&key==1)){
            System.out.println("YAYY YOU WIN!!!!!!!");
            return true;
        }
        else if(comp==key){
            System.out.println("Xo Match Draw!!!");
            System.out.println();
            System.out.println();
            System.out.println("Try again buddy.........");
            System.out.println("-----------------------------------------------");
            return false;
        }
        else{
            System.out.println("You loose, u looser");
            System.out.println();
            System.out.println();
            System.out.println("Try again buddy.........");
            System.out.println("-----------------------------------------------");
            return false;
        }
    }
    void display(){
        String arr[]={"STONE","PAPER","SCISSOR"};
        System.out.println("      "+arr[key-1]+"    VS     "+arr[comp-1]);
        System.out.println();
        System.out.println();
        System.out.println("I was choosen ("+arr[comp-1]+") and you choosed ("+arr[key-1]+")");
    }
}
public class stonePaperScissor {
    public static void main(String[] args) {
        sps obj = new sps();
        boolean condition=false;
        while(!condition) {
            obj.getterSetter();
            obj.display();
            condition=obj.check();
        }
    }
}