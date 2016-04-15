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
public class Programa {
    public ArrayList<Curso> cursos;
    public String nombre;
    public String departamento;

    public Programa(String nombre, String departamento) {
        this.cursos = new ArrayList<Curso>();
        this.nombre = nombre;
        this.departamento = departamento;
    }
    
    public void addCurso(String nombre, int creditos){
       Curso curso = new Curso(nombre,creditos);
       this.cursos.add(curso);
    }
    
    public int creditosPrograma(){
      int c=0;
      for(int i=0; i<this.cursos.size(); i++){
        c+=this.cursos.get(i).getCreditos();
      }
      return c;    
    }
    
    
}
