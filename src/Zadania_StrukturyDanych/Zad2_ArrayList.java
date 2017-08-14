package Zadania_StrukturyDanych;

import Algorithms.AbstractAlgorithm;

import java.util.ArrayList;

public class Zad2_ArrayList extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "arraylist";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int toDelete = Integer.parseInt(input[1]);

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 2; i < input.length; i++) {
            lista.add(Integer.parseInt(input[i]));
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == toDelete){
                lista.remove(i);
            }else {
                i = 0;
            }
        }

        for (int i = 0; i <lista.size() ; i++) {
            System.out.println(lista);
        }
    }
}
