public class LoopsDemo {

    public static void main(String[] args){

//        for (int i=1;i<=100;i=i+1)
//        {
//            System.out.println(i);
//        }


//        for (int i=1;i<=100;i=i+1)
//        {
//            if(i%2==0)
//            System.out.println(i);
//        }

//          int sum=0;
//          for (int i=1;i<=10;i=i+1)
//          {
//              sum=sum+i;
//
//          }
//          System.out.println(sum);

//            int no=5;
//            for (int i=1;i<=10;i=i+1)
//            {
//                System.out.println(no+"x"+i+"="+(no*i));
//            }

              for(int no=1;no<=10;no=no+1)
              {
                  for(int i=1;i<=10;i=i+1)
                  {
                      System.out.println(no+"X"+i+"="+(no*i));
                  }
                  System.out.println();
              }
    }
}
