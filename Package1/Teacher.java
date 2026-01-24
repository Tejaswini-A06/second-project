package Package1;

public class Teacher extends Person{
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        Teacher obj= new Teacher();
        obj.setName("Teju");
        System.out.println(obj.getName());
    }
}