public class recursion {
    public static int add(int num){
        if(num==1){
            return 1;
        }
        else {
            return num + add(num - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(add(10));
    }
}
