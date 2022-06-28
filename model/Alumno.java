package co.com.collections.model;

public class Alumno implements Comparable<Alumno> {

    String nombre;
    String codigo;

    public Alumno(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return  nombre;
    }

    @Override
    public int compareTo(Alumno o){
        return this.nombre.compareTo(o.getNombre());
    }

    @Override
    public boolean equals(Object o) {
        Alumno alumno = (Alumno) o;
        return this.nombre.equals(alumno.getNombre());
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }
}
