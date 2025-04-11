import java.util.Scanner;
import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num= sc.nextInt();
        int r= random.nextInt(2);
        if(r==num){
            System.out.println("same");
        }
        else{
            System.out.println("different");
        }
    }
}
