public class ColourCode
{
  public static void main(String args[])
  {
    switch(args[0].charAt(0))
    {
        case 'R':
          System.out.println("Red");
        break;
 
        case 'B':
          System.out.println("Blue");
        break;

        case'G':
          System.out.println("Green");
        break;


        case'O':
          System.out.println("orange");
        break;

        case'Y':
          System.out.println("Yellow");
        break;

        case 'W':
          System.out.println("White");
        break;
  
        default:      
          System.out.println("Invalid Code");
        break;
     }
  }
}
