import java.util.*;
public class raju
{
    static boolean prime(int n)
    {
        if(n==1 || n==0)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(prime(i))
            {
                System.out.println(i);
            }
        }
    }
}