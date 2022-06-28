package co.com.collections;

import co.com.collections.model.Alumno;
import co.com.collections.model.Curso;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

public class Map_Ejemplo19 {

    // TODO: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Collection.html
    // TODO: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Set.html
    //Ventajas de set: elimina los datos duplicados
    //Desventajas: no hay un indice de lista, es menos eficiente al buscar un dato por lo que hay qe recorerlo

    public static void main(String[] args) {

        Curso curso1 = new Curso ("Historia",20);

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

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);
        curso1.addAlumno(alumno8);
        curso1.addAlumno(alumno9);

//        Curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));
        System.out.println();

        Alumno alumnoMap = curso1.getAlumnoMap().get("003");

        curso1.getAlumnoMap().forEach((codigo, alumno) -> {
            System.out.println(alumno);
        });


        System.out.println();
        System.out.println("Adicional");
        curso1.getAlumnoMap().put("008", new Alumno("Juan Miguel", "008") );
        curso1.getAlumnoMap().put("009", new Alumno("Maria Jose", "009") );
        curso1.getAlumnoMap().put("010", new Alumno("Luis Pedro", "010") );

        curso1.getAlumnoMap().forEach((codigo, alumno) -> {
            System.out.println(alumno);
        });

//        System.out.println(alumnoMap);

    }
}
