package forecast;

public class FinancialForecast {

    // Here I used recursive method to simplify the prediction of future value
    public static double predictFutureValue(double presentValue, double growth, int yrs) {
        if (yrs == 0) {
            return presentValue;
        }
        return predictFutureValue(presentValue * (1 + growth), growth, yrs - 1);
    }
    //the above method uses recursion to calculate the future values based on past growth rates.
    // And it can be done in other ways.

    // This is the more optimized version using iterative approach to avoid excessive computation as mentioned.
    public static double FutureValueOptimized(double presentValue, double growth, int yrs) {
        for (int i = 0; i < yrs; i++) {
            presentValue *= (1 + growth);
        }
        return presentValue;
    }
}
