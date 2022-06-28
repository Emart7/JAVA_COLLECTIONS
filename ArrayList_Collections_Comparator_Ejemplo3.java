package co.com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList_Collections_Comparator_Ejemplo3 {

    public static void main(String[] args) {

        String Curso1 = "Geometria";
        String Curso2 = "Matematica";
        String Curso3 = "Estadistica";
        String Curso4 = "Fisica";
        String Curso5 = "Calculo";

        ArrayList<String> cursos = new ArrayList<>();

        cursos.add(Curso1);
        cursos.add(Curso2);
        cursos.add(Curso3);
        cursos.add(Curso4);
        cursos.add(Curso5);

        //Ordenamiento de lista con la clase Collections

//        //Lista actual
//        System.out.println("Lista sin ordenar");
//        System.out.println(cursos + "\n");
//
//        //Ordenar lista por orden alfabetico
//        Collections.sort(cursos);
//
//        //Lista ordenada ascendente
//        System.out.println("Lista actual organizada ascendenteente");
//        System.out.println(cursos + "\n");
//
//        //Lista ordenada descendente
//        Collections.sort(cursos, Collections.reverseOrder());
//        System.out.println("Lista actual organizada descendentemente");
//        System.out.println(cursos + "\n");



//        //Ordenamiento de lista con la clase Comparator
//
//        //Lista ordenada descendentemente
//        cursos.sort(Comparator.reverseOrder());
//        System.out.println("Lista ordenada descendentemente");
//        System.out.println(cursos + "\n");
//
//        //Lista ordenada ascendentemente
//        cursos.sort(Comparator.naturalOrder());
//        System.out.println("Lista ordenada ascendentemente");
//        System.out.println(cursos + "\n");


        //Convirtiendo un ArrayList en List

        List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
        System.out.println("ArrayList convertido a una List ordenada");
        System.out.println(cursosList);


    }

}
