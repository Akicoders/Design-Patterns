package utp.edu.pe.Creacionales.Singleton;

import java.sql.*;


// Revisar leer.txt para entender lo que voy a hacer
public class Database {
    private static Database database;
     private Connection connection;

    private  Connection getConnection()  {
        String link = "postgresql://neondb_owner:npg_yClkEqX2OA9D@ep-green-mud-a2dudutm.eu-central-1.aws.neon.tech/neondb?sslmode=require";
        String user="neondb_owner";
        String password="npg_yClkEqX2OA9D";
        String host = "ep-green-mud-a2dudutm.eu-central-1.aws.neon.tech";
        String bd = "neondb";
        String conexion = "jdbc:postgresql://" +host+":5432/"+bd;
        try{
            return DriverManager.getConnection(conexion,user,password) ;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Database()  {
      connection = getConnection();
      if (connection == null) {
          System.out.println("Error de conexion");
      }else {
          System.out.println("conectado");
          System.out.println("Creando la bd con las tablas y datos");
          agregarTablas(connection);
      }


    }
    public static Database getInstance()  {
        if (database == null){
            database = new Database();
        }
        return database;
    }

    public void agregarTablas(Connection connection){
      try(
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT NOW()"))
      {
        while (rs.next()) {
            System.out.println("Conexión exitosa! Fecha y hora del servidor: " + rs.getString(1));
        }
      }catch (SQLException e) {
          e.printStackTrace();
      }
    };

    public void agregarDatos(){};

    public void query(String sql){

    }

}
