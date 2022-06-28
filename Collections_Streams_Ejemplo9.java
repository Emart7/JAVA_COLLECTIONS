package co.com.collections;

import co.com.collections.model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Collections_Streams_Ejemplo9 {

    static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {

        Curso Curso1 = new Curso ("Historia",20);
        Curso Curso2 = new Curso("ALgebra",10);
        Curso Curso3 = new Curso("Sociales",30);
        Curso Curso4 = new Curso("Espanhol",50);
        Curso Curso5 = new Curso("Naturales",40);

        ArrayList<Curso> cursosSecundaria = new ArrayList<>();
        cursosSecundaria.add(Curso1);
        cursosSecundaria.add(Curso2);
        cursosSecundaria.add(Curso3);
        cursosSecundaria.add(Curso4);
        cursosSecundaria.add(Curso5);

        //Implementando la clase Collections y comparing
        Collections.sort(cursosSecundaria, Comparator.comparing(Curso::getNombre).reversed());

        //Duracion total y curso de mayor duracion con Collections
        System.out.println("Duracion total y curso de mayor duracion con Collections\n");

        int tiempo = 0;
        for(Curso curso:cursosSecundaria){
            tiempo += curso.getTiempo();
        }

        System.out.println("Tiempo total de cursos: " + tiempo + "\n");

        int numeroMayor = 0;
        for(Curso curso:cursosSecundaria){
            if (curso.getTiempo() > numeroMayor)
                numeroMayor = curso.getTiempo();
        }

        System.out.println("Curso de mayor duracion: " + numeroMayor + "\n");

        //Implementando stream
        List<Curso> cursoList5 = cursosSecundaria.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).sorted(Comparator.comparing(Curso::getNombre)).collect(Collectors.toList());

        System.out.println("Duracion total y curso de mayor duracion con stream\n");

        System.out.println( "Tiempo total de cursos: " + cursosSecundaria.stream().mapToInt(Curso::getTiempo).sum() + "\n");
        System.out.println( "Curso de mayor duracion: " + cursosSecundaria.stream().mapToInt(Curso::getTiempo).max().getAsInt());

    }

}
