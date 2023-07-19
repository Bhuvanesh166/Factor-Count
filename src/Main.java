import java.util.*;

 class FactorSort {
     public static void factorCount(int array[],int size)
     {
         ArrayList<Integer> ar=new ArrayList<>();
         int fact_array[]=new int[size];
         for(int i=0;i<size;i++)
         {
             for(int j=1;j<=array[i];j++)
             {
                 if(array[i]%j==0)
                 {
                     fact_array[i]++;
                 }
             }
             ar.add(fact_array[i]);
         }
         for(int i=0;i<size;i++)
         {
             int min= Collections.min(ar);
             int pos=ar.indexOf(min);
             System.out.print(array[pos]+" ");
             ar.set(pos,Integer.MAX_VALUE);
         }
     }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size=scanner.nextInt();
        int array[]=new int[size];
        System.out.println("Enter Array Elements");
        for (int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        factorCount(array,size);
    }

}