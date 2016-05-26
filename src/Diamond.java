/**
 * Created by droman on 5/25/16.
 */
public class Diamond {


    public static String drawTriangleAsUpperDiamond(boolean diamond, int n){

        String triangle = "";
        int sizeLine = 1;//Size of the starting line of the triangle

        for(int i=n; i>0; i--) {

                if(!(diamond && i==1)){
                    triangle += "\n";
                    //Add empty spaces to center the line
                    for (int j = 0; j < i - 1; j++) {
                        triangle += " ";
                    }

                    //Add the current line to the triangle
                    triangle += Triangle.drawHorizontalLine(sizeLine);
                }
                sizeLine += 2; //Size of the next line increases by two;
            }
        return triangle;
    }

    public static String drawTriangleAsLowerDiamond(boolean diamond, int n){
        String triangle = "";
        int sizeLine = 1 + (2*(n-1));

        for(int i=0; i<n; i++){

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

    public static String drawIsosceles(int n){
        return drawTriangleAsUpperDiamond(false, n);
    }

   public static String drawDiamond(int n){
       return drawTriangleAsUpperDiamond(true, n)+"\n"+Triangle.drawHorizontalLine(1+(2*(n-1)))+"\n"+drawTriangleAsLowerDiamond(true,n);
   }

    public static String drawDiamondName(int n, String name){
        return drawTriangleAsUpperDiamond(true, n)+"\n"+name+"\n"+drawTriangleAsLowerDiamond(true,n);
    }
}
