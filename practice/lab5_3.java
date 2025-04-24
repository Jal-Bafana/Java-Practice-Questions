/*
Write a program to create a Vector that holds the following values:
2, 6, Hello, 7, everyone
   Use appropriate methods of Vector class to perform the following task.
   a.  Iterate through the vector
   b.  Add element at a specified index
   c.  Check whether a given element exist in the Vector, if so remove it
   d.  Replace an item with a new value given
   e.  Retrieve the first and the last element of the Vector
*/
import java.util.Vector;
public class lab5_3
{
    public static void main(String[]args)
    {
        Vector<Object> vec = new Vector<>();
        
        vec.add(2);
        vec.add(6);
        vec.add("Hello");
        vec.add(7);
        vec.add("everyone");
        
        System.out.println("Vector Elements: ");
        for(Object obj : vec)
        {
            System.out.println(obj);
        }
        vec.add(2,"inserted at index 2");
        System.out.println("\nAfter inserting : "+vec);
        
        if (vec.contains("Hello")) 
        {
            vec.remove("Hello");
            System.out.println("\n'Hello' found and removed: " + vec);
        } 
        else 
        {
            System.out.println("\n'Hello' not found.");
        }

        vec.set(0, 100); 
        System.out.println("\nAfter replacing first element with 100: " + vec);

        Object first = vec.firstElement();
        Object last = vec.lastElement();
        System.out.println("\nFirst element: " + first);
        System.out.println("Last element: " + last);
    }
}
