package org.sda.dao;

import org.sda.models.Location;
import org.sda.models.WeatherData;

import java.util.List;
import java.util.UUID;

public interface WeatherDataDao {
    WeatherData findById(UUID id);
    List<WeatherData> findByLocation(Location location);
    public void save(WeatherData weatherData);
    public void update(WeatherData weatherData);
    public void delete (WeatherData weatherData);

}
