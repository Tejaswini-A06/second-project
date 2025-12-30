public class Parameters
{
//    static void changevalue(int x)
//    {
//        x=100;
//    }
//    public static void main(String[] args)
//    {
//        int a=10;
//        changevalue(10);
//        System.out.println(a);
//    }



//    static int add(int a,int b)
//    {
//        return a+b;
//    }
//    public static void main(String[] args)
//    {
//        int result1=add(10,5);
//        System.out.println(result1);
//
//        int result2=add(10,5);
//        System.out.println(result2);



    static int add(int a,int b)
    {
        return a + b;
    }
    static int add(int a,int b,int c)
    {
        return a + b + c;
    }
    static double add(double d1,double d2) {
        return d1 + d2;
    }

    public static void main(String[] args){
        int result1 = add(10,5);
        int result2 = add(10,5);
        double result3 = add(15.0, 10.0);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);




    }
}
