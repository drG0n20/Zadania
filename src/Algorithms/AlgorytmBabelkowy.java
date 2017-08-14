package Algorithms;

public class AlgorytmBabelkowy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "algorytmbabelkowy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int tab[] = new int[input.length - 1];
        int temp; //wartosc tymczasowa
        //przypisujemy wartosci poprzez petle

        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }
        //zamieniamy miejscami
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[j] < tab[j + 1]) {
                    temp = tab[j + 1];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}


