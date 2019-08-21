public class  Pattern
{
   public static void main(String args[])
    {
       int i=0;
         int j=0;
         int num=Integer.parseInt(args[0]);
        for(i=0;i<num;i++)
         {
           for(j=0;j<i+1;j++)
              {  System.out.print("*");   }
         System.out.println("\n");
         }
    }
}
