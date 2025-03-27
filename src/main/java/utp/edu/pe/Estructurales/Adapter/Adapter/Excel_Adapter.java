package utp.edu.pe.Estructurales.Adapter.Adapter;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utp.edu.pe.Estructurales.Adapter.Model.Person;

public class Excel_Adapter implements InputFile {
    
    @Override
    public List<Person> readFile(InputStream inputStream)  {
        try{
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            List<Person> persons = new ArrayList<>();
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row row = sheet.getRow(i);
                int cellCount = row.getFirstCellNum();

                Person person = new Person();
                person.setName(String.valueOf(row.getCell(cellCount)));
                person.setLastName(String.valueOf(row.getCell(++cellCount)));
                person.setEmail(String.valueOf(row.getCell(++cellCount).getStringCellValue()));
                persons.add(person); 
                  
            }
            workbook.close();
            return persons;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
         
}
