public class IntegerClassification{
    public static void main(String args[])
      {
        int value= Integer.parseInt(args[0]);
         if(value>0)
          {System.out.println("Positive");}
          if(value<0)
          {System.out.println("Negative");}
         else if(value==0)
          {System.out.println("zero");}
      }
}
