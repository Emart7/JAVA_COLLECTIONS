package co.com.collections;

import java.util.ArrayList;

public class ArrayList_Add_Remove_Ejemplo1 {

    public static void main(String[] args) {

        String variable1 = "Ejemplo 1";
        String variable2 = "Ejemplo 2";
        String variable3 = "Ejemplo 3";
        String variable4 = "Ejemplo 4";
        String variable5 = "Ejemplo 5";

        ArrayList<String> lista = new ArrayList<>();

        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);
        lista.add(variable5);

        //Elementos lista actual
        System.out.println("Elementos lista actual");
        System.out.println(lista + "\n");

        //Removiendo item
        System.out.println("Removiendo item");
        lista.remove(2);
        System.out.println(lista + "\n");

        //Cambiando item
        System.out.println("Cambiando item");
        lista.set(2, "Ejemplo alterado");
        System.out.println(lista + "\n");

        //Tamanho de la lista
        System.out.println("Tamanho de lista");
        System.out.println(lista.size());
    }
}
