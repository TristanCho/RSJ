package Logica;

//Modificado 00:40:31
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VariablesConfig {
   
   public String UserDDBB;
   public String PassDDBB;
   public String DDBB;
   public String LocalServer;
   public String RemoteServer;
   public String RemoteServer2;
   public String Puerto;
   

   Properties Propiedades = new Properties();
 public VariablesConfig(){
     
         //Declara objeto para las Propiedades
        
        //Declara objeto lectura de Archivo
        InputStream Archivo;
       
        try {
            Archivo = new FileInputStream("src/Archivador/ArchivoPropiedades.properties");
            //Archivo = new FileInputStream("..//Archivador/ArchivoPropiedades.properties");
            Propiedades.load(Archivo);

        } catch (IOException ex) {
            System.out.println("Revisar la ruta del Archivo de propiedades");
        }
        
         //Despliega cada una de las Propiedades
         UserDDBB = Propiedades.getProperty("UserDDBB");
         PassDDBB = Propiedades.getProperty("PassDDBB");
         DDBB = Propiedades.getProperty("DDBB");
         LocalServer = Propiedades.getProperty("LocalServer");
         RemoteServer = Propiedades.getProperty("RemoteServer");
         RemoteServer2 = Propiedades.getProperty("RemoteServer2");
         Puerto = Propiedades.getProperty("Puerto");
         /*
         System.out.println("UserDDBB==== "+UserDDBB);
         System.out.println("PassDDBB==== "+PassDDBB);
         System.out.println("DDBB==== "+DDBB);
         System.out.println("LocalServer====="+LocalServer);
         System.out.println("RemoteServer====="+RemoteServer);
         System.out.println("RemoteServer2====="+RemoteServer2);
         System.out.println("Puerto====="+Puerto);
         */
               
 }

public void setTarjetaPropiedades(String UserDDBB,String PassDDBB,String DDBB,String Puerto,String LocalServer,String RemoteServer,String RemoteServer2){
     
    this.UserDDBB=UserDDBB;
    this.PassDDBB=PassDDBB;
    this.DDBB=DDBB;
    this.LocalServer=LocalServer;
    this.RemoteServer=RemoteServer;
    this.RemoteServer2=RemoteServer2;
    this.Puerto=Puerto;
    
     try {
         
         //Despliega cada una de las Propiedades
        Propiedades.setProperty("UserDDBB", UserDDBB);
        Propiedades.setProperty("PassDDBB", PassDDBB);
        Propiedades.setProperty("DDBB", DDBB);
        Propiedades.setProperty("LocalServer", LocalServer);
        Propiedades.setProperty("RemoteServer", RemoteServer);
        Propiedades.setProperty("RemoteServer2", RemoteServer2);
        Propiedades.setProperty("Puerto", Puerto);
        
            //Graba el Archivo con las modificaciones realizadas
           
            //Propiedades.store(new FileWriter("..//Archivador/ArchivoPropiedades.properties"), "Propiedades Actualizadas Correctamente");
            Propiedades.store(new FileWriter("src/Archivador/ArchivoPropiedades.properties"), "Propiedades Actualizadas Correctamente");
            
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
   } 
 
public String dimeUser(){
     return UserDDBB;
 } 

public String dimePass(){
     return PassDDBB;
 } 
/////////////////////////////////////////////Pendiente por hacer los Setters de cada metodo Getter*********************************************
public String dimeDDBB(){
     return DDBB;
 } 
  public String dimePuerto(){
     return Puerto;
 } 
 public String dimeLocalServer(){
     return LocalServer;
 } 
 
 public String dimeRemoteServer(){
     return RemoteServer;
 } 
 
 public String dimeRemoteServer2(){
     return RemoteServer2;
 } 
 
 public void Guardar(String UserDDBB){
     this.UserDDBB=UserDDBB;
            System.out.println("Boton Guardar Presionado= "+UserDDBB);
       }
}//Fin de la Clase VariablesConfig
