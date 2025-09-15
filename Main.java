import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        int numOfNums;
        System.out.println("How many random numbers do you want to see (must be at least 1)?");
        numOfNums = scan.nextInt();
        printRandom(numOfNums);
    }
    
    public static void printRandom3(int num)
    {
        // Do problem 1 here
    }
    
    public static double calcSlope(double x1, double x2, double y1, double y2)
    {
        // Do problem 2 here; replace code below
        return 0.0;
    }
    
    public static int roundedDist(double a, double b)
    {
        // Do problem 3 here; replace code below
        return 0;
    }
}
