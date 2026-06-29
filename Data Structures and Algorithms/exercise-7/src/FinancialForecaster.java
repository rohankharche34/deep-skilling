class FinancialForecaster {

    static double forecast(double presentValue, double growthRate, int periods) {
        if (periods == 0) return presentValue;
        return forecast(presentValue, growthRate, periods - 1) * (1 + growthRate);
    }

    static double forecastMemo(double presentValue, double growthRate, int periods, double[] memo) {
        if (periods == 0) return presentValue;
        if (memo[periods] != 0) return memo[periods];
        memo[periods] = forecastMemo(presentValue, growthRate, periods - 1, memo) * (1 + growthRate);
        return memo[periods];
    }
}
