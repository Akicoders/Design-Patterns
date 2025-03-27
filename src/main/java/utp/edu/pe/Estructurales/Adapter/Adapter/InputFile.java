package utp.edu.pe.Estructurales.Adapter.Adapter;
import java.io.InputStream;
import java.util.List;
import utp.edu.pe.Estructurales.Adapter.Model.Person;


public interface InputFile {
    List<Person> readFile(InputStream inputStream);
}
