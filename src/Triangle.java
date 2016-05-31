/**
 * Created by droman on 5/25/16.
 */
public class Triangle {


    /**
     * This method is used to draw on star.
     * @return String This returns one star.
     */
    public static String drawOneStar(){
        return "*";
    }

    /**
     * This method draws a line of stars with a given size.
     * @param n This is the size of the horizontal line.
     * @return String This returns the horizontal line.
     */
    public static String drawHorizontalLine(int n){
        String line = "";

        //Iterating the times to draw star
        for(int i=0; i<n; i++){
            line += drawOneStar();
        }

        return line;
    }


    /**
     * This method draws a vetical line wwith stars given a size.
     * @param n This parameter is the size of the vertical line.
     * @return String This returns the vertical line.
     */
    public static String drawVerticalLine(int n){
        String line = "";

        //Iterating vertically to draw stars
        for(int i=0; i<n; i++){
            line += drawOneStar() + "\n";
        }
        return line;
    }

    /**
     * This method draws a right triangle given a height.
     * @param n This parameter is the height of the triangle
     * @return String this returns the right triangle.
     */
    public static String drawRightTriangle(int n){
        String triangle="";

        //Iterate vertically
        for(int i=1; i <= n; i++){
            //Each size of the line increases by one at each iteration
            triangle += drawHorizontalLine(i) + "\n";
        }
        return triangle;
    }



}
