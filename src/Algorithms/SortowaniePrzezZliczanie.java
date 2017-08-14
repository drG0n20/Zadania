package Algorithms;


public class SortowaniePrzezZliczanie extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "sortowanieprzezzlicznie";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = input.length - 2;
        int max = Integer.parseInt(input[1]) + 1; //dodajemy 1 zeby byla 9 w tablicy

        int[] tabSparsowanychWejscia = new int[n];

        for (int i = 0; i < n; i++) {
            tabSparsowanychWejscia[i] = Integer.parseInt(input[i + 2]);
        }

        int[] tablicaDoZliczania = new int[max];
        for (int i = 0; i < tabSparsowanychWejscia.length; i++) {
            int liczba = tabSparsowanychWejscia[i]; //zapisujemy kazdy el wejscia
            tablicaDoZliczania[liczba]++; //odwlujemy sie do tego
        }

        for (int indeksTablicy = 0; indeksTablicy < tablicaDoZliczania.length; indeksTablicy++) {
            for (int ileLiczb = tablicaDoZliczania[indeksTablicy]; ileLiczb > 0; ileLiczb--) {
                System.out.printf("%d ", indeksTablicy);
            }
        }
    }
}
