import Observer.MeteorologicalStation;
import Visualisations.AverageDisplay;
import Visualisations.CurrentDisplay;

/**
 * Created by slowbro on 18.07.17.
 */
public class Main {

    static public void main(String[] args){
        MeteorologicalStation wd = new MeteorologicalStation();

        CurrentDisplay currentDisplay = new CurrentDisplay(wd);
        AverageDisplay averageDisplay = new AverageDisplay(wd);

        wd.setWeatherData(80, 65, 70);
        wd.setWeatherData(28, 5, 0);
        wd.setWeatherData(31, 13, 50);

        wd.removeObserver(currentDisplay);
        wd.setWeatherData(31, 13, 50);
    }
}
