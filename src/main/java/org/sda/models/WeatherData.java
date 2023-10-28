package org.sda.models;
import javax.persistence.*;
import java.util.Date;
@Entity

public class WeatherData {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Date date;
    public WeatherData(Long id, Date date, double temperature, double humidity, double pressure, double winddirection, double windspeed) {
        this.id = id;
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.winddirection = winddirection;
        this.windspeed = windspeed;
    }
    private double temperature;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public double getHumidity() {
        return humidity;
    }
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
    public double getPressure() {
        return pressure;
    }
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
    public double getWinddirection() {
        return winddirection;
    }
    public void setWinddirection(double winddirection) {
        this.winddirection = winddirection;
    }
    public double getWindspeed() {
        return windspeed;
    }
    public void setWindspeed(double windspeed) {
        this.windspeed = windspeed;
    }
    private double humidity;
    @Override
    public String toString() {
        return "WeatherData{" +
                "id=" + id +
                ", date=" + date +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", winddirection=" + winddirection +
                ", windspeed=" + windspeed +
                '}';
    }
    private double pressure;
    private double winddirection;
    private double windspeed;
}
}
