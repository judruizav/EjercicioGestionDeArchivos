/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Universidad {
   public ArrayList<Programa> programas;
   public ArrayList<Estudiante> estudiantes;
   public String nombre;
   public String nit;
   
    public Universidad(String nombre, String nit) {
        this.programas = new ArrayList<Programa>();
        this.estudiantes = new ArrayList<Estudiante>();
        this.nombre = nombre;
        this.nit = nit;
    }
    
    public void addEstudiante(int edad, String nombre, char genero, Date fechaDeNacimiento, int codigo){
      Estudiante estudiante= new Estudiante(edad,nombre,genero,fechaDeNacimiento, codigo);
      this.estudiantes.add(estudiante);
    }
    
    public void addPrograma(String nombre, String departamento){
      Programa programa= new Programa(nombre, departamento);
      this.programas.add(programa);
    }
   
    public int numEstudiantesUniversidad(){
      return this.estudiantes.size();
    }
    
    public int promedioEdad(){
      int c=0;
      for(int i=0; i<this.estudiantes.size(); i++){
        c+=this.estudiantes.get(i).getEdad();
      }
      return c/this.estudiantes.size();
    }
   
}
