package BuilderExample.cars;

import BuilderExample.components.Engine;
import BuilderExample.components.GPSNavigator;
import BuilderExample.components.Transmission;
import BuilderExample.components.TripComputer;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(
            CarType carType,
            int seats,
            Engine engine,
            Transmission transmission,
            TripComputer tripComputer,
            GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if(this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return this.carType;
    }

    public double getFuel() {
        return this.getFuel();
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return this.seats;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Transmission getTransmission() {
        return this.transmission;
    }

    public TripComputer getTripComputer() {
        return this.tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return this.gpsNavigator;
    }
}
