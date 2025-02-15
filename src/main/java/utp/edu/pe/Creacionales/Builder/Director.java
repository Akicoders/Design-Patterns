package utp.edu.pe.Creacionales.Builder;

public class Director {
   Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    void makeSportsCars(Builder builder) {
        builder.reset();
        builder.setEngine(new SportEngine("10030","IVM"));
        builder.setGPS(true);
        builder.setTripComputer(true);
    }

    void makeSUV(Builder builder){
        builder.reset();
        builder.setEngine(new AutomaticEngine("1000","Tesla"));
        builder.setGPS(true);
        builder.setTripComputer(true);
    }




}
