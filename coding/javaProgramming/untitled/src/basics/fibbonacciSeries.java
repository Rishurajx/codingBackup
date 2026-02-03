package basics;

public class fibbonacciSeries {
    public static void main(String[] args) {
        int fir=0;
        int sec=1;
        int sum;
        int n=10;
        while(n>=0){
            sum=fir+sec;
            System.out.println(sum);
            sec=fir;
            fir=sum;
            n--;
        }
    }
}
