import java.util.Scanner;
public class Average {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double N = 0;
    double M = 0;
    double sum = 0.0000;
    double avg = 0.0000;
    N = scan.nextDouble();
    M = scan.nextDouble();
    sum = N + M;
    avg = sum/2;
    System.out.printf("%.4f", + avg );
  }
}