package co.com.collections;

import java.util.ArrayList;

public class ArrayList_For_Each_Lambda_Ejemplo2 {

    public static void main(String[] args) {

        String variable1 = "Clase 1";
        String variable2 = "Clase 2";
        String variable3 = "Clase 3";
        String variable4 = "Clase 4";
        String variable5 = "Clase 5";

        ArrayList<String> lista2 = new ArrayList<>();

        lista2.add(variable1);
        lista2.add(variable2);
        lista2.add(variable3);
        lista2.add(variable4);
        lista2.add(variable5);

        for(int i = 0; i < lista2.size(); i++){
            System.out.println("Recorriendo elementos con for: ");
            System.out.println(lista2.get(i));
        }

        for(String clase : lista2){
            System.out.println("Recorriendo elementos con foreach: ");
            System.out.println(clase);
        }

        lista2.forEach(clase -> {
            System.out.println("Recorriendo elementos con lambda: ");
            System.out.println(clase);
        });

    }
}
