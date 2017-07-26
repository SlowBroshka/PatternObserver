package Visualisations;

import Display.Display;
import Observer.*;
import WeatherData.Data;

/**
 * Created by slowbro on 18.07.17.
 */
public class CurrentDisplay implements Observer, Display {
    private Data m_data;
    private Subject m_meteorolicalStation;

    public CurrentDisplay(Subject sub){
        this.m_meteorolicalStation = sub;
        m_meteorolicalStation.registerObserver(this);
        this.m_data = new Data();
    }

    public void update(Data data){
        this.m_data = data;
        display();
    }
    public void display(){
        System.out.println("------------------------------");
        System.out.println("Current Tempreture: " + this.m_data.getTempreture());
        System.out.println("Current Humidity: " + this.m_data.getHumidity());
        System.out.println("------------------------------\n");

    }

}
