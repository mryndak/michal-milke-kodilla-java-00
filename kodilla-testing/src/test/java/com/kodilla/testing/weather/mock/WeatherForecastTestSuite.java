package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculateForecastWithMock() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        HashMap<Integer, Double> temperaturesMap = new HashMap<Integer, Double>();
        temperaturesMap.put(0,75.5);
        temperaturesMap.put(1,556.2);
        temperaturesMap.put(2,94.8);
        temperaturesMap.put(3,35.2);
        temperaturesMap.put(4,06.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5,quantityOfSensors);
        System.out.println(temperaturesMap);
    }
}
