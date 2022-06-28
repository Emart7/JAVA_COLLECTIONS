package co.com.collections;

import co.com.collections.model.Alumno;
import co.com.collections.model.Curso;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Equals_HashCode_Ejemplo15 {

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

        System.out.println(listaAlumnos);
        System.out.println(listaAlumnos.contains(alumno1));

        Alumno alumnoNuevo = new Alumno("Andres Julian", "001");

        System.out.println(alumno1.equals(alumnoNuevo));

        System.out.println(Curso1.verificaAlumno(alumnoNuevo));

        Curso1.getAlumnos().stream().sorted(Comparator.comparing(Alumno::getCodigo).reversed()).forEach(alumno -> System.out.println(alumno.getCodigo()));

    }
}
