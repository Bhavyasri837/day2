import java.util.*;
public class evenodd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int c=1;
        if((num&c)==0)
        {
            System.out.println(+num+"given number is even number");
        }
        else{
            System.out.println(+num+"given number is an even number");
        }
    }
    
}
 