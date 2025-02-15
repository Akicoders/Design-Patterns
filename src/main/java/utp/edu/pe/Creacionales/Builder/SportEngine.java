package utp.edu.pe.Creacionales.Builder;

public class SportEngine implements  Engine{
    String name;
    String StrenchHords;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void start() {
        System.out.println("fiaummmmm");
    }

    @Override
    public void stop() {
        System.out.println("derrapa epicamente");
    }

    public SportEngine(String name, String strenchHords) {
        this.name = name;
        StrenchHords = strenchHords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrenchHords() {
        return StrenchHords;
    }

    public void setStrenchHords(String strenchHords) {
        StrenchHords = strenchHords;
    }
}
