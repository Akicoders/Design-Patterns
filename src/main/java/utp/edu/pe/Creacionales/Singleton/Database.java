package utp.edu.pe.Creacionales.Singleton;

import java.sql.*;


// Revisar leer.txt para entender lo que voy a hacer
public class Database {

    private static Database database;
     private Connection connection;

    private  Connection getConnection()  {
        String link = "postgresql://neondb_owner:npg_nf23EijDsFIm@ep-lucky-math-a2m72qpr.eu-central-1.aws.neon.tech/neondb?sslmode=require";
        String user="neondb_owner";
        String password="npg_nf23EijDsFIm";
        String host = "ep-lucky-math-a2m72qpr.eu-central-1.aws.neon.tech";
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
          add_tables_with_data(connection);
      }


    }
    public static Database getInstance()  {
        if (database == null){
            database = new Database();
        }
        return database;
    }

    public void add_tables_with_data (Connection connection){
      try(Statement statement = connection.createStatement())
      {

        statement.execute("DROP TABLE IF EXISTS productos CASCADE");
        
        /* Crear Tabla Productos */
        statement.execute("CREATE TABLE productos (" +
                "id SERIAL PRIMARY KEY, " +
                "nombre VARCHAR(100) NOT NULL, " +
                "precio DECIMAL(10, 2) NOT NULL, " +
                "categoria VARCHAR(50), " +
                "fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP, " +
                "disponible BOOLEAN DEFAULT TRUE)");
        
        /* Insertar datos en Productos */
        statement.execute("INSERT INTO productos (nombre, precio, categoria) VALUES " +
                "('Laptop Gaming RGB', 1299.99, 'Electrónicos'), " +
                "('Smartphone Ultra', 899.50, 'Móviles'), " +
                "('Auriculares Inalámbricos', 129.99, 'Accesorios'), " +
                "('Monitor Curvo 32\"', 349.99, 'Electrónicos'), " +
                "('Teclado Mecánico', 89.99, 'Periféricos')");
        
        /* Aca solo es para mostrarte en pantalla los datos agregados */
        try (ResultSet rs = statement.executeQuery(
                "SELECT categoria, COUNT(*) as cantidad, " +
                "ROUND(AVG(precio), 2) as precio_promedio, " +
                "STRING_AGG(nombre, ', ') as productos " +
                "FROM productos " +
                "GROUP BY categoria " +
                "ORDER BY precio_promedio DESC")) {
            
            System.out.println("\n===== RESUMEN DE PRODUCTOS POR CATEGORÍA =====");
            System.out.println("| CATEGORÍA     | CANTIDAD | PRECIO PROMEDIO | PRODUCTOS                                |");
            System.out.println("|---------------|----------|-----------------|------------------------------------------|");
            
            while (rs.next()) {
                String categoria = rs.getString("categoria");
                int cantidad = rs.getInt("cantidad");
                double precioPromedio = rs.getDouble("precio_promedio");
                String productos = rs.getString("productos");
                
                System.out.printf("| %-13s | %-8d | $%-14.2f | %-40s |\n", 
                        categoria, cantidad, precioPromedio, 
                        (productos.length() > 40 ? productos.substring(0, 37) + "..." : productos));
            }
            System.out.println("=======================================================");
        }
        
        System.out.println("\nTabla 'productos' creada y datos insertados correctamente!");
        
      } catch (SQLException e) {
          e.printStackTrace();
      }
    };

    public void query(String sql){
        try(Statement statement = connection.createStatement()){
            boolean hasResultSet = statement.execute(sql);
            
            if (hasResultSet) {
                
                try (ResultSet resultSet = statement.getResultSet()) {
                  
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    
                    // Print column headers
                    System.out.println("\n===== QUERY RESULTS =====");
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(metaData.getColumnName(i) + "\t");
                    }
                    System.out.println("\n-------------------------");
                    
                   
                    while (resultSet.next()) {
                        for (int i = 1; i <= columnCount; i++) {
                            System.out.print(resultSet.getString(i) + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println("=========================");
                }
            } else {
               
                int updateCount = statement.getUpdateCount();
                System.out.println("Query executed successfully. Rows affected: " + updateCount);
            }
        }catch (Exception e){
            System.out.println("Error executing query: " + sql);
            e.printStackTrace();
        }
    }
    }
