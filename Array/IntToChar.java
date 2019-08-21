import java.util.*;

public class IntToChar
{
    public static void main(String args[])
       { int i;
         char ch;
         String result="";
          int[] arr= new int[5];
          System.out.println("PLease enter any 5 values ");
	  Scanner sc= new Scanner(System.in);
          for(i=0;i<5;i++)
               {
		  arr[i]=sc.nextInt();
                  ch = (char) (arr[i]);
                 result= result + ch;
		}

          System.out.println( result);

       }
}
