package utp.edu.pe.Creacionales.Builder;

public class CarManualBuilder implements Builder {
    Manual manual;
    StringBuilder builderDoc = new StringBuilder();
    StringBuilder builderCarac = new StringBuilder();


    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {

       String caracSeats = "The car have a " + seats + " in total" ;
       String docSeats = "these seats are leather ";
       builderCarac.append(caracSeats);
        builderDoc.append(docSeats);

    }

    @Override
    public void setEngine(Engine engine) {
        String caracEngine = "The car have a " + engine.toString();
        String docEngine = "this engine is beautiful ";
        builderCarac.append(caracEngine);
        builderDoc.append(docEngine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
            String caracTripComputer = "The trip have tripComputer: " + tripComputer;
            String docTripComputer = "The tripComputer have screen OLED ";
            builderCarac.append(caracTripComputer);
            builderDoc.append(docTripComputer);
    }

    @Override
    public void setGPS(boolean gps) {
        String caracTripComputer = "The trip have GPS: " + gps;
        String docTripComputer = "The GPS ....... ";
        builderCarac.append(caracTripComputer);
        builderDoc.append(docTripComputer);
    }

    public void writeManual(){
        manual.setCarac(builderCarac.toString());
        manual.setDoc(builderDoc.toString());
    }

    public Manual getManual() {
        writeManual();
        Manual manual = this.manual;
        this.reset();
        return manual;
    }


}
