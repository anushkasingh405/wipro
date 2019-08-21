import java.util.*;

public class Array7
{
    public static void main(String args[])
       { int i;
         int j;
	 int start;
         int flag=0;
          int[] arr= new int[6];
	  arr[5]=-10000;
          System.out.println("PLease enter any 5 values");
	  Scanner sc= new Scanner(System.in);
          for(i=0;i<5;i++)
               {
		  arr[i]=sc.nextInt();
		}


          for(i=0;i<5;i++)
               {
 			for(j=i+1;j<5-flag;j++)
			{
				if(arr[j]==arr[i]){flag=flag+1;	 delete(j,arr); //System.out.println("flag is" + flag +"for"+i +j); 
						  }
                                
 			}

		}
                  for(i=0;i<5-flag;i++)
               {		System.out.println("resulting values");
                  System.out.println(arr[i]);  
		}                    
       
       }



    public static void delete( int start,  int[] arr)
     {		 int k;

	for(k=start;k<5;k++){     arr[k]=arr[k+1];      }
	
	}
}



