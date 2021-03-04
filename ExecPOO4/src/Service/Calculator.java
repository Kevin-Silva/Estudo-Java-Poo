package Service;

public class Calculator {

    public static final double IOF = 0.06;

    public static double currenceConverter(double dollarPrice, double dollarToBeBought ){
        return dollarPrice * dollarToBeBought * (1 + IOF);
    }
}
