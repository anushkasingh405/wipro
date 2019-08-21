import java.util.*;

public class Array6
{
    public static void main(String args[])
       { int i;
         int j;
         int flag=0;
          int[] arr= new int[5];
          System.out.println("PLease enter any 5 values");
	  Scanner sc= new Scanner(System.in);
          for(i=0;i<5;i++)
               {
		  arr[i]=sc.nextInt();
		}


          for(i=1;i<5;i++)
               {
 			for(j=0;j<i;j++)
			{
				if(arr[j]>arr[i]){flag=arr[j]; arr[j]=arr[i]; arr[i]=flag;}
 			}
		}
                  for(i=0;i<5;i++)
               {
                  System.out.println(arr[i]);  
		}                    
       
       }
}
