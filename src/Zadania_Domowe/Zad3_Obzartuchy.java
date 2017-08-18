//package Zadania_Domowe;
//
//import Algorithms.AbstractAlgorithm;
//
//public class Zad3_Obzartuchy extends AbstractAlgorithm {
//
//    @Override
//    public String getName() {
//        return "obzartuchy";
//    }
//
//    @Override
//    public void runAlgorithm(String[] input) {
//
//        int liczbaTestow = 2;
//        double pudelka1 = 0;
//        double pudelka2 = 0;
//        int[] t1;   //czas jedzenia pojedynczego ciastka
//        int[] t2;  //czas jedzenia pojedynczego ciastka
//        t1 = new int[]{3600, 1800};
//        t2 = new int[]{123, 32999, 10101};
//        int doba = 86400; //24h => s.
//        int obzartuchy1 = 2;
//        int obzartuchy2 = 3;
//        int ciastkaWpudelku1 = 10;
//        int ciastkaWpudelku2 = 356;
//        int suma = 0;
//
////2 testy
//        for (int i = 1; i < liczbaTestow; i++) {
//            for (int j = 0; j < obzartuchy1; j++) {
//                suma += (doba / t1[j]);
//                pudelka1 = suma / ciastkaWpudelku1;
////                if (pudelka1 % ciastkaWpudelku1 == 0) {
////                    break;
////                } else {
//////                    pudelka1 = (suma / ciastkaWpudelku1) + 1;
//                System.out.println("1: " + Math.ceil(pudelka1));
//            }
////            for (int k = 0; k < obzartuchy1; k++) {
////                suma += (doba / t2[k]);
////                pudelka2 = suma / ciastkaWpudelku2;
////                if (pudelka2 % ciastkaWpudelku2 == 0) {
////                    break;
////                } else {
////                    pudelka2 = Math.ceil(suma / ciastkaWpudelku2);
////                }
////            }
//            System.out.println(Math.ceil(pudelka1));
////                System.out.println(pudelka2);
//        }
//    }
//}
////}
