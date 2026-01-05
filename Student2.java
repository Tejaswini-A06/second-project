public class Student2 {
    //instance variables
    String name;
    int rollno;
    /*n  and a are local variables created
    inside constructor
     */
    Student2(String n, int a){
        name =n;
        rollno = a;
    }
    void display(){
        //local variables are craeted inside the method
        int marks = 99;
        System.out.println(name+" "+marks+" "+rollno);
    }
    public static void main(String[] args){
        Student2 obj = new Student2("Tejaswini", 362);
        obj.display();
    }
}