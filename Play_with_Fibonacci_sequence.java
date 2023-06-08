import java.util.Scanner; 
public class Answer 
{ 
    public static void main(String[] args) 
    { 
        Scanner scan=new Scanner(System.in); 
        int n=scan.nextInt(); 
        fib(n); 
        scan.close(); 
    } 
    private static void fib(int n) 
    { 
        int n1=0,n2=1; 
        System.out.print(0+ " "); 
        for(int i=0;i<n-1;++i) 
        { 
            int n3=n1+n2; 
            n2=n1; 
            n1=n3; 
            System.out.print(n3+ " "); 
        } 
    } 
} 