package BuilderExample;

import BuilderExample.builders.CarBuilder;
import BuilderExample.builders.CarManualBuilder;
import BuilderExample.cars.Car;
import BuilderExample.cars.Manual;
import BuilderExample.director.Director;

public class Main {

    public static void main(String[] args) {
	    Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built : \n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar Manual built : \n" + carManual.print());
    }
}
