package WeatherData;

/**
 * Created by slowbro on 18.07.17.
 */
public class Data implements WeatherData {
    private float m_tempreature;
    private float m_humidity;
    private float m_pressure;

    public Data(float temp, float humidity, float pressure){
        this.m_tempreature = temp;
        this.m_humidity = humidity;
        this.m_pressure = pressure;
    }
    public Data() {
    }

    public float getTempreture(){
        return this.m_tempreature;
    }

    @Override
    public float getHumidity() {
        return this.m_humidity;
    }
    @Override
    public float getPressure() {
        return this.m_pressure;
    }

    @Override
    public void setZeros() {
        this.m_pressure = 0;
        this.m_humidity = 0;
        this.m_tempreature = 0;
    }

    @Override
    public void addParams(float temp, float humidity, float pressure) {
        this.m_tempreature += temp;
        this.m_humidity += humidity;
        this.m_pressure += pressure;
    }

    @Override
    public void setParams(float temp, float humidity, float pressure) {
        this.m_tempreature = temp;
        this.m_humidity = humidity;
        this.m_pressure = pressure;

    }
}
