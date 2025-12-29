public class ArrayDemo {
    public static void main(String[] args) {
//        int[] numbers={10,20,30,40,50};
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//
//          System.out.println(numbers.length);

//        int[] numbers={10,20,30,40,50};
//        for(int i=0;i<numbers.length;i++)
//        {
//            System.out.println(numbers[i]);
//        }


//        int[] numbers = {10, 20, 30, 40, 50};
//
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//                sum = sum + numbers[i];
//            }
//            System.out.println(sum);
//
//        double average=(double)sum/numbers.length;
//        System.out.println("Average:"+average);


//        int[] numbers={20,10,50,40,30};
//
//        int max=numbers[0];
//        for(int i=1;i<numbers.length;i++)
//        {
//            if(numbers[i]>max)
//            {
//                miax=numbers[i];
//            }
//        }
//        System.out.println(max);
//


//        int[] numbers={20,10,50,40,30};
//
//        int min=numbers[0];
//        for(int i=1;i<numbers.length;i++)
//        {
//            if(numbers[i]<min)
//            {
//                min=numbers[i];
//            }
//        }
//        System.out.println(min);

//        int[][] matrix=
//                {
//                        {1,2,3},
//                        {4,5,6}
//                };
//
//        System.out.println(matrix[0][0]);

        int[][] matrix={
                        {1,2,3},
                        {4,5,6}
                };

        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j< matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}