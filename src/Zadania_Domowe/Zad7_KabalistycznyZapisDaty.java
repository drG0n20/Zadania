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
        HashMap<String, Integer> hashMapaDoPorownania = new HashMap<>();
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

        Scanner scanner = new Scanner(System.in);
        String wyraz;
        //pobieranie wyrazu od uzytkownika:
        System.out.println("\nAby obliczyc date wpisz wyraz:\n(dlugosc do 25 malych liter!)\n");
        wyraz = scanner.nextLine();
//rozbijam wyraz na pojedyncze literki i dodaje do hashMapaDoPorownania
        for (int i = 0; i < wyraz.length(); i++) {
            int intChar = wyraz.indexOf(' ');
            String strChar = wyraz.substring(i, i + 1);
            for (int j = 0; j < wyraz.length(); j++) {
                hashMapaDoPorownania.put(strChar, i);
            }
            for (int k = 0; k < wyraz.length(); k++) {
                hashMap.equals(hashMapaDoPorownania);
            }
        }
//        System.out.println(hashMapaDoPorownania);
//        System.out.println("*********");
//        System.out.print(hashMap);
        System.out.println("\nTwoj wyraz to: " + wyraz);
    }

    private void tooLong() {
        String wyraz = "";
        if (wyraz.length() > 25) {
            System.out.println("Wyraz za dlugi!");
        }
    }
}
