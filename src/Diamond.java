/**
 * Created by droman on 5/25/16.
 */
public class Diamond {

    /**
     * This method draws a figure that can be a normal isosceles or the upper isosceles
     * of a diamond. In the case of drawing a triangle as the upper part diamond, the
     * method does not draw the last line of the triangle.
     * @param diamond This paramenter indicates true for an upper diamond and false for normal isosceles.
     * @param n This parameter indicates the height of the figure.
     * @return String returns the figure drawn.
     */
    public static String drawTriangleAsUpperDiamond(boolean diamond, int n){

        String triangle = "";
        int sizeLine = 1;//Size of the starting line of the triangle

        //Iteration to draw each line
        for(int i=n; i>0; i--) {

                //This piece of code identifies when to draw a line.
                //If the method is used to build an upper diamond, then
                //the last line would not be drawn.
                if(!(diamond && i==1)){

                    //Print the new line character at the start
                    triangle += "\n";

                    //Add empty spaces to center the line
                    for (int j = 0; j < i - 1; j++) {
                        triangle += " ";
                    }

                    //Add the current line to the triangle
                    triangle += Triangle.drawHorizontalLine(sizeLine);
                }

                //Size of the next line increases by two following Arithmethic Progression.
                sizeLine += 2;
            }
        return triangle;
    }

    /**
     * This method draws a figure that can be an inverted isosceles or the lower isosceles
     * of a diamond. In the case of drawing a triangle as the lowert part diamond, the
     * method does not draw the first line of the triangle.
     * @param diamond This paramenter indicates true for a lower diamond and false for an inverted isosceles.
     * @param n This parameter indicates the height of the figure.
     * @return String This returns the figure drawn.
     */
    public static String drawTriangleAsLowerDiamond(boolean diamond, int n){
        String triangle = "";

        //Size of first line obeys the arithmetic progression where each line
        //from the vertex of the triangle increases by 2 stars. We found the size of last the
        //line of the progression.
        int sizeLine = 1 + (2*(n-1));


        //Iterate through each line that will be drawn
        for(int i=0; i<n; i++){

            //This piece of code identifies when to draw a line.
            //If the method is used to build a lower diamond, then
            //the first line would not be drawn.
            if(!(diamond && i==0)){
                //Add empty spaces to the line
                for (int j = 0; j < i; j++) {
                    triangle += " ";
                }

                //Draw the line of the Diamond
                triangle += Triangle.drawHorizontalLine(sizeLine);

                //Do not print a "new line character" at the end of the Triangle
                if(i != n) {
                    triangle += "\n";
                }
            }
            //Decrease the size of the next line by 2 following the Arithmetic Progression
            sizeLine -= 2;
        }

        return triangle;

    }

    /**
     * This method draws an isosceles with a given height.
     * @param n This parameter is the height of the triangle.
     * @return String This returns the drawing.
     */
    public static String drawIsosceles(int n){
        return drawTriangleAsUpperDiamond(false, n);
    }

    /**
     * This method draws a diamond with a given size of the bisection of the diagonal (triangle height).
     * @param n This parameter indicates the size of the bisection of the diagonal (triangle height).
     * @return String This returns the drawing.
     */
    public static String drawDiamond(int n){
       return drawTriangleAsUpperDiamond(true, n)+"\n"+Triangle.drawHorizontalLine(1+(2*(n-1)))+"\n"+drawTriangleAsLowerDiamond(true,n);
    }


    /**
     * This method draws a diamond with a name as the middle line and a given diagonal's bisection size.
     * @param n This parameter indicates the size of the diagonl's bisection
     * @param name This parameter is the name to be printed.
     * @return String This returns the drawing.
     */
    public static String drawDiamondName(int n, String name){
        return drawTriangleAsUpperDiamond(true, n)+"\n"+name+"\n"+drawTriangleAsLowerDiamond(true,n);
    }
}
