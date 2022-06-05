
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
//Metodos
//clase abstracta
public abstract class Matricula {

    public Matricula(String nombre, String apellidos, int Edad, int FechaDeNacimiento, String Grado, String Seccion, String Direccion, String AntiguoNuevoIngreso, String NombreDeEncargado, String ApellidoEncargado, int NumeroDeEncargado, int Costo, int NoControl, String Aula) {
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
//Creando los metodosget and set

    public Matricula() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getAntiguoNuevoIngreso() {
        return AntiguoNuevoIngreso;
    }

    public void setAntiguoNuevoIngreso(String AntiguoNuevoIngreso) {
        this.AntiguoNuevoIngreso = AntiguoNuevoIngreso;
    }

    public String getNombreDeEncargado() {
        return NombreDeEncargado;
    }

    public void setNombreDeEncargado(String NombreDeEncargado) {
        this.NombreDeEncargado = NombreDeEncargado;
    }

    public String getApellidoEncargado() {
        return ApellidoEncargado;
    }

    public void setApellidoEncargado(String ApellidoEncargado) {
        this.ApellidoEncargado = ApellidoEncargado;
    }

    public int getNumeroDeEncargado() {
        return NumeroDeEncargado;
    }

    public void setNumeroDeEncargado(int NumeroDeEncargado) {
        this.NumeroDeEncargado = NumeroDeEncargado;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getNoControl() {
        return NoControl;
    }

    public void setNoControl(int NoControl) {
        this.NoControl = NoControl;
    }

    public String getAula() {
        return Aula;
    }

    public void setAula(String Aula) {
        this.Aula = Aula;
    }

    //Atributos
    public String nombre;
    public String apellidos;
    public int Edad;
    public int FechaDeNacimiento;
    public String Grado;
    public String Seccion;
    public String Direccion;
    public String AntiguoNuevoIngreso;
    public String NombreDeEncargado;
    public String ApellidoEncargado;
    public int NumeroDeEncargado;
    public int Costo;
    public int NoControl;
    public String Aula;

// }
    public abstract int Registrar(Object c);

    public abstract List MostrarTabla();

    public abstract int EliminarRegistro(int A);

    public abstract int AsistenciasTotales(int b);

}


/*Programa       :Saludos
Programadores    :Kevin Hernandez, Luis quezada
Descripcion      :Lab2 periodo3
Fecha De Actualizacion :Miercoles 1 de junio de 2022
Revision         : ninguna
*/

    



