import java.util.Scanner;
public class Vovels_Consonants
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string = ");
        String st = sc.nextLine();
        int v=0,c=0;
        st=st.toLowerCase();
        for(int i=0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    v++;
                }
                else
                {
                    c++;
                }
            }
        }
        System.out.println("Vovels = "+v);
        System.out.println("Consonants = "+c);
    }
}
