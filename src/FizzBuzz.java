/**
 * Created by droman on 5/26/16.
 */
public class FizzBuzz {

    //This method determines if a number would be Fizz and/or Buzz, or a
    //regular number

    /**
     * This method indentifies if a number is a regular one, Fizz and/or Buzz
     * @param n This is the number to be identified
     * @return String returns a number with its FizzBuzz Machine indentifier
     */
    public static String categorize(int n) {
        String number ="";

        if(n%5 != 0 && n%3 != 0){
            number += n;
        }
        else{
            //Check if it is divisible By
            if(n%3 == 0){
                number+= "Fizz";
            }
            if(n%5 == 0){
                number+="Buzz";
            }
        }
        return number;
    }

    /**
     * This method runs the FizzBuzz game with the numbers 1 through 100
     * @return String This returns the results of the game.
     */

    public static String playGame(){
        String output = "";
        for(int i=1; i<=100; i++){
            output += categorize(i);
            output += "\n";
        }
        return output;
    }
}
