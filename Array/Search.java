import java.util.*;

public class Search
{
    public static void main(String args[])
       { int i;
         int value;
         int flag=0;
          int[] arr= new int[5];
          System.out.println("PLease enter any 5 values");
	  Scanner sc= new Scanner(System.in);
          for(i=0;i<5;i++)
               {
		  arr[i]=sc.nextInt();
		}
	   System.out.println("Please enter the value to be found");
	   value=sc.nextInt();
          for(i=0;i<5;i++)
               {
		 if(value == arr[i])  {flag=1; System.out.println(i+1); break; }
		}
          if(flag==0){ System.out.println("-1");}                      
       
       }
}
