package co.com.collections;

import co.com.collections.model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Streams_Ejemplo10 {

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
        Curso Curso6 = new Curso("Geometria",30);
        Curso Curso7 = new Curso("Fisica",20);
        Curso Curso8 = new Curso("Quimica",15);
        Curso Curso9 = new Curso("Geografia",35);
        Curso Curso10 = new Curso("Quimica",15);
        Curso Curso11 = new Curso("Geografia",35);

        ArrayList<Curso> cursosSecundaria = new ArrayList<>();
        cursosSecundaria.add(Curso1);
        cursosSecundaria.add(Curso2);
        cursosSecundaria.add(Curso3);
        cursosSecundaria.add(Curso4);
        cursosSecundaria.add(Curso5);
        cursosSecundaria.add(Curso6);
        cursosSecundaria.add(Curso7);
        cursosSecundaria.add(Curso8);
        cursosSecundaria.add(Curso9);
        cursosSecundaria.add(Curso10);
        cursosSecundaria.add(Curso11);

        //Implementando stream
        System.out.println("Duracion total y curso de mayor duracion con stream\n");

        System.out.println( "Tiempo total de cursos: " + cursosSecundaria.stream().mapToInt(Curso::getTiempo).sum() + "\n");
        System.out.println( "Curso de mayor duracion: " + cursosSecundaria.stream().mapToInt(Curso::getTiempo).max().getAsInt()+ "\n");
        System.out.println( "Curso de menor duracion: " + cursosSecundaria.stream().mapToInt(Curso::getTiempo).min().getAsInt()+ "\n");
        System.out.println( "Curso promedio: " + cursosSecundaria.stream().mapToInt(Curso::getTiempo).average().getAsDouble()+ "\n");

        Map<String, List<Curso>> groupCurso = cursosSecundaria.stream().collect(Collectors.groupingBy(Curso::getNombre));
        groupCurso.forEach((key, value) -> System.out.println(key + " - " + value.size()));
        System.out.println(cursosSecundaria.parallelStream().mapToInt(Curso::getTiempo).sum());
    }

}
