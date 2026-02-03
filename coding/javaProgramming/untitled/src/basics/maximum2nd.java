package basics;

import java.util.Scanner;
public class maximum2nd {
    public static double max(double[] aray) {
        double max2 = Double.NEGATIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (int i=0;i<15;i++){
            if(aray[i] > max) {
                max2 = max;
                max = aray[i];
            }
            else if(aray[i]>max2 && aray[i]<max)
                max2=aray[i];
        }
        return max2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[15];
        System.out.println("enter the values");
        for (int i = 0; i < 15; i++)
            arr[i] = sc.nextInt();
        System.out.println("2nd maximum is " + max(arr));
    }
}
