import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        /*
        int fac2 = fac(2);
        int fac5 = fac(5);
        int fac7 = fac(7);

        System.out.println(fac2);
        System.out.println(fac5);
        System.out.println(fac7);
        */

        //This allows you to enter a specified number
        char repeat;
        do {
            System.out.println("Enter a factorial number: ");



            int facInput = input.nextInt();
            int facNum = fac(facInput);
            System.out.println(facInput + "! = " + facNum);
            System.out.println("Would you like to go again?");

            repeat = input.next().charAt(0);

        }while(repeat == 'Y' || repeat == 'y');
        {
            System.out.println("Goodbye");
        }
    }


    public static int fac(int n)
    {
        if(n == 0)
        {
            return 1; //returns 1 and then is multiplied by the last value of recursion
        }
        else
        {
            return n * fac(n - 1); //ex. 5 * fac(5 - 1) -> 5 * 4 = 20
        }
    }
}
