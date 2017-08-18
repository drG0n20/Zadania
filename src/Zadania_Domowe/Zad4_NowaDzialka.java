package Zadania_Domowe;

import Algorithms.AbstractAlgorithm;

public class Zad4_NowaDzialka extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "nowadzialka";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int D = Integer.parseInt(input[1]); // liczba zestawow danych
        int X;
        int[] wynik = new int[1000]; // powierzchnia działki w „krokach kwadratowych Jasia”

        for (int i = 0; i < D; i++) {
            X = Integer.parseInt(input[2 + i]);
            wynik[i] = X * X;
        }
        //drukuje wynik
        for (int i = 0; i < D; i++) {
            System.out.println(wynik[i]);
        }
    }
}
