import java.util.*;
class SpellCheck
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first letter:");
        char A = sc.next().charAt(0);
        System.out.println("Enter the Second letter:");
        char B = sc.next().charAt(0);
        System.out.println("Enter the Three letter:");
        char C = sc.next().charAt(0);
        System.out.println("Enter the Four letter:");
        char D = sc.next().charAt(0);
        System.out.println("Enter the fifth letter:");
        char E = sc.next().charAt(0);
        System.out.println("Enter the Six letter:");
        char F = sc.next().charAt(0);
        System.out.println("Enter the Seven letter:");
        char G = sc.next().charAt(0);
        System.out.println();
        
        String X = ""+A+B+C+D+E+F+G;
        String Y= "Rainbow";
               
        if(X.equals(Y))
        {
            System.out.println(X);
        }
        else
        {
            System.out.println("The spelling is wrong");
        }
        
    }
}