package utp.edu.pe.Creacionales.Builder;

public class Car {
    @Override
    public String toString() {
        return "Car{" +
                "GPS=" + GPS +
                ", Computer=" + Computer +
                ", seats=" + seats +
                ", engine=" + engine +
                '}';
    }

    boolean GPS;
    boolean Computer;
    int seats;
    Engine engine;

    public Car() {
    }

    public Car(boolean GPS, boolean computer, int seats, Engine engine) {
        this.GPS = GPS;
        Computer = computer;
        this.seats = seats;
        this.engine = engine;
    }

    public boolean isGPS() {
        return GPS;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public boolean isComputer() {
        return Computer;
    }

    public void setComputer(boolean computer) {
        Computer = computer;
    }

    public int getseats() {
        return seats;
    }

    public void setseats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
