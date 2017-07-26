package WeatherData;

/**
 * Created by slowbro on 18.07.17.
 */
//Interface for data
public interface WeatherData {

    public float getTempreture();
    public float getHumidity();
    public float getPressure();
    public void setZeros();
    public void addParams(float temp, float humidity , float pressure);
    public void setParams(float temp, float humidity , float pressure);
}
