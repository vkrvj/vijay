import java.util.*;
 
class PosNegZ
{
    public static void main(String []s)
    {
        int n;

        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter any integer number: ");
        num=sc.nextInt();
         
      
        if(n>0)
            System.out.println(num + " is POSITIVE");
            
        else if(n<0)
            System.out.println(num + " is NEGATIVE");
            
        else
            System.out.println("IT's ZERO.");
         
    }
}
