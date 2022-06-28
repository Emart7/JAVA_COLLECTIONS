package co.com.collections;

import co.com.collections.model.Curso;

import java.util.ArrayList;

public class ArrayList_Objetos_Ejemplo4 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Geometria", 20);
        Curso curso2 = new Curso("Matematica",10);
        Curso curso3 = new Curso("Estadistica",30);
        Curso curso4 = new Curso("Fisica",50);
        Curso curso5 = new Curso("Calculo",40);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);

        System.out.println(cursos);

    }

}
