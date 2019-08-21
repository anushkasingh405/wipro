public class CaseExchange
{
   public static void main(String args[] )
   {
     char x='S';
     int val= (char)x;
          if(x>='a' && x<='z')
     {
       x= (char)(val-32);
     }
    else
      {
        x=(char)(val+32);
      }
     System.out.println(x);
   } 

}
