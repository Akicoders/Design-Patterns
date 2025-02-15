package utp.edu.pe.Creacionales.Builder;

public class AutomaticEngine implements Engine {
    String ForceHorses;
    String name;

    @Override
    public void stop() {
        System.out.println("Despacito tranquilito");
    }

    @Override
    public void start() {
        System.out.println("Jarvis llevame a mi jato :D");
    }

    public AutomaticEngine(String forceHorses, String name) {
        ForceHorses = forceHorses;
        this.name = name;
    }

    public String getForceHorses() {
        return ForceHorses;
    }

    public void setForceHorses(String forceHorses) {
        ForceHorses = forceHorses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
