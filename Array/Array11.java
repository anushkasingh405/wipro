import java.util.*;
public class Array11
{

   public static void main(String args[])
    {
       int i;
	int j;
	int max=-99999;
	int[][] arr = new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
 	{
	    for(j=0;j<3;j++)
		{
		  arr[i][j]=sc.nextInt();
		}
	} 

        for(i=0;i<3;i++)
 	{
	    for(j=0;j<3;j++)
		{
 			if(max< arr[i][j])  {max=arr[i][j];}
		}
		
	}
       System.out.print(max);
      
    }
}
