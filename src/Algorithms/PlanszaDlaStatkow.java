package Algorithms;

/**
 * Created by jake on 27.07.2017.
 */
public class PlanszaDlaStatkow extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Plansza dla statków";
    }

    private String _letters[] = {"A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T", "U", "W", "V", "X",
            "Y", "Z"}; //Tablica literek, która prezentuje nasz alfabet

    @Override
    public void runAlgorithm(String[] input) {

        int liczbaDoSpierwiastkowania = Integer.parseInt(input[1]);

        if (!(Math.sqrt(liczbaDoSpierwiastkowania) % 1 == 0)) {
            System.out.println("Liczby nie da się spierwiastkować całkowitoliczbowo!");
            return;
        }

        int rozmiar = (int) Math.sqrt(liczbaDoSpierwiastkowania);
        String[][] statki = new String[rozmiar][rozmiar];

        for (int i = 0; i < rozmiar; i++)
            for (int j = 0; j < rozmiar; j++)
                statki[i][j] = _letters[i] + (j + 1);

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++)
                System.out.printf("%s ", statki[i][j]);

            System.out.printf("\n");
        }
    }
}
