public class 	Palindrome{
     public static void main(String args[])
       {String sum="";
         int n;
         int num=Integer.parseInt(args[0]);

         while(num!=0)
          { n=(num%10);
            sum=sum + n;
            num=num/10;
           }
       System.out.println(args[0] + "  "+sum);
      if(sum.equals( args[0])){System.out.println("Palindrome");}

      else{System.out.println("Not an Palindrome");}
       }
}
