public class Main {
    public static void main(String[] args) {
        double pv = 1000;
        double rate = 0.05;
        int periods = 10;

        double result = FinancialForecaster.forecast(pv, rate, periods);
        System.out.printf("Future value after %d periods: $%.2f%n", periods, result);

        double[] memo = new double[periods + 1];
        double resultMemo = FinancialForecaster.forecastMemo(pv, rate, periods, memo);
        System.out.printf("Future value (memoized) after %d periods: $%.2f%n", periods, resultMemo);
    }
}
