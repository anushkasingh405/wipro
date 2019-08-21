import java.util.*;

public class Array9
{
    public static void main(String args[])
       { int i;
         int value=0;
         int start=-1;
	 int end=-1;
          int[] arr= new int[10];
          System.out.println("PLease enter any 10 values");
	  Scanner sc= new Scanner(System.in);
          for(i=0;i<10;i++)
               {
		  arr[i]=sc.nextInt();
		}
          for(i=0;i<10;i++)
               {
		 if(6 == arr[i])  {start=i; }
		 if(7 == arr[i])  {end=i; }
		}
 	i=0;
          if(start<end)
		{
			while(i<start){value=value+arr[i]; i++;}
		i=end+1; 
			while(i<10){value=value+arr[i]; i++;}
		 }                      
          else
		{
			while(i<10){value=value+arr[i]; i++;}
		}
     System.out.println(value);
       }
}
