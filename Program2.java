/*
 * Your name: Dawson Cummings
 * Description: This code classifies all the different parts in math to then be able to be called in by the main function. This code also runs as a benchmark for Program2Test.Java
 */

public class Program2 {

    // TODO #1: finish the method's implementation
    public static double add(double a, double b) {
        return (a+b);
    }

    // TODO #2: finish the method's implementation
    public static double subtract(double a, double b) {
        return (a-b);
    }

    // TODO #3: finish the method's implementation
    public static double multiply(double a, double b) {
        return (a*b);
    }

    // TODO #4: finish the method's implementation
    public static double divide(double a, double b) {
        return (a/b);
    }

    // TODO #5: finish the method's implementation - assume right triangle
    public static double sinOfAngle(double oppSide, double hyp) {
        return (oppSide/hyp);
    }

    // TODO #6: finish the method's implementation - assume right triangle
    public static double hypOfTriangle(double sideA, double sideB) {
        return (Math.sqrt(sideA*sideA + sideB*sideB));
    }


    public static void main(String[] args) {
        System.out.println(add(5,7));
        System.out.println(subtract(54,3));
        System.out.println(multiply(5,7));
        System.out.println(divide(40, 4));
        System.out.println(sinOfAngle(5, 7));
        System.out.println(hypOfTriangle (5.7, 4.6));


    }
}
