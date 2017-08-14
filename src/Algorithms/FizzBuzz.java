package Algorithms;

/**
 * Created by jake on 30.07.2017.
 */
public class FizzBuzz extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Fizz Buzz";
    }

    @Override
    public void runAlgorithm(String[] input) {
        //Algorytm ma na celu wyświetlanie fizz, gdy liczba jest podzielna przez 3, buzz, gdy liczba jest podzielna przez 5

        int zakres = Integer.parseInt(input[1]);

        for (int i = 0; i <= zakres; i++){
            String napis = "";

            if(i % 3 == 0)
                napis += "Fizz";
            if(i % 5 == 0 )
                napis += "Buzz";
            if(napis.equals(""))
                napis += i;
            System.out.println(napis);
        }
    }
}
