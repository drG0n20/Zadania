package Algorithms;

public class SumowanieLiczbNaturalnych extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "sumowanieliczbnaturalnych";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int suma = 0;
        int i = 1;

        while (i < n) {
            suma += 1;
//            System.out.printf("Iteracja: %d  ::: Wartosc sumy: %d \n ", i, suma);
            i++;
        }
        System.out.println(suma);
    }


}
