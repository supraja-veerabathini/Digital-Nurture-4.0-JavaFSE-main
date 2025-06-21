package forecast;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the initial amount: ");
        double initialAmount = sc.nextDouble(); //this is how much we start with
        System.out.println("please enter the yearly growth rate: ");
        double yearlyGrowthRate = sc.nextDouble(); //guessing  yearly growth
        System.out.println("please enter the total years that we want to calculate amount: ");
        int totalYears = sc.nextInt(); //after 5 year from now

//the  below statements prints
        System.out.println("Recursive Forecast:");
        double futureValue = FinancialForecast.predictFutureValue(initialAmount, yearlyGrowthRate, totalYears);
        System.out.printf("Value after %d years: rupees %.2f\n\n", totalYears, futureValue);

//The below statements prints the more optimized version to predict future values based on past growth rates.
        System.out.println("Optimized Iterative Forecast version:");
        double optimizedValue = FinancialForecast.FutureValueOptimized(initialAmount, yearlyGrowthRate, totalYears);
        System.out.printf("Value after %d years: rupees %.2f\n", totalYears, optimizedValue);
    }
}

