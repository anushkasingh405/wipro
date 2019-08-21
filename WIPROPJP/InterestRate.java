public class InterestRate
{
    public static void main(String args[])
     {
       int age=Integer.parseInt(args[1]);
        if( args[0].equalsIgnoreCase("Male") && age > 0 && age <= 58)
          {
                System.out.println("the percentage of interest is 8.4%.");
          }
        if( args[0].equalsIgnoreCase("Female") && age > 0 && age <=58)
          {
                System.out.println("the percentage of interest is 8.2%.");
          }
        if( args[0].equalsIgnoreCase("Female") && age > 58 && age <= 100)
          {
                System.out.println("the percentage of interest is 9.2%.");
          }
        if( args[0].equalsIgnoreCase("Male") && age >58 && age <= 100)
          {
                System.out.println("the percentage of interest is 10.5%.");
          }
     }

}
