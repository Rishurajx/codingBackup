package oopsNew;
class meraException extends Exception{
    @Override
    public String toString(){

        return "galat hai ";
    }
    @Override
    public String getMessage(){
        return "he he wrong ";
    }
}
public class customExceptionnn {
    public static void main(String[] args) {
        int x=1;
        try {
            if (x<10){
                throw new Exception();
            }
        }
        catch (Exception r){
            System.out.println(r);
            System.out.println(r.getMessage());
        }
    }
}
