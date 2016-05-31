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

    /**
     * This em
     * @param number
     * @return
     */
    public static ArrayList<Integer> generate(int number){

        ArrayList<Integer> factors = new ArrayList<Integer>();

        //Returns an empty list if the the number is 1.
        if(number == 1){
            return factors;
        }

        //Indexes of array are possible factors (candidate factors) of the number.
        //The boolean values represent if the candidates have been checked if they
        //are factors or not.
        boolean[] listFactors = new boolean[number];

        //Iterating through the candidate factors
        for(int i=2; i<listFactors.length; i++){
            //Check if a possible factor has been marked
            if(!listFactors[i]){

                //Mark current candidate as checked
                listFactors[i] = true;

                //Check if the number is divisible by the factor candidate
                if(number%i == 0){
                    factors.add(i);//Add the number to the list of factors
                }

                //Mark all the possible multiples of the factor candidate that are currently analyzed
                int index = i*i;
                int counter= 0;

                //Traverse through all the multiples of the factor to mark them
                while(index < number) {
                    listFactors[index] = true;//Marking the multiple
                    counter++;//Increasing the counter
                    index = (i*i) + counter*i;//Getting the next multiple
                }
            }
        }

        return factors;//Return list of multiples
    }
}
