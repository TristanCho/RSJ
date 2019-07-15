package Conexion;
//Modificado 00:40:31
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Logica.VariablesConfig;


public class Cls_Conexion {
    
    private VariablesConfig DatosConfig;
    
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";// Hacemos referencia al DRIVER que hemos importado para hacer la conexión
    String UserDDBB;
    String PassDDBB = "VacioPass";
    //private static final String RemoteServer = "89.129.146.6";
    //private static  String RemoteServer = "192.168.1.20";
    String LocalServer = "VacioLocalServer";
    String RemoteServer = "VacioRemoteServer";
    String RemoteServer2 = "VacioRemoteServer2";
    String PUERTO = "VacioPuerto";
    String DDBB = "VacioDDBB";
    String UrlRemota= "VacioURLREMOTA";
    private Connection CN;
  
    public Cls_Conexion() {
         System.out.println("UserDDBB==== "+UserDDBB);
         System.out.println("PassDDBB==== "+PassDDBB);
         System.out.println("DDBB==== "+DDBB);
         System.out.println("LocalServer====="+LocalServer);
         System.out.println("RemoteServer====="+RemoteServer);
         System.out.println("RemoteServer2====="+RemoteServer2);
         System.out.println("Puerto====="+PUERTO);
         
         System.out.println("//////////////////////////////////////");
        DatosConfig = new VariablesConfig();
        
        UserDDBB =DatosConfig.dimeUser();
       // DatosConfig.setUser();
       System.out.println("UserDDBB   Modificado  ???==== "+UserDDBB);
        PassDDBB = DatosConfig.dimePass();
        DDBB =DatosConfig.dimeDDBB();
        RemoteServer = DatosConfig.dimeRemoteServer();
        RemoteServer2 = DatosConfig.dimeRemoteServer2();
        LocalServer = DatosConfig.dimeLocalServer();
        PUERTO = DatosConfig.dimePuerto();
        UrlRemota=  "jdbc:mysql://"+RemoteServer+":"+PUERTO+"/"+DDBB+"?autoReconnect=true&useSSL=false";
      
         System.out.println("UserDDBB==== "+UserDDBB);
         System.out.println("PassDDBB==== "+PassDDBB);
         System.out.println("DDBB==== "+DDBB);
         System.out.println("LocalServer====="+LocalServer);
         System.out.println("RemoteServer====="+RemoteServer);
         System.out.println("RemoteServer2====="+RemoteServer2);
         System.out.println("Puerto====="+PUERTO);
      
      
       //System.out.println("Usuario dimeUser()==="+UserDDBB);
        //System.out.println("Usuario desde el formulario=="+getText.jtf_UserDDBB);
        CN = null;
    }
      
   
    //Este método nos retorna la conexión
    public Connection getConnection() throws SQLException, ClassNotFoundException, InterruptedException{
        int contador = 0;
        while(CN==null){            
            Class.forName(DRIVER);
            CN = DriverManager.getConnection(UrlRemota, UserDDBB, PassDDBB);
            System.out.println("Conectando...");
            //Thread.sleep(5000);
            contador++;
            System.out.println("Contador="+contador);
          }
        if (CN.isClosed()){
            CN = DriverManager.getConnection(UrlRemota, UserDDBB, PassDDBB);
        }
       
        /*
        catch(ClassNotFoundException | SQLException ex){
            //JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al conectar con la base de datos", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error de Conectar Con la DDBB...");
            //System.exit(0);
          }*/
          
        return CN;
    }
    
    

//Cierra conexiones abiertas a la base de datos.
    public void close(){
        try{
            System.out.println("Cerrando Conexión");
            CN.close();
            System.out.println("Conexión Cerrada");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al cerrar la conexión con la base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
