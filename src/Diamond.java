/**
 * Created by droman on 5/25/16.
 */
public class Diamond {

    public static String drawIsosceles(int n){
        String triangle = "";
        int sizeLine = 1;//Size of the starting line of the triangle

        for(int i=n; i>0; i--) {
            //Add empty spaces to center the line
            for (int j = 0; j < i - 1; j++) {
                triangle += " ";
            }

            //Add the current line to the triangle
            triangle += Triangle.drawHorizontalLine(sizeLine);

            if(i != 1) {
                triangle += "\n";
            }
            sizeLine += 2; //Size of the next line increases by two
        }
        return triangle;
    }


    public static String drawTriangleAsUpperDiamond(boolean diamond, int n){

        String triangle = "";
        int sizeLine = 1;//Size of the starting line of the triangle

        for(int i=n; i>0; i--) {

                if(!(diamond && i==1)){
                    //Add empty spaces to center the line
                    for (int j = 0; j < i - 1; j++) {
                        triangle += " ";
                    }

                    //Add the current line to the triangle
                    triangle += Triangle.drawHorizontalLine(sizeLine);
                    triangle += "\n";
                }

            }
            sizeLine += 2; //Size of the next line increases by two;
        return triangle;

    }


    public static String drawUpperPartDiamond(int n){
        return drawIsosceles(n);
    }


    //Method that draws the lower part of the diamond. It draws an Isosceles triangle pointing in a downward direction,
    //ignoring the first line which is drawn by the upper part of the Triangle.
    public static String drawLowerPartDiamond(int n){
        String triangle = "";
        int sizeLine = 1 + (2*(n-1)); //Get the size of the first line of the triangle (Arithmetic Progression)

        //Iterate through each horizontal line that will be drawn
        for(int i=0; i<n; i++){
                //Do not draw the first line of the inverted triangle
                if(i!=0) {
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


    //Method to draw a complete diamond.
    public static String drawDiamond(int n){
        return drawUpperPartDiamond(n)+"\n"+ drawLowerPartDiamond(n);
    }

    //Method to draw diamond with middle name
    public static String drawDiamondName(int n, String name){
        return drawUpperPartDiamond(n-1)+"\n"+name+"\n"+drawLowerPartDiamond(n);
    }

}
