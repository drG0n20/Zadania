package Zadania_StrukturyDanych;

import Algorithms.AbstractAlgorithm;

public class Zad1_Zmienne_i_Tablice extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "zmienneitablice";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] tab = new int[input.length - 1];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (tab[i] == tab[j]) {
                    System.out.printf("\nPowtazajacy sie element to %d, " +
                            "a jego indeksy to %d i %d.\n", tab[i], j, i);
                    return;
                }
            }
        }
        System.out.println("\nNie ma powtarzajacych sie elementow.\n");
    }
}
