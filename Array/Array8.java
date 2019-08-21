import java.util.*;

public class Array8
{
    public static void main(String args[])
       { int i;
         int j;
         int flag=0;
         int flag1;
          int[][] arr= new int[2][10];
          System.out.println("PLease enter any 10 values");
	  Scanner sc= new Scanner(System.in);
          for(i=0;i<10;i++)
               {
		  arr[0][i]=sc.nextInt();
		}


          for(i=0;i<10;i++)
               {
 			for(j=i+1;j<10;j++)
			{
				if(arr[0][j]==arr[0][i]){arr[1][i]++; arr[1][j]++; }
 			}
		}



          for(i=1;i<10;i++)
               {
 			for(j=0;j<i;j++)
			{
				if(arr[1][j]<arr[1][i]){flag=arr[0][j]; arr[0][j]=arr[0][i]; arr[0][i]=flag;  flag1=arr[1][j]; arr[1][j]=arr[1][i]; arr[1][i]=flag1;}
                                if(arr[1][j]==arr[1][i]){if(arr[0][j]>arr[0][i]) {flag=arr[0][j]; arr[0][j]=arr[0][i]; arr[0][i]=flag; flag1=arr[1][j]; arr[1][j]=arr[1][i]; arr[1][i]=flag1;}}
 			}
		}
                  //for(i=0;i<5;i++)
               //{
                  System.out.println(arr[0][0]+"is the answer" );  
                  
		//}                    
       
       }
}
