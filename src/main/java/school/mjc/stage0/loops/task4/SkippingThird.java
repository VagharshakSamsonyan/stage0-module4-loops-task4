package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        if (lastPrinted <= 0) {
            return;
        }

        int count = 0;
        for (int i = 1; i <= lastPrinted; i++) {
            if (count == 2) {
                count = 0;
            } else {
                System.out.println(i);
                count++;
            }
        }
    }
}
