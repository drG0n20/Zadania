package Algorithms;


public class SzyfrCezara extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "szyfrcezara";
    }

    private String _letters[] = {"A", "B", "C", "D", "E", "F", "G", // _letters pole prywatne
            "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U",
            "W", "X", "Y", "Z"};

    @Override
    public void runAlgorithm(String[] input) {
//na pierwsz el zawsze dostajemy nazwe algor. - iterujemy po wszystkich slowach

        for (int words = 1; words < input.length; words++) {
            String word = input[words].toUpperCase();
            char lettersInWord[] = word.toCharArray(); //rozbijamy cale slowo na literki
            for (int letter = 0; letter < lettersInWord.length; letter++) {
                int position = getLetterPosition(Character.toString(lettersInWord[letter])); //zamieniamy chara spowrotem na stringa+ pozycja
                //w int position zapisujemy pozycje
                int move = (position + 3) % _letters.length;
                System.out.printf("%s", _letters[move]);
            }
            System.out.println(" ");
        }
    }

    private int getLetterPosition(String letter) {
        for (int i = 0; i < _letters.length; i++) {
            if (letter.equals(_letters[i])) { //jako ze literki w porzadku alf, zwracamy poz literki
                return i;
            }
        }
        return -1; //nie udalo sie odnalzc literki (zly znak)
    }

}




