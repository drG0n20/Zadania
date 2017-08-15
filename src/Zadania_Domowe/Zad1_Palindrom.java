package Zadania_Domowe;

import Algorithms.AbstractAlgorithm;

public class Zad1_Palindrom extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "palindrom";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int liczba = Integer.parseInt(input[1]);
        //drukuje wynik
        System.out.println(addPalindrome(liczba));
    }

    // odwracanie liczby
    private int reversedPalindrome(int liczba) {
        int reverse = 0;
        while (liczba != 0) {
            reverse = reverse * 10;
            reverse = reverse + liczba % 10;
            liczba = liczba / 10;
        }
        return reverse;
    }
    //sprawdzenie czy liczba jest palinromem
    private boolean checkIfPalindrome(int liczba) {
        int reverse = reversedPalindrome(liczba);
        if (reverse == liczba) {
            return true;
        } else {
            return false;
        }
    }
    //dodawanie liczby do jej odwrotnosci
    private int addPalindrome(int liczba) {
        int counter = 1;
        if (checkIfPalindrome(liczba)) {
            System.out.println(" Twoja liczba jest palindromem");
        } else {
            while (!checkIfPalindrome(liczba)) {
                int reverse = reversedPalindrome(liczba);
                int sum = liczba + reverse;
                System.out.printf("%d + %d = %d, \n", liczba, reverse, sum);
                counter++;
                liczba = sum;
            }
        }
        return counter;
    }
}
