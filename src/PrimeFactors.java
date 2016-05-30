import java.util.ArrayList;

import java.lang.Math.*;

/**
 * Created by droman on 5/30/16.
 *
 * This solution has been based of the Erasthostenes' Sieve primality test:
 * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 *
 */

public class PrimeFactors {

    public static ArrayList<Integer> primeFactorization(int number){

        ArrayList<Integer> factors = new ArrayList<Integer>();

        if(number == 1){
            return factors;
        }

        boolean[] listFactors = new boolean[number];

        for(int i=2; i<listFactors.length; i++){
            //Check if a possible factor has been marked
            if(!listFactors[i]){

                //Check if the number is divisible by the factor candidate
                if(number%i == 0){
                    factors.add(i);
                }

                //Mark all the possible multiples of the factor candidate that is currently analyzed
                int index = i*i;
                int counter= 0;

                //Traverse through all the multiples of the factor to mark them
                while(index < number) {
                    listFactors[index] = true;//Marking the multiple
                    counter++;//Increasing the counter
                    index = (i*i) + counter*i;//Getting the next multiples
                }
            }
        }

        return factors;
    }
}
