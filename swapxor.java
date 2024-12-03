public class swapxor {
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        a=a^b;
        b=a^b;
        a=a^b;
        String res=String.format("after swapping the value of a and b are\na=%d\nb=%d",a,b);
        System.out.println(res);
    }
    
}
