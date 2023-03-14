package d.problem;

public class WeatherAggregator {

    // 의존성 법칙
    // #1 high & low level modules depends on abstraction
    // #2 details depends on abstraction

    // 문제점
    // WeatherAggregator가 AccuweahterApi와 BbcWeatherApi에 의존한다.

    private AccuweatherApi accuweatherApi = new AccuweatherApi();
    private BbcWeatherApi bbcWeatherApi = new BbcWeatherApi();

    public double getTemperature() {
        return (accuweatherApi.getTemperatureCelsius() + toCelsius(bbcWeatherApi.getTemperatureFahrenheit())) / 2;
    }

    private double toCelsius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}
