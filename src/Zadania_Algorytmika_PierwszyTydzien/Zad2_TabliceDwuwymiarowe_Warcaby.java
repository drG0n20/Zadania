package Zadania_Algorytmika_PierwszyTydzien;

import Algorithms.AbstractAlgorithm;

public class Zad2_TabliceDwuwymiarowe_Warcaby extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "tablicedwuwymiarowe_warcaby";

    }

    @Override
    public void runAlgorithm(String[] input) {

        int m = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        String color = input[3];
        int counter = 0;

        if (color.equals("B")) {
            counter = 1;
        }

        String[][] tab = new String[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) //jesteśmy w polu A1
                    tab[i][j] = color;
                else if (j == 0) {
                    if (tab[i - 1][j].equals("B")) {
                        tab[i][j] = "C";
                        counter = 0;
                    } else {
                        tab[i][j] = "B";
                        counter = 1;
                    }
                } else {
                    if (counter % 2 == 0) {
                        tab[i][j] = "C";
                    } else {
                        tab[i][j] = "B";
                    }
                }
                counter++;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%s ", tab[i][j]);
            }
            System.out.println();
        }
    }
}
