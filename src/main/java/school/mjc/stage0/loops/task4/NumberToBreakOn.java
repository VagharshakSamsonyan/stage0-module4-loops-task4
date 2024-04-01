package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        // Check if toBreakWith is greater than numberToGoUntil
        if (toBreakWith <= numberToGoUntil) {
            // Loop initialization
            for (int i = 1; i <= toBreakWith; i++) {
                // Print numbers until toBreakWith
                System.out.println(i);
            }
        } else {
            // Loop initialization
            for (int i = 1; i <= numberToGoUntil; i++) {
                // Print numbers until numberToGoUntil
                System.out.println(i);
            }
            // Print message for iterating till the end
            System.out.println("iterating till the end");
        }
    }
}












