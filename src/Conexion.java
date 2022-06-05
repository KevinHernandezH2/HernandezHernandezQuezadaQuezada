
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author kevin
 */
public class Conexion {

    //metodo para enlace a base de datos
    private static final String Link = "jdbc:mysql://localhost:3307/poobase";
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String Usuario = "root";
    private static final String Password = "YES";
    private static Connection conexion = null;

    public static Connection getConexion() {
        try {
            if (conexion == null) {
                Class.forName(Driver);
                conexion = DriverManager.getConnection(Link, Usuario, Password);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }

    //Prueba de Conexion a la base de Datos
    public static void pruebaConex() {
        if (Conexion.getConexion() != null) {
            System.out.println("Conexión a Base de Datos, ha sido correcta");
        } else {
            System.out.println("No se ha podido conectar a la base de datos");
        }

    }

}




    
/*Programa       :Saludos
Programadores    :Kevin Hernandez, Luis quezada
Descripcion      :Lab2 periodo3
Fecha De Actualizacion :Miercoles 1 de junio de 2022
Revision         : ninguna
*/