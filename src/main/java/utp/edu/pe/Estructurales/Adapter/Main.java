package utp.edu.pe.Estructurales.Adapter;
import utp.edu.pe.Estructurales.Adapter.Adapter.Excel_Adapter;
import utp.edu.pe.Estructurales.Adapter.Adapter.Csv_Adapter;
import utp.edu.pe.Estructurales.Adapter.Adapter.Json_Adapter;
import utp.edu.pe.Estructurales.Adapter.Adapter.FileAdapter;
import utp.edu.pe.Estructurales.Adapter.Adapter.InputFile;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import utp.edu.pe.Estructurales.Adapter.Model.Person;


public class Main {
    private static final String FILE_PATH = "src"+ File.separator + "main"+ File.separator + "java"+ File.separator +"utp"+ File.separator +"edu"+ File.separator +"pe"+ File.separator +"Estructurales"+ File.separator +"Adapter"+ File.separator +"files"+ File.separator;

    public static void main(String[] args) throws FileNotFoundException  {
        InputFile inputFile = new Json_Adapter();
        FileAdapter fileAdapter = new FileAdapter(inputFile);
        InputStream inputStream = new FileInputStream(FILE_PATH + "person.json");
         List<Person> persons =  fileAdapter.readFile(inputStream);
        persons.forEach(person -> System.out.println(person));
    }

}
