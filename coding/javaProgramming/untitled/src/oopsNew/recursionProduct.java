package oopsNew;
public class recursionProduct {
    public static int prod(int a,int b){
        if(b==0){
            return 0;
        }
        return a+prod(a,(b-1));
    }
    public static void main(String[] args) {
        System.out.println(prod(2,5));
    }
}
