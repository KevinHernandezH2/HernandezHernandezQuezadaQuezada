
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Asistencias {

//atributos
    public int asistencia;
    public int faltas;
//Metodos 

    Asistencias() {

    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public Asistencias(int asistencia, int faltas) {
        this.asistencia = asistencia;
        this.faltas = faltas;
    }

    public void AsistenciasTotales(int asistencia, int faltas) {

        if (asistencia >= 30 && faltas == 0) {
            System.out.println("El Alumno tuvo una asistencia excelente");

        } else if (asistencia >= 20 && faltas >= 10) {
            System.out.println("El Alumno tuvo una asistencia Buena");

        } else if (asistencia >= 10 && faltas >= 20) {
            System.out.println("El Alumno tuvo una asistencia Mediocre");

        } else if (asistencia == 0 && faltas >= 30) {
            System.out.println("El Alumno no tuv asistencias reprueba el curso automaticamente...");
        }

    }

}




/*Programa       :Saludos
Programadores    :Kevin Hernandez, Luis quezada
Descripcion      :Lab2 periodo3
Fecha De Actualizacion :Miercoles 1 de junio de 2022
Revision         : ninguna
*/