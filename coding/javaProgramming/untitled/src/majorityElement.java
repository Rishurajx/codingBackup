import java.util.Scanner;
public class majorityElement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int count;
        for(int i=0;i<n;i++) {
            System.out.println("enter element");
            arr[i] = sc.nextInt();
        }
        for(int i: arr){
            count=0;
            for(int j:arr){
                if(i==j){
                    count+=1;
                }
                if(count>=n/2){

                }
            }
        }

    }
}
