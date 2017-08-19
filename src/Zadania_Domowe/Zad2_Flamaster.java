package Zadania_Domowe;

import Algorithms.AbstractAlgorithm;

public class Zad2_Flamaster extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "flamaster";
    }

    @Override
    public void runAlgorithm(String[] input) {

        String slowo = "AAABBBBCCCDD";
        int counter = 1;
        int licznik;
        licznik = slowo.length();
        char[] tab = new char[200];
        char[] tab2 = new char[200];
//        tab = new char[slowo.length()];
//        tab2 = new char[slowo.length()];

        for (int i = 0; i < slowo.length(); i++) {
            tab[i] = slowo.charAt(i);
        }
        for (int j = 0; j < licznik - 1; j++) {
            tab2[j] = slowo.charAt(j + 1);
        }
        for (int k = 0; k < licznik; k++) {
            counter = 1;
            while (tab[k] == tab2[k]) {
                counter++;
                k++;
            }
            if (counter < 2) {
                System.out.printf("%s", tab[k]);
            } else if (counter == 2) {
                System.out.printf("%s", tab[k]);
            } else {
                System.out.printf("%s", tab[k]);
                System.out.printf("%d", counter);
            }
        }
    }
}

