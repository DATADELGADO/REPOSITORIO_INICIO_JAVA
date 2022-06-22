package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Coleccion2 {

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<Alumno>();
        System.out.printf("%14s  %-14s%8s%14s%17s\n", "IDENTIFICADOR", "NOMBRE", "ESTATURA", "EDAD", "ESTADO EDAD");
        System.out.printf("%14s  %-14s%8s%14s%17s\n", "-------------", "------", "--------", "----", "-----------");

        for (int i = 1; i <= 200; i++) {
            Alumno x = new Alumno(i, Metodos.nombreAleatorio(), Metodos.estaturaAleatorio(), Metodos.edad());
            alumnos.add(x);
            System.out.printf("%14d  %-14s%8.2f%14d%17s\n",x.getIdalumno(), x.getNombre(), x.getEstatura(), x.getEdad(), x.estadoEdad());

        }

    }

}

/*Crear una colección de objetos de tipo alumno, donde alumno tiene como 
atributos IdAlumno, Nombre, Estatura.
y un método que me permite determinar si el alumno es mayor o menor de edad
la colección tendra IdAlumno incremental 1... el nombre será aleatorio así
como la estatura.
Para los nombres aleatorios tendremos que sacarla de esta lista {"Luis","Miguel","Carmen","Carlos","Arturo"}
Para las estaturas aleatorias tendremos el rango [1.65, 1.66, 1.67, 1.68, 1.69, 1.70, 1.72, 1.72, 1.73]

Al final debe mostrar toda la información de los alumnos.

Se debe generar 200 alumnos.*/
