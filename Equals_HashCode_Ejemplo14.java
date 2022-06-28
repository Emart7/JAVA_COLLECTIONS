package co.com.collections;

import co.com.collections.model.Alumno;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Equals_HashCode_Ejemplo14 {

    // TODO: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Collection.html
    // TODO: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Set.html
    //Ventajas de set: elimina los datos duplicados
    //Desventajas: no hay un indice de lista, es menos eficiente al buscar un dato por lo que hay qe recorerlo

    public static void main(String[] args) {

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

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);
        listaAlumnos.add(alumno9);

        System.out.println(listaAlumnos.contains(alumno1));

        Alumno alumnoNuevo = new Alumno("Andres Julian", "001");

        System.out.println(listaAlumnos.contains(alumnoNuevo));

        System.out.println(alumno1.equals(alumnoNuevo));

    }
}
