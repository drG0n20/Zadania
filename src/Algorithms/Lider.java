package Algorithms;

/**
 * Created by jake on 31.07.2017.
 */
public class Lider extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Wyszukiwanie lidera";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = 0; //ustawiam sobie maxa na zero
        //nie znam jeszcze długości mojej tabloicy do zliczania
        //więc na ten moment szukam największego elementu, aby na jego podstawie
        //zbudować tablice
        for(int i = 1; i < input.length; i++)
        {
            int sparsowane = Integer.parseInt(input[i]);
            if(sparsowane > n)
                n = sparsowane;
        }

        int tablicaDoZliczania[] = new int[n+1]; //teraz kiedy znam największy element mogę utworzyć tablice

        for(int i = 1; i < input.length; i++) //przechodzę po inpucie ponownie parsując liczby
            //i od razu je zliczając
        {
            int sparsowane = Integer.parseInt(input[i]);
            tablicaDoZliczania[sparsowane]++;
        }

        //teraz wyszukuje element najczęściej występujący
        int max = 0;
        for(int i = 0; i < tablicaDoZliczania.length; i++)
            if(tablicaDoZliczania[i] > tablicaDoZliczania[max])
                max = i;

        if(tablicaDoZliczania[max] >= Math.round(tablicaDoZliczania.length / 2d)) //sprawdzam czy wystąpił więcej niż połowę razy
            System.out.printf("Lider: %d\n", max);
        else
            System.out.println("Nie znaleziono lidera!");
    }
}
