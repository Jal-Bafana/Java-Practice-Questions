import java.util.Scanner;
public class n_odd_numbers
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x,i,s=0,c=0;
        System.out.println("Enter a number = ");
        x=sc.nextInt();
        for(i=1,c=0;c<x;i=i+2,c++)
        {
            System.out.print(i+" ");
            s=s+i;
        }
        System.out.println("\nSum = " +s);
    }
}