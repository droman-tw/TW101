/**
 * Created by droman on 5/26/16.
 */
public class FizzBuzz {

    public static String playGame(){
        String output = "";
        for(int i=1; i<=100; i++){
            if(i%5 != 0 && i%3 != 0){
                output += i;
            }
            else{
                if(i%5 == 0){
                   output+= "Fizz";
                }
                if(i%3 == 0){
                    output+="Buzz";
                }
            }

            output += "\n";
        }
        return output;
    }
}
