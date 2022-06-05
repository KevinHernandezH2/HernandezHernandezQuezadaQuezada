
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Felipe
 */
//clase la cual lleva datos y condicionativos para guardar en la base de datos
public class Alumno extends Matricula {

    private ResultSet rs;
    private PreparedStatement ps;
    private Connection cx;

    public Alumno(String nombre, String apellidos, int Edad, int FechaDeNacimiento, String Grado, String Seccion, String Direccion, String AntiguoNuevoIngreso, String NombreDeEncargado, String ApellidoEncargado, int NumeroDeEncargado, int Costo, int NoControl, String Aula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Edad = Edad;
        this.FechaDeNacimiento = FechaDeNacimiento;
        this.Grado = Grado;
        this.Seccion = Seccion;
        this.Direccion = Direccion;
        this.AntiguoNuevoIngreso = AntiguoNuevoIngreso;
        this.NombreDeEncargado = NombreDeEncargado;
        this.ApellidoEncargado = ApellidoEncargado;
        this.NumeroDeEncargado = NumeroDeEncargado;
        this.Costo = Costo;
        this.NoControl = NoControl;
        this.Aula = Aula;
    }

    public Alumno() {
    }

    //Metodo para mandar a guardar datos
    public int Registrar(Object c) {

        int registro = 0;
        String SQL_CREATE = "INSERT INTO alumnos (nombre ,apellidos ,Edad ,FechaDeNacimiento ,Grado ,Seccion ,Direccion , AntiguoNuevoIngreso, NombreDeEncargado, ApellidoEncargado, NumeroDeEncargado, Costo, NoControl, Aula) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_CREATE);
            ps.setString(1, this.getNombre());
            ps.setString(2, this.getApellidos());
            ps.setInt(3, this.getEdad());
            ps.setInt(4, this.getFechaDeNacimiento());
            ps.setString(5, this.getGrado());
            ps.setString(6, this.getSeccion());
            ps.setString(7, this.getDireccion());
            ps.setString(8, this.getAntiguoNuevoIngreso());
            ps.setString(9, this.getNombreDeEncargado());
            ps.setString(10, this.getApellidoEncargado());
            ps.setInt(11, this.getNumeroDeEncargado());
            ps.setInt(12, this.getCosto());
            ps.setInt(13, this.getNoControl());
            ps.setString(14, this.getAula());

            registro = ps.executeUpdate();

            System.out.println("Se registraron datos");
        } catch (Exception e) {
            System.out.println(e);
        }

        return registro;

    }

    public Alumno(ResultSet rs, PreparedStatement ps, Connection cx) {
        this.rs = rs;
        this.ps = ps;
        this.cx = cx;
    }

    //Metodo para mostrar datos guardados
    @Override
    public List MostrarTabla() {
        List<Alumno> lista = new ArrayList<>();

        String SQL_READALL = "SELECT * FROM poobase.alumnos";

        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            System.out.println("lista de alumnos!");
            while (rs.next()) {

                Alumno AlumnosC = new Alumno();

                AlumnosC.setNombre(rs.getString(1));
                AlumnosC.setApellidos(rs.getString(2));
                AlumnosC.setEdad(rs.getInt(3));
                AlumnosC.setFechaDeNacimiento(rs.getInt(4));
                AlumnosC.setGrado(rs.getString(5));
                AlumnosC.setSeccion(rs.getString(6));
                AlumnosC.setDireccion(rs.getString(7));
                AlumnosC.setAntiguoNuevoIngreso(rs.getString(8));
                AlumnosC.setNombreDeEncargado(rs.getString(9));
                AlumnosC.setApellidoEncargado(rs.getString(10));
                AlumnosC.setNumeroDeEncargado(rs.getInt(11));
                AlumnosC.setCosto(rs.getInt(12));
                AlumnosC.setNoControl(rs.getInt(13));
                AlumnosC.setAula(rs.getString(14));

                lista.add(AlumnosC);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        //Poner null para correr el test o poner Lista para mostrar datos en consola
        return null;
    }
//Metodo para eliminar datos 

    @Override
    public int EliminarRegistro(int A) {

        int delete = 0;
        String SQL_DELETE = "DELETE FROM poobase.alumnos WHERE NoControl = ?";
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_DELETE);
            ps.setInt(1, A);
            delete = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return delete;
    }

    @Override
    public int AsistenciasTotales(int b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
    
 


/*Programa       :Saludos
Programadores    :Kevin Hernandez, Luis quezada
Descripcion      :Lab2 periodo3
Fecha De Actualizacion :Miercoles 1 de junio de 2022
Revision         : ninguna
*/

