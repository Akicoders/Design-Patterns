package utp.edu.pe.Creacionales.Builder;

public interface Builder {
   void reset();
   void setSeats(int seats);
   void setEngine(Engine engine);
   void setTripComputer(boolean tripComputer);
   void setGPS(boolean gps);
}
