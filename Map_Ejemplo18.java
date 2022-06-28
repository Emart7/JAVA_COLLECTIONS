package co.com.collections;

import co.com.collections.model.Alumno;
import co.com.collections.model.Curso;

import java.util.*;

public class Map_Ejemplo18 {

    // TODO: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Collection.html
    // TODO: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Set.html
    //Ventajas de set: elimina los datos duplicados
    //Desventajas: no hay un indice de lista, es menos eficiente al buscar un dato por lo que hay qe recorerlo

    public static void main(String[] args) {

        Curso Curso1 = new Curso ("Historia",20);

        Alumno alumno1 = new Alumno("Andres Julian", "001");
        Alumno alumno2 = new Alumno("Gustavo Adolfo", "002");
        Alumno alumno3 = new Alumno("Carlos Federico", "003");
        Alumno alumno4 = new Alumno("Ruben Eduardo", "004");
        Alumno alumno5 = new Alumno("Jhon Jairo", "005");
        Alumno alumno6 = new Alumno("Ana Maria", "006");
        Alumno alumno7 = new Alumno("Luz Veronica", "007");
        Alumno alumno8 = new Alumno("Angie Juliana","008");
        Alumno alumno9 = new Alumno("Ines Marcela", "009");

        Collection<Alumno> listaAlumnos = new HashSet<>();

        //Para que funcione o valide de forma similar al HasSet, se debe implementar y sobreescribir el metodo hashCode
//        Collection<Alumno> listaAlumnos = new ArrayList<>();

        Curso1.addAlumno(alumno1);
        Curso1.addAlumno(alumno2);
        Curso1.addAlumno(alumno3);
        Curso1.addAlumno(alumno4);
        Curso1.addAlumno(alumno5);
        Curso1.addAlumno(alumno6);
        Curso1.addAlumno(alumno7);
        Curso1.addAlumno(alumno8);
        Curso1.addAlumno(alumno9);

//        Curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));
        System.out.println();

        Optional<Alumno> alumno = Curso1.getAlumnos().stream().filter(a -> "003".equalsIgnoreCase(a.getCodigo())).findFirst();
        if (alumno.isPresent()){
            System.out.println(alumno.get());
        }

        Alumno alumnoMap = Curso1.getAlumnoMap().get("003");

        System.out.println(alumnoMap);

    }
}
