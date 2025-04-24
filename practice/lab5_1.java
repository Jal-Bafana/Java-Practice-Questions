/*
Write a program (with series of functions) that reads student scores, gets the best score, and then assigns grades based on the following scheme:
Grade is B if score is >= best - 20;
Grade is C if score is >= best - 30;
Grade is D if score is >= best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. 
*/
import java.util.Scanner;
public class lab5_1
{
    public static int bestscore(int[] scores)
    {
        int best = scores[0];
        for(int score : scores)
        {
            if(score > best)
            {
                best = score;
            }
        }
        return best;
    }
    public static char[] grader(int[] scores, int best)
    {
        char[] grades = new char[scores.length];
        for(int i = 0; i<scores.length; i++)
        {
            if(scores[i] == best)
            {
                grades[i] = 'A';
            }
            else if(scores[i] >= best -20)
            {
                grades[i] = 'B';
            }
            else if(scores[i] >= best -30)
            {
                grades[i] = 'C';
            }
            else if(scores[i] >= best -40)
            {
                grades[i] = 'D';
            }
            else
            {
                grades[i] = 'F';
            }
        }
        return grades;
    }
    public static void displayresult(int[] scores, char[] grades)
    {
        for(int i = 0;i< scores.length; i++)
        {
            System.out.println("Student "+i+" score is " + scores[i] + " and grade is "+ grades[i]);
        }
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students: ");
        n=sc.nextInt();
        int[] scores = new int[n];
        System.out.println("Enter "+ n +" scores: ");   
        for(int i = 0; i<n; i++)
        {
            scores[i]=sc.nextInt();
        }
        int best = bestscore(scores);
        char[] grades = grader(scores,best);
        displayresult(scores,grades);
    }
}
