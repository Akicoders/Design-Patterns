package utp.edu.pe.Creacionales.Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder CarBuilder = new CarBuilder();
        director.makeSportsCars(CarBuilder);
        Car car = CarBuilder.getCar();
        System.out.println(car.toString());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.makeSportsCars(manualBuilder);
        Manual manual =manualBuilder.getManual();
        System.out.println(manual.getDoc());
        System.out.println(manual.getCarac());

    }
}
