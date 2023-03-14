package d.solution;

import java.util.Arrays;

public class WeatherAggregator {

    private WeatherSourceInf[] weatherSources;

    public WeatherAggregator(WeatherSourceInf[] weatherSources) {
        this.weatherSources = weatherSources;
    }


    public double getTemperature() {
        return Arrays.stream(weatherSources)
                .mapToDouble(WeatherSourceInf::getTemperatureCelsius)
                .average()
                .getAsDouble();
    }

}
