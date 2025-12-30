package Leetcode;
public class bottelYouDrink {
    public static int drink(int bottel,int price){
        if(bottel<2*price){
            return bottel;
        }
        int empty=bottel;
        int filled=bottel;
        int leftover;
        while(price<=empty){
            int newfilled = empty/price;
            filled+=newfilled;
            leftover=empty%price;
            empty= newfilled+leftover;
        }
        return filled;
    }
    public static void main(String[] args) {
        System.out.println(drink(100,9));
    }
}