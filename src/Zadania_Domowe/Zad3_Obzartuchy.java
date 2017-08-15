package Zadania_Domowe;

import Algorithms.AbstractAlgorithm;

public class Zad3_Obzartuchy extends AbstractAlgorithm {
    private int[] czas = {};

    @Override
    public String getName() {
        return "obzartuchy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int liczbaTestow = 2;
        int pudelka;
        int[] t1; //czas jedzenia pojedynczego ciastka
        int[] t2; //czas jedzenia pojedynczego ciastka
        t1 = new int[]{3600, 1800};
        t2 = new int[]{123, 32999, 10101};
//        t = Integer.parseInt(input[4]);
        int doba = 86400; //24h => s.
        int obzartuchy1 = 2;
        int obzartuchy2 = 3;
        int ciastkaWpudelku1 = 10;
        int ciastkaWpudelku2 = 356;
        int czas[] = new int[100000];
        int suma = 0;

        for (int i = 0; i < liczbaTestow; i++) {
            pudelka = 0;
//            obzartuchy1 = Integer.parseInt(input[2]);
//            ciastkaWpudelku = Integer.parseInt(input[3]);
            for (int j = 1; j < obzartuchy1; j++) {
                suma += doba / t1[i];
            }
            while (pudelka * ciastkaWpudelku1 < suma) {
                pudelka++;
            }
//            for (int k = 1; k < obzartuchy2; k++) {
//                suma += doba / t2[i];
//            }
//            while (pudelka * ciastkaWpudelku2 < suma) {
//                pudelka++;
//            }
            System.out.println(pudelka);
//            pudelka = 0;
//            suma = 0;
        }
    }
}
