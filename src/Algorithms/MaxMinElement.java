package Algorithms;

public class MaxMinElement extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "maxmin";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = input.length - 1;
        int[] tab = new int[n];
        int max = 0;
        int min = 0;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
            if (tab[i] > tab[max]) {
                max = i;
            }
            if (tab[i] < tab[min]) {
                min = i;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
