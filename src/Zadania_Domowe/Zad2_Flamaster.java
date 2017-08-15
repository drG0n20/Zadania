package Zadania_Domowe;

import Algorithms.AbstractAlgorithm;

public class Zad2_Flamaster extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "flamaster";
    }

    @Override
    public void runAlgorithm(String[] input) {

        String slowo = "AAABBBBCCC";
        int counter = 1;
        int licznik;
        licznik = slowo.length();
        char[] tab;
        char[] tab2;
        tab = new char[slowo.length()];
        tab2 = new char[slowo.length()];

        for (int j = 0; j < slowo.length(); j++) {
            tab[j] = slowo.charAt(j);
        }
        for (int k = 0; k < licznik - 1; k++) {
            tab2[k] = slowo.charAt(k + 1);
        }

        for (int k = 0; k < licznik; k++) {
            counter = 1;
            while (tab[k] == tab2[k]) {
                counter++;
                k++;
            }
            if (counter <= 2) {
                System.out.printf("%s", tab[k]);
            } else {
                System.out.printf("%s", tab[k]);
                System.out.printf("%d", counter);
            }
        }
    }
}

