/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import Data.Curso;
import Data.Estudiante;
import Data.Programa;
import Data.Universidad;
import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Lectura {
    
    public Date stringToDate(String dateStr){
      DateFormat df= new SimpleDateFormat("dd-MM-yyyy");; 
      Date date = null;
      try{
        date = df.parse(dateStr);;
      }catch(Exception ex){
        System.out.println(ex);
      }
      return date;                      
    }
    
    
    
    public Universidad cargarUniversidad(String archivo)throws FileNotFoundException, IOException{
       FileReader lectura= null;
       Universidad universidad= null;
       try{
         lectura= new FileReader(archivo);
         BufferedReader bf= new BufferedReader(lectura);
         String temp= "";
         String bfRead;
         while((bfRead = bf.readLine()) != null){
           temp+=bfRead;
           if(temp.split(",")[0]=="U"){
             universidad= new Universidad(temp.split(",")[1], temp.split(",")[2]);   
           }
           if(temp.split(",")[0]=="E"){
              Date fechaDeNacimiento = stringToDate(temp.split(",")[4]);
              universidad.addEstudiante(Integer.parseInt(temp.split(",")[3]), temp.split(",")[1], temp.split(",")[2].charAt(0), fechaDeNacimiento, Integer.parseInt(temp.split(",")[5]));
           }
           if(temp.split(",")[0]=="P"){
              universidad.addPrograma(temp.split(",")[1],temp.split(",")[2]);
           }
         }
       }finally{
           if(lectura!=null){
             lectura.close();
           }
       }  
      return universidad;
    }
    

    
}
