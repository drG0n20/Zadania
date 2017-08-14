package Zadania_StrukturyDanych;

import Algorithms.AbstractAlgorithm;
import java.util.ArrayList;
import java.util.Stack;

public class Zad4_Stos_ArrayList extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "stos_array_list";
    }

    @Override
    public void runAlgorithm(String[] input) {

        // tworzymy pusta liste

        ArrayList<Integer> lista = new ArrayList<>();

        //wypelniamy liste
        for (int i = 1; i < input.length; i++) {
            lista.add(Integer.parseInt(input[i]));
        }
//        pomocnicze drukowanko do sprawdzenia
//        System.out.println("\nLiczby z listy to: ");
//        for (Integer i : lista) {
//            System.out.printf("%d ", i);
//        }

        Stack<Integer> stos = new Stack<>();
        for (Integer liczby : lista) {
            stos.push(liczby);
        }
//        tutaj to samo
//        System.out.println("\nLiczby ze stosu to: ");
//        System.out.printf("%s: ", stos+"\n");

        ArrayList<Integer> reverseInput = new ArrayList<>();

        while (!stos.isEmpty()) {
            int stosAdd = stos.pop();
            reverseInput.add(stosAdd);
        }

        if (lista.equals(reverseInput))
            System.out.println("\nIt's a palindrome.");
        else
            System.out.println("\nThat isn't a palindrome.");
    }
}

