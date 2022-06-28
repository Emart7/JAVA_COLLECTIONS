package co.com.collections;

import co.com.collections.model.Aula;
import co.com.collections.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class Encapsulamiento_Ejemplo7 {

    public static void main(String[] args) {

        Curso curso3 = new Curso("Python",30);

        curso3.addAula(new Aula("ArrayList"));
        curso3.addAula(new Aula("List"));
        curso3.addAula(new Aula("LinkedList"));
        curso3.addAula(new Aula("Inmutable"));

        List<Aula> aulaList = curso3.getAulaList();

        ArrayList<Curso> curso4 = new ArrayList<>();
        curso4.add(curso3);

        System.out.println(aulaList);

    }

}
