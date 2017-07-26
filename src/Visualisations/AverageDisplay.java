package Visualisations;

import Display.Display;
import Observer.*;
import WeatherData.Data;

/**
 * Created by slowbro on 18.07.17.
 */
public class AverageDisplay implements Observer, Display {
    private Data m_data;
    private int counter;
    private Subject m_weatherData;

    public AverageDisplay(Subject weatherData) {
        this.m_weatherData = weatherData;
        m_weatherData.registerObserver(this);
        this.counter = 0;
        this.m_data = new Data();
        this.m_data.setZeros();
    }
    public void update(Data data){
        this.counter++;
        float av_pressure = data.getPressure() / this.counter;
        float av_tempreature = data.getTempreture() / this.counter;
        float av_humidity = data.getHumidity() / this.counter;
        this.m_data.addParams(av_tempreature, av_humidity, av_pressure);
        display();
    }
    public void display(){
        System.out.println("------------------------------");
        System.out.println("___Average temreture___");
        System.out.println("T: " + this.m_data.getTempreture());
        System.out.println("H: " + this.m_data.getHumidity());
        System.out.println("P: " + this.m_data.getPressure());
        System.out.println("------------------------------\n");
    }
}
