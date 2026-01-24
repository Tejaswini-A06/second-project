public class Student4
{
    private int marks;

  public int getMarks()
   {
       return marks;
   }
   public void setMarks(int marks)
   {
       this.marks=marks;
   }
   public static void main(String[] args)
   {
       Student4 obj=new Student4();
       obj.setMarks(95);

       System.out.println(obj.getMarks());
   }
}
