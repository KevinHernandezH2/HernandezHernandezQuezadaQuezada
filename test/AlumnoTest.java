
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static junit.framework.Assert.assertEquals;
import org.junit.*;

public class AlumnoTest {
//Test para registrar alumno

    @Test
    public void RegistrarAlumnoTest() {
        System.out.println("Registro de alumno o estudiante");

        String nombre = "Manuel", apellido = "Hernandez", Grado = "9", Seccion = "A", Direccion = "Santa Ana", AntioNuevoIngreso = "Nuevo", NombreDeEncargado = "Roberto", ApellidoDeEncargado = "Hernandez", Aula = "21";
        int Edad = 18, FechaDeNacimiento = 020501, NumeroDeEncargado = 75585727, Costo = 25, NoControl = 123456;

        Alumno alumno = new Alumno(nombre, apellido, Edad, FechaDeNacimiento, Grado, Seccion, Direccion, AntioNuevoIngreso, NombreDeEncargado, ApellidoDeEncargado, NumeroDeEncargado, Costo, NoControl, Aula);

        int expResult = 1;
        int Result = new Alumno().Registrar(alumno);
        assertEquals(expResult, Result);
    }
//Test para mostrar datos ingresados

    @Test
    public void MostrarTablaTest() {
        System.out.println("Mostar Alumnos inscritos");

        Object expResult = null;
        List Result = new Alumno().MostrarTabla();
        assertEquals(expResult, Result);

    }
//Test para eliminar persona 

    @Test
    public void EliminarRegistroTest() {
        System.out.println("Desmatricula de alumno");

        int expResult = 1;
        int Result = new Alumno().EliminarRegistro(0);
        assertEquals(expResult, Result);

    }
//prueba asistenicas

    @Test
    public void AsistenciasTotales() {
        System.out.println("Pasando asistencia");
        int expResult = 1;
        int Result = new Alumno().AsistenciasTotales(20);
        assertEquals(expResult, Result);

    }


    
    
    
    
    
    

}

/*Programa       :Saludos
Programadores    :Kevin Hernandez, Luis quezada
Descripcion      :Lab2 periodo3
Fecha De Actualizacion :Miercoles 1 de junio de 2022
Revision         : ninguna
*/