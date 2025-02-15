package utp.edu.pe.Creacionales.Builder;

public class CarBuilder implements Builder {
    Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.setseats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);

    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.car.setComputer(tripComputer);
    }

    @Override
    public void setGPS(boolean gps) {
       this.car.setGPS(gps);
    }

    public Car getCar() {
        Car car1 = this.car;
        this.reset();
       return car1;
    }
}
