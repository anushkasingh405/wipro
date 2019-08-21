public class AllPrimes
{
     public static void main(String args[])
     {int i=0;
      int flag=0;
         int num;
       for(num=10;num<=99;num++)
       { flag=0;
	    for(i=2;i<=num/2;i++)
	      { 
  		if(num%i==0)
			{flag=1;  break;} 
              }
        if(flag==0){ System.out.println(num);
           }

       }
      }
}

