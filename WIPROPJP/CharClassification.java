public class CharClassification{
    public static void main(String args[])
      {
        char a='1';
   
        if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
        {System.out.println("Alphabet");}
        if((a >= ' ' && a <= '/') || (a >= ':' && a <= '@')||(a >= '[' && a <= '`') || (a >= '{' && a <= '~'))
         {System.out.println("Special character");}
        if(a >='0'&& a<='9')
         {System.out.println("Digit");}
      }
}
