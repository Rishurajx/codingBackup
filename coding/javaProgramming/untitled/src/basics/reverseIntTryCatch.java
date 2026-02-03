package basics;

class Solution {
    public int reverse(int x) {
        int rev=0;
        int rem=0;
        try{
            while(x!=0){
                rem=x%10;
                rev=rev*10+rem;
                x=x/10;
            }
            return rev;
        }
        catch(Exception e){
            return 0;
        }
    }
}
public class reverseIntTryCatch {
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.reverse(123));
    }
}
