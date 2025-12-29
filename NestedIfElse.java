public class NestedIfElse {
    public static void main(String[] args){
        int age=30;
        int salary=25000;

        if(age>=21) {
            if (salary >= 20000) {
                System.out.println("Loan Approved");
            } else {
                System.out.println("Salary is less");
            }
        }
            else {
                System.out.println("Age is not eligible");
        }
    }
}