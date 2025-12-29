public class StringMethods {
    public static void main(String[] args)
    {
//        String s="Computer Science Engineer";
//
//        s=s.concat( " Delta ");
//
//        System.out.println(s);

//        String s="CSE DELTA";
//
//        System.out.println(s.substring(4));

//        String s="Computer Science And Engineering DELTA";
//
//        System.out.println(s.substring(0,16));


//        String s1=new String("JAVA");
//
//        String s2=new String("JAVA");
//
//        System.out.println(s1==s2);
//
//        System.out.println(s1.equals(s2));

//        String s1=new String("JAVA");
//
//        String s2=new String("JAVA");
//
//        System.out.println(s1.equalsIgnoreCase(s2));

//        String s1="Java";
//
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.toLowerCase());

//        String s = " Hello world ";
//        System.out.println(s.trim());

//        String s="Automation Testing";
//
//        System.out.println(s.contains("Testing"));

//        String s="Computer Science And Engineering";
//
//        System.out.println(s.contains("Engineering"));

//        String s="Java Programming";
//
//        System.out.println(s.startsWith("Java"));
//        System.out.println(s.endsWith("ing"));

        String  s="Java,Python,C++";
        String[] arr=s.split(",");

        for(String lang:arr) {
            System.out.println(lang);
        }
    }
}
