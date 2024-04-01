package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
            return;
        }

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }

        int skippedSum = numberToSkip * (numberToSkip + 1) / 2; // sum of numbers from 1 to numberToSkip
        int countedSum = (lastInRow * (lastInRow + 1) / 2) - skippedSum; // sum of numbers from 1 to lastInRow minus skippedSum

        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + countedSum);
    }
}
