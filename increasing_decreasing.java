import java.util.Scanner;
public class increasing_decreasing
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int b = sc.nextInt();
        System.out.println("Enter another number = ");
        int a = sc.nextInt();
        if(a>b)
        {
            System.out.println("Increasing");
        }
        else if(a==b)
        {
            System.out.println("Neither Increasing nor Decreasing");
        }
        else
        {
            System.out.println("Decreasing");
        }
    }
}
