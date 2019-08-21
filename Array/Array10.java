import java.util.*;
public class Array10
{

   public static void main(String args[])
    {
       int i;
	int j;
	int[][] arr = new int[2][2];
	int[][] transpose= new int[2][2];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<2;i++)
 	{
	    for(j=0;j<2;j++)
		{
		  arr[i][j]=sc.nextInt();
		}
	} 

        for(i=0;i<2;i++)
 	{
	    for(j=0;j<2;j++)
		{
		  transpose[i][j]=arr[1-i][1-j];
                  System.out.print(transpose[i][j]+"\t");
		}
		System.out.println();
	}
       
      
    }
}
