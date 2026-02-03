package basics;

import java.util.Scanner;
public class maximum2ndEz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[15];
        System.out.println("enter the values");
        for (int i = 0; i < 15; i++)
            arr[i] = sc.nextInt();
        int max2 = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<15;i++){
            if(arr[i] > max) {
                max2 = max;
                max = arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max)
                max2=arr[i];
        }
        System.out.println("2nd maximum is " + max2);
        System.out.println("maximum is " + max);
    }
}
