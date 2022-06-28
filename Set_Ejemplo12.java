package co.com.collections;

import java.util.Collection;
import java.util.HashSet;

public class Set_Ejemplo12 {

    // TODO: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Collection.html
    // TODO: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Set.html
    //Ventajas de set: elimina los datos duplicados
    //Desventajas: no hay un indice de lista, es menos eficiente al buscar un dato por lo que hay qe recorerlo

    public static void main(String[] args) {

        String alumno1 = "Andres";
        String alumno2 = "Gustavo";
        String alumno3 = "Federico";
        String alumno4 = "Ruben";
        String alumno5 = "Jhon";
        String alumno6 = "Ana";
        String alumno7 = "Veronica";
        String alumno8 = "Juliana";
        String alumno9 = "Marcela";

//        Set<String> listaAlumnos = new HashSet<>();
        Collection<String> listaAlumnos = new HashSet<>();
//        Collection<String> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);
        listaAlumnos.add(alumno9);

        //#1
        System.out.println("#1");
        for (String alumno : listaAlumnos){
            System.out.println(alumno);
        }

        //# 2
        System.out.println("#2");
        listaAlumnos.forEach(alumno ->{
            System.out.println(alumno);
        });

    }
}
