/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.util.Date;
/**
 *
 * @author Estudiante
 */
public class Estudiante {
    public int edad;
    public String nombre;
    public char genero;
    public Date fechaDeNacimiento;
    public int codigo;

    public Estudiante(int edad, String nombre, char genero, Date fechaDeNacimiento, int codigo) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.codigo = codigo;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
    
    
    
    
}
