/**
 * Created by droman on 5/25/16.
 */

public class Main {
    public static void main(String[] args){

        //Triangle: Exercise 1
        System.out.println(Triangle.drawOneStar()+"\n");

        //Triangle: Exercise 2
        System.out.println(Triangle.drawHorizontalLine(4)+"\n");

        //Triangle: Exercise 3
        System.out.println(Triangle.drawVerticalLine(2)+"\n");

        //Triangle: Exercise 4
        System.out.println(Triangle.drawRightTriangle(5));

        //Diamond: Exercise 1
        System.out.println(Diamond.drawIsosceles(5));

        //Diamond: Exercise 2
        System.out.println(Diamond.drawDiamond(5));

        //Diamond: Exercise 3
        System.out.println(Diamond.drawDiamondName(3,"Billy"));

        //FizzBuzz Exercise
        System.out.println(FizzBuzz.playGame());

        //Prime Factors: Different cases
        System.out.println(PrimeFactors.generate(1));//Base case
        System.out.println(PrimeFactors.generate(89));//Prime number case
        System.out.println(PrimeFactors.generate(10));
        System.out.println(PrimeFactors.generate(49));

    }
}
