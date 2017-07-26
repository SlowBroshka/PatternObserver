package Observer;

import WeatherData.Data;

/**
 * Created by slowbro on 18.07.17.
 */
public interface Observer {
    public void update(Data data);
}
