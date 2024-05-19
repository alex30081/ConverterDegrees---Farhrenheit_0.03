package app;


public class Main {

    private static double CONV_F_C = 0;


    public static void main(String[] args) {
        System.out.println("My converter degrees Fahrenheit to Celsius.");

        double F = 32;
        double celsius = convFrToCe(F);
        System.out.println("Result is " + celsius + "° celsius.");
    }

    private static double convFrToCe(double F) {
        return CONV_F_C = ((F - 32) * 5) / 9;

    }
}
