package Algorithms;

public class BiednyCamelCase extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Biedny Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int letters = 0; //licznik
        for (int wordsCounter = 1; wordsCounter < input.length; wordsCounter++) // for, przechodzi po wszystkich slowach
        {
            String word = input[wordsCounter];
            char[] lettersInWord = word.toCharArray();
            for (int lettersCounter = 0; lettersCounter < lettersInWord.length; lettersCounter++) {
                if (letters % 2 == 0) //jezeli literka parzysta wypisujemy z duzej
                {
                    System.out.print(Character.toString(lettersInWord[lettersCounter]).toUpperCase());
                } else // jezeli niepazysta z malej
                {
                    System.out.print(Character.toString(lettersInWord[lettersCounter]).toLowerCase());
                }
                letters++; // zwiekszamy licznik
            }
            System.out.print(" "); //wypisujemy spacje
        }
    }
}
