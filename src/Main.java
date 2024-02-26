//package src.main;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        System.out.println("Hello, wold");

        for (int i = 1; i <= 10; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i + " random number generated " + generateRandoNumber());
        }
    }

    private static int generateRandoNumber() {

        Random rand = new Random();

        int upperBound = 10;

        return rand.nextInt(upperBound);
    }
}