import java.util.*;

public class Array5
{
    public static void main(String args[])
       { int i;
         int max=-99999;
         int max2=0;
         int min2=0;
         int min=99999;
          int[] arr= new int[5];
          System.out.println("PLease enter any 5 values");
	  Scanner sc= new Scanner(System.in);
          for(i=0;i<5;i++)
               {
		  arr[i]=sc.nextInt();
                  if(max< arr[i])  {max2=max; max=arr[i]; }
                  if(min> arr[i])  { min2=min; min=arr[i]; }
		}
	 
          System.out.println("MAX is " + max + " Second max is " + max2);
          System.out.println("MIN is " + min +" Second min is " + min2 );
       }
}
