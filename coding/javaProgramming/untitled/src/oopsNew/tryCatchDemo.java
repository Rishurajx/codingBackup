package oopsNew;

public class tryCatchDemo {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int c=a/b;
        }
        catch (ArithmeticException ri){
            System.out.println("ggg"+ri+"gggg");
        }
        finally {
            System.out.println("finally wala block");
        }
        System.out.println("main fun ke ander wala ");
    }
}
