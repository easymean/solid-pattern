package d.solution;

public class BbcWeatherApi implements WeatherSourceInf {

    @Override
    public double getTemperatureCelsius() {
        return toCelsius(getTemperatureFahrenheit());
    }

    private double getTemperatureFahrenheit() {
        return 0;
    }

    private double toCelsius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }

}
