package BuilderExample.builders;

import BuilderExample.cars.Car;
import BuilderExample.cars.CarType;
import BuilderExample.components.Engine;
import BuilderExample.components.GPSNavigator;
import BuilderExample.components.Transmission;
import BuilderExample.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(
                this.carType,
                this.seats,
                this.engine,
                this.transmission,
                this.tripComputer,
                this.gpsNavigator
        );
    }
}
