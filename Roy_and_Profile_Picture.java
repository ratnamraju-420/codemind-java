import java.util.*;
public class raja
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int l,w,h,t,i;
        l = sc.nextInt();
        t = sc.nextInt();
        for(i=0;i<t;i++)
        {
            w=sc.nextInt();
            h=sc.nextInt();
            if(w<l||h<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if((w>l||h>l) && w!=h)
            {
                System.out.println("CROP IT");
            }
            else if(w==h)
            {
                System.out.println("ACCEPTED");
            }
        }
    }
}