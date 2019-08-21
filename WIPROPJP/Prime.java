public class Prime
{
     public static void main(String args[])
       {int i=0;
         int flag=0;
         int num=Integer.parseInt(args[0]);

	for(i=2;i<=num/2;i++)
	{ 
  		if(num%i==0)
			{flag=1; System.out.println("Not Prime");  break;}
	
        }
        if(flag==0){
           System.out.println("Prime"); }

       }
}

