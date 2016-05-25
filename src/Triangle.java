/**
 * Created by droman on 5/25/16.
 */
public class Triangle {

    //Method to draw one star
    public static String drawOneStar(){
        return "*";
    }

    //Method to draw a lines of stars given a constant
    public static String drawHorizontalLine(int n){
        String line = "";

        for(int i=0; i<n; i++){
            line += drawOneStar();
        }
        return line;
    }

    public static String drawVerticalLine(int n){
        String line = "";

        for(int i=0; i<n; i++){
            line += drawOneStar() + "\n";
        }

        return line;
    }

    public static String drawRightTriangle(int n){
        String triangle="";

        for(int i=1; i <= n; i++){
            triangle += drawHorizontalLine(i) + "\n";
        }

        return triangle;
    }



}
