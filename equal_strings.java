import java.util.Scanner;
public class equal_strings
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string = ");
        String st1 = sc.nextLine();
        System.out.println("Enter another string = ");
        String st2 = sc.nextLine();
        if(st1.equals(st2))
        {
            System.out.println("Equal Strings");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}
