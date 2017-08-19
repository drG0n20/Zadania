package Zadania_Domowe;

import Algorithms.AbstractAlgorithm;

import java.util.HashMap;
import java.util.Scanner;

public class Zad7_KabalistycznyZapisDaty extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "kabalistyczny_zapis_daty";
    }

    @Override
    public void runAlgorithm(String[] input) {
//  tworzymy hashMape
        HashMap<String, Integer> hashMap = new HashMap<>();
//  dodajemy literki do hashmapy:
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        hashMap.put("d", 4);
        hashMap.put("e", 5);
        hashMap.put("f", 6);
        hashMap.put("g", 7);
        hashMap.put("h", 8);
        hashMap.put("i", 9);
        hashMap.put("k", 10);
        hashMap.put("l", 20);
        hashMap.put("m", 30);
        hashMap.put("n", 40);
        hashMap.put("o", 50);
        hashMap.put("p", 60);
        hashMap.put("q", 70);
        hashMap.put("r", 80);
        hashMap.put("s", 90);
        hashMap.put("t", 100);
        hashMap.put("v", 200);
        hashMap.put("x", 300);
        hashMap.put("y", 400);
        hashMap.put("z", 500);

        String wyraz;

        Scanner scanner = new Scanner(System.in);

        //pobieranie wyrazu od uzytkownika:
        System.out.println("\nAby obliczyc date wpisz wyraz:\n(dlugosc do 25 malych liter!)\n");
        wyraz = scanner.nextLine();

        for (int i = 0; i < wyraz.length(); i++) {
            int intA = wyraz.indexOf(' ');
            String strA = wyraz.substring(i, i + 1);
            System.out.println(strA);
        }
        /**
         *
         *  C.D.N...
         *
         */

//        System.out.println("\nTwoj wyraz to: " + wyraz);
    }
    private void tooLong() {
        String wyraz = "";
        if (wyraz.length() > 25) {
            System.out.println("Wyraz za dlugi!");
        }
    }
}
