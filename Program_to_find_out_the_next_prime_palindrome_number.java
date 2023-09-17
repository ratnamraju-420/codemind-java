import java.util.*;
public class raju
{
    static boolean palin(int n)
    {
        int sum=0,temp;
        temp=n;
        while(temp>0)
        {
            sum=sum*10+(temp%10);
            temp=temp/10;
        }
        if(n==sum)
        {
                return true;
        }
        else
        {
            return false;
        }
    }
    static boolean prime(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        else if(n==2)
        {
            return true; 
        }
        int i,c=0;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            return true;
        }
        else
        {
            return false;
        }
}

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=n+1;i<20*n;i++)
        {
            if(prime(i)==true && palin(i)==true)
            {
                System.out.println(i);
                break;
            }
        }
        
    }
}