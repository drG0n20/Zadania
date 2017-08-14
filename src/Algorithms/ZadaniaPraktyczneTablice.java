package Algorithms;

import java.util.Random;

public class ZadaniaPraktyczneTablice extends AbstractAlgorithm {


    @Override
    public String getName() {
        return "zadaniapraktyczne";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Random mRand = new Random(12);
        int[] losowa = new int[10];

        for (int i = 0; i < losowa.length - 1; i++) {
            losowa[i] = mRand.nextInt();
            System.out.println(losowa[i]);
        }
        System.out.printf("---------\n");

        int[] parzyste = new int[10];

        for (int i = 0, j = 0; i < parzyste.length; i++, j = j + 2) {
            parzyste[i] = j;
            System.out.println(parzyste[i]);
        }
        System.out.printf("---------\n");

        int[] nieParzyste = new int[10];
        for (int i = 0, j = 1; i < nieParzyste.length; i++, j = j + 2) {
            nieParzyste[i] = j;
            System.out.println(nieParzyste[i]);
        }
    }
}
