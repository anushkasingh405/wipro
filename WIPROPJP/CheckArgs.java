public class CheckArgs{
    public static void main(String args[])
      {int i;
        String result= "";
        int value= args.length;
       if(value==0)
          {System.out.println("No values");}
        result=result + args[0];
       for(i=1;i<value;i++)
          {
            result  = result.concat(","+ args[i]);
          }
        
         System.out.println(result);
        
      }
}
