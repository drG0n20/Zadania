package Zadania_Algorytmika_PierwszyTydzien;

import Algorithms.AbstractAlgorithm;

public class Zad4_InterpretacjaTekstu_Sprawdzian extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "sprawdzian";
    }


    @Override

    public void runAlgorithm(String[] input) {

        String ZenekAnswers = input[1];
        String BogdanAnswers = input[2];
        String KubaAnswers = input[3];

        if (!(KubaAnswers.length() == ZenekAnswers.length()) &&
                !(KubaAnswers.length() == BogdanAnswers.length())) {
            System.out.println("Długości odpowiedzi się nie zgadzają!");
            return;
        }

        char[] ZenekCharAnswers = ZenekAnswers.toCharArray();
        char[] BogdanCharAnswers = BogdanAnswers.toCharArray();
        char[] KubaCharAnswers = KubaAnswers.toCharArray();

        int licznikOdpowiedzi = 0;

        for (int i = 0; i < KubaAnswers.length(); i++) {
            if (KubaCharAnswers != BogdanCharAnswers)
                licznikOdpowiedzi++;

            if (KubaCharAnswers != ZenekCharAnswers)
                licznikOdpowiedzi++;
        }
        System.out.printf("\nMaksymalna liczba punktow Jarka i Marka to: %d\n", licznikOdpowiedzi);
    }
}
