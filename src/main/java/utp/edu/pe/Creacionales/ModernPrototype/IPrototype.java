package utp.edu.pe.Creacionales.ModernPrototype;

public interface IPrototype<T extends IPrototype> extends Cloneable {
    T Clone(); // Simple Clone
    T deepClone();

}
