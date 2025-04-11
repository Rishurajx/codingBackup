package oopsNew;
class n3{
    int roll;
    String name;
    boolean pass;
    double marks;
    public String review(){
        String rev="good student";
        return rev;
    }
}
public class oopsFirst {
    public static void main(String[] args) {
        n3 rishu=new n3();
        n3 aman=new n3();
        rishu.name="RISHU";
        rishu.roll=33;
        rishu.marks=99.34;
        rishu.pass=true;
        aman.roll=2;
        aman.name="AMAN";
        aman.marks=0.01;
        aman.pass=false;
        System.out.println(rishu.marks+ aman.marks);
        System.out.println(rishu.review());
    }
}
