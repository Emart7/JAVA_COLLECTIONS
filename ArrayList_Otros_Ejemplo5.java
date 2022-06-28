package co.com.collections;

import co.com.collections.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList_Otros_Ejemplo5 {

    public static void main(String[] args) {

        Curso Curso1 = new Curso ("Java",20);
        Curso Curso2 = new Curso("JavaScript",10);
        Curso Curso3 = new Curso("Golang",30);
        Curso Curso4 = new Curso("Python",50);
        Curso Curso5 = new Curso("Php",40);

        ArrayList<Curso> cursosProgramacion = new ArrayList<>();
        cursosProgramacion.add(Curso1);
        cursosProgramacion.add(Curso2);
        cursosProgramacion.add(Curso3);
        cursosProgramacion.add(Curso4);
        cursosProgramacion.add(Curso5);

//        System.out.println("Sin ordenar");
//        System.out.println(cursosProgramacion + "\n");
//
//        //Orden ascendente
//        Collections.sort(cursosProgramacion);
//
//        System.out.println("Ordenado ascendentemente");
//        System.out.println(cursosProgramacion + "\n");
//
//        //Orden descendente
//        Collections.sort(cursosProgramacion,Collections.reverseOrder());
//        System.out.println("Ordenado descendentemente");
//        System.out.println(cursosProgramacion + "\n");

        //Sin implementar la clase Comparable
        cursosProgramacion.sort(Comparator.comparing(Curso::getNombre));
        System.out.println("Ordenado ascendentemente con la clase Comparator");
        System.out.println(cursosProgramacion + "\n");


        //Implementando la clase Collections y comparing
        Collections.sort(cursosProgramacion,Comparator.comparing(Curso::getNombre));
        System.out.println("Ordenado ascendentemente con la clase Collections y comparing");
        System.out.println(cursosProgramacion + "\n");

        //Implementando la clase Collections y comparing
        Collections.sort(cursosProgramacion,Comparator.comparing(Curso::getNombre).reversed());
        System.out.println("Lista invertida con la clase Collections y comparing");
        System.out.println(cursosProgramacion + "\n");

        //Implementando stream
        List<Curso> cursoList5 = cursosProgramacion.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Php")).sorted(Comparator.comparing(Curso::getNombre)).collect(Collectors.toList());
        System.out.println("Lista Implementando stream");
        System.out.println(cursoList5 + "\n");

    }

}
