package utp.edu.pe.Estructurales.Adapter.Adapter;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.util.ArrayList;
import utp.edu.pe.Estructurales.Adapter.Model.Person;


public class Csv_Adapter implements InputFile {
    @Override
    public List<Person> readFile(InputStream inputStream) {
        try {
            
            Reader reader = new InputStreamReader(inputStream);
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
            List<Person> persons = new ArrayList<>();
            String[] line; 
            while ((line = csvReader.readNext()) != null) {
                Person person = new Person();
                person.setName(line[0]);
                person.setLastName(line[1]);
                person.setEmail(line[2]);
                persons.add(person);
            }
            return persons;
        }catch (Exception e)  {
            throw new RuntimeException(e);
        }

        
    }
    
    
} 
