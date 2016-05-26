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

    //Method that would help for building the diamond
    public static String drawinvertedIsosceles(int n){
        String triangle = "";
        int sizeLine = 1 + (2*(n-1)); //Get the longest a line would get in the triangle

        for(int i=0; i<n; i++){
            //Add empty spaces to center the line
            for(int j=0; j < i; j++){
                triangle += " ";
            }

            triangle += Triangle.drawHorizontalLine(sizeLine);

            if(i != n-1) {
                triangle += "\n";
            }

            sizeLine -= 2;

        }

        return triangle;
    }

    public static String drawDiamond(int n){
        return Diamond.drawIsosceles(n)+""+Diamond.drawinvertedIsosceles(n-1);
    }

}
