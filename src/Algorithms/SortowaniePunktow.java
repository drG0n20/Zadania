package Algorithms;


public class SortowaniePunktow extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "sortowaniepunktow";
    }

    @Override
    public void runAlgorithm(String[] input) {
        //sortowanie punktu ilosc przypadkow testowych: 3
        // 3 1 0 0 3 5 5 2 1 -1
        //nazwa algorytmu pod pozycja 0
        //promien - sqrt(x^2 + y^2)

        int n = Integer.parseInt(input[1]); //jedynka - ilosc przypadkow
        int tablicaPunktow[][] = new int[n][3]; //pierw par - il przypad. / ilosc kolumn

        int iterator = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) { //bo kazdy przyp test = 3 liczby
                tablicaPunktow[i][j] = Integer.parseInt(input[iterator]);
                iterator++;
            }
        }

        int tablicaWynikow[][] = new int[n][2]; // numer & wynik  | zaokraglanie - round
        for (int i = 0; i < n; i++) {
            tablicaWynikow[i][0] = tablicaPunktow[i][0];
            double x = Math.pow((double) tablicaPunktow[i][1], 2d);
            double y = Math.pow((double) tablicaPunktow[i][2], 2d);
            double sqrt = Math.sqrt(x + y); //pierwaistek
            int round = (int) Math.round(sqrt);
            tablicaWynikow[i][1] = round;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (tablicaWynikow[j][0] > tablicaWynikow[j + 1][0]) {
                    int temp[] = new int[2];
                    temp[0] = tablicaWynikow[j][0];
                    temp[1] = tablicaWynikow[j][1];

                    tablicaWynikow[j][0] = tablicaWynikow[j + 1][0];
                    tablicaWynikow[j][1] = tablicaWynikow[j + 1][1];

                    tablicaWynikow[j + 1][0] = temp[0];
                    tablicaWynikow[j + 1][1] = temp[1];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int punkt = tablicaWynikow[i][0];
            for (int j = 0; j < n; j++) {
                if (punkt == tablicaPunktow[j][0])
                    System.out.printf("Punkt: %d; X: %d; Y: %d\n",
                            punkt, tablicaPunktow[j][1], tablicaPunktow[j][2]);
            }
        }
    }

}
