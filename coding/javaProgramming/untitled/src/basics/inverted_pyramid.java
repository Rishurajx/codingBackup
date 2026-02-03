package basics;

public class inverted_pyramid {
    public static void main(String[] args) {
        for(int i = 0;i<=10;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=10-i;k++){
                System.out.print(k);
            }
            for(int l=0;l<=10-i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
