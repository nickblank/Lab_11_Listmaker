import java.util.*;
import java.util.Scanner;

public class Main
{

    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        final String menu = "A is add    D is delete    P is print    Q is quit ";
        boolean done = false;
        String selection = "";


        do {
            displayList();
            selection = SafeInput.getRegExString(in, menu, "[AaDdPpQq]");
            selection = selection.toUpperCase();

            switch (selection)
            {
                case "A":
                    Add();
                    break;

                case "D":
                    Delete();
                    break;

                case "P":
                    displayList();
                    break;

                case "Q":
                    Quit();
                    break;
            }
            System.out.println("selection is " + selection);
        } while (!done);

    }

    private static void displayList()
    {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        if (list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%3d%20s", i + 1, list.get(i));
                System.out.println();
            }
        }
        else
            System.out.println("+++List is empty***");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    private static void Quit()
    {
        Scanner sc = new Scanner(System.in);
        String message = "Are you sure? Y or N.";
        boolean quit = SafeInput.getYNConfirm(sc,message);
        if(quit) {
            System.exit(1);
        }
        return;
    }
    private static void Delete()
    {
        Scanner sc = new Scanner(System.in);
        String message = "Enter item number to remove";
        if(list.isEmpty()) {
            System.out.println("         List is Empty         ");
            return;
        }
        int index = SafeInput.getRangedInt(sc, message,1, list.size());
        list.remove(index-1);
    }
    private static void Add()
    {
        Scanner sc = new Scanner(System.in);
        String item = SafeInput.getNonZeroLenString(sc, "Enter item to add");
        list.add(item);

    }
}
