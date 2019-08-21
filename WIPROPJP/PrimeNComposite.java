public class PrimeNComposite
{
     public static void main(String args[])
       {int i=0;
         int flag=0;
         
         if(args.length<1){System.out.println("Please enter an integer number");}
         else
         {int num=Integer.parseInt(args[0]);
           if(num==0 || num==1){System.out.println(num + " is neither prime nor composite");}
	   else
           {
               for(i=2;i<=num/2;i++)
	      { 
  		  if(num%i==0)
		  	{flag=1; System.out.println(num + " is not a prime number");   break;}
              }
              if(flag==0){
                   System.out.println(num +  "is Prime"); }

          }
         }
	}
}

