package Observer;
import WeatherData.Data;

import java.util.ArrayList;
/**
 * Created by slowbro on 18.07.17.
 */
public class MeteorologicalStation implements Subject {
    Data m_data;
    private ArrayList m_observers;

    public MeteorologicalStation(){
        this.m_data = new Data();
        this.m_observers = new ArrayList();
    }

    public void registerObserver(Observer obs){
        if (m_observers.indexOf(obs) < 0) {
            this.m_observers.add(obs);
        }
    }
    public void removeObserver(Observer obs){
        if (m_observers.indexOf(obs) >= 0){
            m_observers.remove(obs);
        }
    }
    public void notifyObserver(){
        for(int i = 0; i != m_observers.size(); ++i){
            ((Observer)m_observers.get(i)).update(m_data);
        }
    }
    public void dataChanged(){
        notifyObserver();
    }

    public void setWeatherData(float temp, float humidity, float pressure){
        m_data.setParams(temp, humidity, pressure);
        dataChanged();
    }

}
