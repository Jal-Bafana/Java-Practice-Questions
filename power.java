import java.util.Scanner;
public class power
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base = ");
        int b = sc.nextInt();
        System.out.println("Enter Exponent = ");
        int a = sc.nextInt();
        int p=1;
        for(int i=0;i<a;i++)
        {
            p=p*b;
        }
        System.out.println("Answer = "+p);
    }
}
