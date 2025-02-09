import java.util.Scanner;
public class palindrome
{
    public static void main(String[]args)
    {
        int x,n,r=0,x1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        x = sc.nextInt();
        x1=x;
        while(x!=0)
        {
            n=x%10;
            r= (r*10) + n;
            x=x/10;
        }
        if(r==x1)
        {
            System.out.println("Number is Palindrome ");
        }
        else
        {
            System.out.println("Number is not Palindrome ");
        }
    }
}
