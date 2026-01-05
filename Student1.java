public class Student1 {
    String name;
    int age;
    Student1(String n, int a){
        name = n;
        age = a;
    }
    public static void main(String[] args){
        Student1 obj = new Student1("Tejaswini", 20);
        System.out.println(obj.name+ "\n"+obj.age);
    }
}