package oopsNew;
import java.util.Scanner;
import java.util.Random;
class game{
    int cGuess;
    int uGuess;
    int count=0;

    public  game(){
        Random random= new Random();
        this.cGuess=random.nextInt(100);
    }
    public int inputt(){
        Scanner sc= new Scanner(System.in);
        System.out.println("guess a number");
        int num=sc.nextInt();
        return num;
    }

    public void setnum(int num){
        this.uGuess=num;
    }

    public boolean check(){
        if(cGuess<uGuess){
            System.out.println("Too high. try little less");
        }
        else if(cGuess>uGuess){
            System.out.println("Too less. try little more");
        }
        else{
            return true;
        }
        return false;
    }
    public int count(){
        count+=1;
        return count;
    }
}
public class numberGuess {
    public static void main(String[] args) {
        game x=new game();
        x.setnum(x.inputt());
        while(!(x.check())){
            x.setnum(x.inputt());
            x.count();
        }
        int score=10-x.count();
        System.out.println("you win !!!");
        System.out.println("your score is : "+score+" out of 10");

    }
}
