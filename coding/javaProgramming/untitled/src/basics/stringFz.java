package basics;

import java.util.Scanner;
public class stringFz {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter sentence");
        String str= sc.nextLine();
        System.out.println("enter word");
        String s= sc.nextLine();
        String []arr=str.split(" ");
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(s)){
                c+=1;
            }
        }
        System.out.println(s+" occurs "+c+" times");
    }
}
