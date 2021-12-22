package BuilderExample.builders;

import BuilderExample.cars.CarType;
import BuilderExample.components.Engine;
import BuilderExample.components.GPSNavigator;
import BuilderExample.components.Transmission;
import BuilderExample.components.TripComputer;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
