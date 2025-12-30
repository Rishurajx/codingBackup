package basics;

public class pyramid {
    public static void main(String[] args) {
        for(int i =10;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
        for(int k=1;k<=10-i;k++)
            System.out.print("*");
        for(int k=0;k<=10-i;k++)
            System.out.print("*");
        System.out.println();
        }
    }
}
