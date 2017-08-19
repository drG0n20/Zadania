package Zadania_Domowe;

import Algorithms.AbstractAlgorithm;

public class Zad6_Samolot extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "samolot";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n1 = Integer.parseInt(input[1]); //rzedy siedzace w kl. biznes
        int k1 = Integer.parseInt(input[2]); //rzedy w kl. eko
        int n2 = Integer.parseInt(input[3]); //miejsca siedzace w kl. biznes
        int k2 = Integer.parseInt(input[4]); //miejsca w kl. eko
        int wynik = 0;
        int counter = 0;

        while (counter == 0) {
            wynik = (n1 * k1) + (n2 * k2);
            counter++;
        }
        System.out.println(wynik);
    }
}
