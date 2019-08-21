public class CmdArgCompilationThird
{
   public static void main(String[] args)
    {int sum=0;
     int number1= Integer.parseInt(args[0] );
     int number2= Integer.parseInt(args[1] );
      sum= number2 + number1 ;
      System.out.println("the sum of " +  args[0] +" and"+ " " + args[1] + " is " +sum );
     }
}
