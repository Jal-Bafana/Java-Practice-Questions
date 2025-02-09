import java.util.Scanner;
public class quadratic_check
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c,d;
        System.out.println("Quadratic Equation Checker");
        System.out.println("Enter A = ");
        a = sc.nextDouble();
        System.out.println("Enter B = ");
        b = sc.nextDouble();
        System.out.println("Enter C = ");
        c = sc.nextDouble();
        d = (b*b) - (4*a*c);
        if(d == 0)
        {
            System.out.println("Roots are real and equal.");
        }
        else if(d > 0)
        {
            System.out.println("Roots are real and unequal");
            System.out.println("Roots: ");
            double x1,x2;
            x1= (-b + (Math.sqrt(d)))/(2*a);
            x2= (-b - (Math.sqrt(d)))/(2*a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
        else
        {
            System.out.println("Roots are Imaginary.");
        }
    }
}





