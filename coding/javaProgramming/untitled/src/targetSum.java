import java.util.Scanner;
public class targetSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter target value");
        int t= sc.nextInt();
        int []arr={1,2,3,4,5,6,7,8,9};
        for(int n:arr){
            for(int m:arr){
                if(n+m==t){
                    System.out.println("the pairs for target value is ("+n+","+m);
                }
            }
        }
    }
}
