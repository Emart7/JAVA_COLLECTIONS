package co.com.collections.model;

import java.util.*;

public class Curso implements Comparable<Curso> {

    String nombre;
    int tiempo;
    private List<Aula> aulaList = new LinkedList<>();
//    private Collection<Alumno> alumnos = new LinkedHashSet<>();
    private Collection<Alumno> alumnos = new HashSet<>();

//    private Map<String, Alumno> alumnoMap = new HashMap<>();
    private Map<String, Alumno> alumnoMap = new LinkedHashMap<>();

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso(String nombre, int tiempo, List<Aula> aulaList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.aulaList = aulaList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Aula> getAulaList() {
        return Collections.unmodifiableList(aulaList);
    }

    public void setAulaList(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }

    public Map<String, Alumno> getAlumnoMap() {
        return alumnoMap;
    }

    public void addAula(Aula aula){
        this.aulaList.add(aula);
    }

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
        this.alumnoMap.put(alumno.getCodigo(), alumno);
    }

    public boolean verificaAlumno(Alumno alumno){
       return this.alumnos.contains(alumno);
    }

    @Override
    public String toString() {
        return  nombre + ':' + tiempo + "min";
    }

    @Override
    public int compareTo(Curso o){
        return this.nombre.compareTo(o.getNombre());
    }
}
