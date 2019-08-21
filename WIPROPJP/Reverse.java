public class Reverse{
     public static void main(String args[])
       {String sum="";
         int n;
         int num=Integer.parseInt(args[0]);
       
         while(num!=0)
          { n=(num%10);
            sum=sum + n;
            num=num/10;
           }
 System.out.println(sum);
       }
}
