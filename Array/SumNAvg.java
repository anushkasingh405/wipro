import java.util.*;

public class SumNAvg
{
    public static void main(String args[])
       { int i;
         int sum=0;
         int avg=0;
          int[] arr= new int[5];
          System.out.println("PLease enter any 5 values");
	  Scanner sc= new Scanner(System.in);
          for(i=0;i<5;i++)
               {
		  arr[i]=sc.nextInt();
                  sum=sum+arr[i];
                 
		}
	  avg=sum/5;
          System.out.println("SUM is " + sum);
          System.out.println("Average is " + avg);
       }
}
