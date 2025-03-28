package utp.edu.pe.Estructurales.Adapter.Adapter;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.InputStreamReader;

import utp.edu.pe.Estructurales.Adapter.Model.Person;

public class Json_Adapter implements InputFile {
    @Override
    public List<Person> readFile(InputStream inputStream)   {
        Gson gson = new GsonBuilder().create();
        Person[] persons = gson.fromJson(new InputStreamReader(inputStream), Person[].class);
        List<Person> list = new ArrayList<>();
        for (Person person : persons) {
            list.add(person);
        }
        return list;
    }

}