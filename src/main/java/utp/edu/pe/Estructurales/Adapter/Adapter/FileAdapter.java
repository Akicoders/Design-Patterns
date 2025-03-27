package utp.edu.pe.Estructurales.Adapter.Adapter;
import java.io.InputStream;
import java.util.List;
import utp.edu.pe.Estructurales.Adapter.Model.Person;

public class FileAdapter  {
    private InputFile inputFile;

    public FileAdapter(InputFile inputFile) {
        this.inputFile = inputFile;
    }

    public List<Person> readFile(InputStream inputStream) {
        return inputFile.readFile(inputStream); 
    }
    
}
