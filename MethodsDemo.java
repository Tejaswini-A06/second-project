public class MethodsDemo {
//        int add(int a,int b)
//        {
//            int c=a+b;
//            return c;
//        }
//
//        public static void main(String[] args)
//        {
//            MethodsDemo obj=new MethodsDemo();
//            int result=obj.add(10,20);
//            System.out.println(result);
//        }

    int classLevelVariable=004;
    void method()
    {
        MethodsDemo obj2=new MethodsDemo();
        System.out.println(obj2.classLevelVariable);
    }
    public static void main(String[] args)
    {
        MethodsDemo obj=new MethodsDemo();
        obj.method();

        System.out.println(obj.classLevelVariable);
    }
    }

