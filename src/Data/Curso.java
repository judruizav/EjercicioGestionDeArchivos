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
public class Curso {
    public ArrayList<Estudiante> estudiantes;
    public String nombre;
    public int creditos;

    public Curso( String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }
    
    public void addEstudiante(Estudiante e){
      this.estudiantes.add(e);
    }

    public int getCreditos() {
        return creditos;
    }
    
    public int numMujeresCurso(){
      int c=0;
      for(int i=0; i<this.estudiantes.size(); i++){
        if(this.estudiantes.get(i).getGenero()== 'f'){
          c++;      
          }    
        }
      return c;    
    }
    
    
        
}
