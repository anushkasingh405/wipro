public class HCF
{
    public static void main(String args[])
     {
          int count=0;
          int i=6;
         while(count<6)
         {
           if(i%2==0 && i%3==0 && i%5==0){count++; System.out.println(i);}
           i++;
          }
     }
}
