package builders;

import cars.Type;
import componets.Engine;
import componets.GPSNavigator;
import componets.Transmission;
import componets.TripComputer;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripConputer(TripComputer tripConputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
