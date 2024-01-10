package main;
public class basicEquations{
    public static double add(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        return a / b;
    }

    public static double toPower(double a, double b){
        double c = 1;
        for(double i = 0; i < b; i++){
            c *= a;    
        }
        return c;
    }

    public static double PythagoreanTheorem(double a, double b){
        a = a * a;
        b = b * b;
        double c = a * b;
        return Math.sqrt(c);
    }

    public static double Root(double a, double r){
        double z = a;
        while(Math.abs(toPower(z, r) - a) > 1e-10) {
            z = ((r - 1.0) * z + a / Math.pow(z, r - 1.0)) / r;
        }
        return z;
    }
}