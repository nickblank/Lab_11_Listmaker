import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt) {
        boolean done = false;
        int inputInt = 0;
        String trash = "";

        do {
            System.out.print(prompt);
            if (pipe.hasNextInt())
            {
                inputInt = pipe.nextInt();

                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer, not: " + trash);
            }
        } while (!done);

        return inputInt;
    }
    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        double inputDouble = 0;
        String trash = "";

        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble())
            {
                inputDouble = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid double not: " + trash);
            }
        } while (!done);

        return inputDouble;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        int rangeInt = 0;
        String trash = "";

        do {
            System.out.print(prompt);
            if (pipe.hasNextInt())
            {
                rangeInt = pipe.nextInt();
                pipe.nextLine();

                if (rangeInt >= low && rangeInt <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Enter a valid number within the range, not: " + rangeInt);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid number within the range, not: " + trash);
            }
        } while (!done);
        return rangeInt;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        double rangeDouble = 0;
        String trash = "";

        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble())
            {
                rangeDouble = pipe.nextDouble();
                pipe.nextLine();

                if (rangeDouble >= low && rangeDouble <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Enter a valid number within the range, not: " + rangeDouble);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid number within the range, not: " + trash);
            }
        } while (!done);
        return rangeDouble;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        System.out.print(prompt);
        String continueYN = pipe.nextLine();

        while (!continueYN.equalsIgnoreCase("y") && !continueYN.equalsIgnoreCase("n"))
        {

            System.out.println("\nInvalid response. Try again.");
            continueYN = pipe.next();
        }
        if (continueYN.equalsIgnoreCase("n"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        boolean done = false;
        String trash = "";
        String retVal = "";

        do
        {

            System.out.print(prompt);
            retVal = pipe.nextLine();
            if (retVal.matches(regEx))
            {
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a matching pattern.");
            }
        } while (!done);
        return retVal;
    }
    public static void prettyHeader(String msg)
    {
        int whiteSpace;

        if (msg.length() < 54)
        {

            for (int x = 0; x <= 60; x++)
            {
                System.out.print("*");
            }
            System.out.print("\n");

            System.out.print("***");
            whiteSpace = (26 - (msg.length()) / 2);
            for (int x = 0; x <= whiteSpace; x++)
            {

                System.out.print(" ");
            }

            System.out.print(msg);

            whiteSpace = (27 - (msg.length()) / 2);
            for (int x = 0; x <= whiteSpace; x++)
            {

                System.out.print(" ");
            }
            System.out.println("***");

            for (int x = 0; x <= 60; x++)
            {
                System.out.print("*");
            }

        }
    }
    public static double CtoF (double Celsius)
    {
        double fahren = ((9 * Celsius) / 5) + 32;
        return fahren;
    }
}
