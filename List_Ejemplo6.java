package co.com.collections;

import co.com.collections.model.Aula;
import co.com.collections.model.Curso;

import java.util.ArrayList;

public class List_Ejemplo6 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Java",20);

        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));

        ArrayList<Curso> cursos2 = new ArrayList<>();
        cursos2.add(curso1);

        System.out.println(cursos2.get(0).getAulaList());
        System.out.println(curso1.getAulaList());

    }

}
