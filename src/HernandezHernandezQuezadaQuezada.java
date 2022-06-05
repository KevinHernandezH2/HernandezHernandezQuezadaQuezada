
import static java.lang.Math.log;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Clase main
public class HernandezHernandezQuezadaQuezada {

    public static void main(String[] args) {
        int opcion;
        //conectandose a la base de datos
        Conexion.pruebaConex();
        //scanner para capturar datos 
        Scanner s = new Scanner(System.in);
        //scanner para capturar opciones
        Scanner n = new Scanner(System.in);
        //Llamando atributos
        String nombre = "", apellido = "", Grado = "", Seccion = "", Direccion = "", AntioNuevoIngreso = "", NombreDeEncargado = "", ApellidoDeEncargado = "", Aula = "";
        int Edad = 0, FechaDeNacimiento = 0, NumeroDeEncargado = 0, Costo = 0, NoControl = 0;
        System.out.println("Bienvenid@");
        //Opciones
        System.out.println("Opciones de Consultas");
        System.out.println("1- Registrar un Alumno");
        System.out.println("2- Mostrar la tabla de Alumnos");
        System.out.println("3- Eliminar registro de un Alumno");
        System.out.println("4- Asistencia");
        System.out.println("5- Salir");
        System.out.println("");
        System.out.println("Elija el número de la consulta que desea: ");
        opcion = n.nextInt();
        //condicion if y else para que se cumplan los distintos casos 
        if (opcion == 1) {
            //Entrada de metodo Trycatch para el control del uso inadecuado de digitos o datos
            try {

                System.out.println("Escriba el nombre del Alumno : ");
                nombre = s.nextLine();
                System.out.println("Escriba el apellido del Alumno : ");
                apellido = s.nextLine();
                System.out.println("Escriba la edad del Alumno : ");
                Edad = s.nextInt();
                System.out.println("Escriba la fecha de nacimiento del Alumno : ");
                FechaDeNacimiento = s.nextInt();
                System.out.println("Escriba el Grado del Alumno : ");
                Grado = s.nextLine();
                s.nextLine();
                System.out.println("Escriba la seccion del Alumno : ");
                Seccion = s.nextLine();
                System.out.println("Escriba la direccion del Alumno : ");
                Direccion = s.nextLine();
                System.out.println("Escriba si es antiguo o nuevo ingreso Alumno : ");
                AntioNuevoIngreso = s.nextLine();
                System.out.println("Escriba el nombre de encargado de Alumno : ");
                NombreDeEncargado = s.nextLine();
                System.out.println("Escriba el apellido de encargado de Alumno : ");
                ApellidoDeEncargado = s.nextLine();
                System.out.println("Escriba el numero telefonico del encargado  : ");
                NumeroDeEncargado = s.nextInt();
                System.out.println("Escriba el costo de colegiatura : ");
                Costo = s.nextInt();
                System.out.println("Escriba el numero de control o ID: ");
                NoControl = s.nextInt();
                System.out.println("Escriba el Aula: ");
                Aula = s.nextLine();
                Alumno alumno = new Alumno(nombre, apellido, Edad, FechaDeNacimiento, Grado, Seccion, Direccion, AntioNuevoIngreso, NombreDeEncargado, ApellidoDeEncargado, NumeroDeEncargado, Costo, NoControl, Aula);
                alumno.Registrar(alumno);

            } catch (Exception err) {
                System.out.println("El dato que ingreso no es valido");
                System.exit(0);
            }

        } else if (opcion == 2) {
            List<Alumno> lista = new ArrayList<>();
            Alumno AlumnoRead = new Alumno();

            lista = AlumnoRead.MostrarTabla();
            System.out.println("*Nombre*    " + "*apellido*    " + "*Edad*   " + "*FechaDeNacimiento*   " + "*Grado*  " + "*Seccion*");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getNombre() + "       " + lista.get(i).getApellidos() + "    " + lista.get(i).getEdad() + "      " + lista.get(i).getFechaDeNacimiento() + "      " + lista.get(i).getGrado() + "          " + lista.get(i).getSeccion());
            }
        } else if (opcion == 3) {
            try {
                int NumeroDeDato;
                Alumno alumnoEliminar = new Alumno();
                System.out.println("Digite el Numero de control o ID del alumno que desea eliminar ");
                NumeroDeDato = s.nextInt();
                System.out.println(alumnoEliminar.EliminarRegistro(NumeroDeDato));
            } catch (Exception e) {
                System.out.println("Digito un dato que no es valido");
            }

        } else if (opcion == 4) {

            int asistencia, faltas;
            Asistencias asis = new Asistencias();

            System.out.println("Digite las asistencias del Alumno durante el mes");
            asistencia = s.nextInt();
            System.out.println("Digite las faltas del Alumno durante el mes");
            faltas = s.nextInt();

            asis.AsistenciasTotales(asistencia, faltas);
        } else if (opcion == 5) {
            System.exit(0);
        } else {
            System.out.println("Opcion no Valida ");
        }

    }

}

/*Programa       :Saludos
Programadores    :Kevin Hernandez, Luis quezada
Descripcion      :Lab2 periodo3
Fecha De Actualizacion :Miercoles 1 de junio de 2022
Revision         : ninguna
*/
    

