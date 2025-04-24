import java.util.Scanner;
import java.util.ArrayList;
public class lab5_2
{
    public ArrayList<Integer> checker(int[] input)
    {
        ArrayList<Integer> distinct = new ArrayList<>();
        for(int i=0;i< input.length;i++)
        {
            if(!distinct.contains(input[i]))
            {
                distinct.add(input[i]);
            }
        }
        return distinct;
    }
    public void displayresult(ArrayList<Integer> distinct)
    {
        System.out.println("Distinct Numbers: "+ distinct);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n=10;
        System.out.println("Enter ten numbers: ");
        int[] input = new int[n];
        for(int i=0;i<n;i++)
        {
            input[i] = sc.nextInt();
        }
        lab5_2 obj = new lab5_2();
        ArrayList<Integer> distinct = obj.checker(input);
        obj.displayresult(distinct);
    }
}
