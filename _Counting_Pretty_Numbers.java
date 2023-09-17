import java.util.*;
public class raja
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 0;
            for(int j=a;j<=b;j++)
            {
                if(j%10==2 || j%10==3 || j%10==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}