/**
 * Created by droman on 5/26/16.
 */
public class FizzBuzz {

    //This method determines if a number would be Fizz and/or Buzz, or a
    //regular number
    public static String categorize(int n) {
        String number ="";

        if(n%5 != 0 && n%3 != 0){
            number += n;
        }
        else{
            if(n%5 == 0){
                number+= "Fizz";
            }
            if(n%3 == 0){
                number+="Buzz";
            }
        }
        return number;
    }

    public static String playGame(){
        String output = "";
        for(int i=1; i<=100; i++){
            output += categorize(i);
            output += "\n";
        }
        return output;
    }
}
