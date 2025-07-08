import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int rem,rev=0;
        while(num!=0){
            rem=num%10;
            num=num/10;
            rev=rev*10+rem;
        }
        System.out.println("reverse is "+rev);
    }
}
