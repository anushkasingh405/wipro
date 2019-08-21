public class SumOfDigits{
     public static void main(String args[])
       {int sum=0;
         int n=0;
         int num=Integer.parseInt(args[0]);
       
         for(;num!=0;)
          { n=num%10;
            sum=sum+n;
            num=num/10;
           }
 System.out.println(sum);
       }
}
