package oopsNew;
class student{
    private int id;
    private String name;
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public void setid(int id){
        this.id=id;

    }
    public void setname(String name){
        this.name=name;
    }
}
public class setterGetter {
    public static void main(String[] args) {
        student rishu= new student();
        rishu.setid(33);
        rishu.setname("Rishu Raj");
        System.out.println(rishu.getid());
        System.out.println(rishu.getname());
    }
}