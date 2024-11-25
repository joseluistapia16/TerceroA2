
package dao;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;

public class Conexion {
   private Connection conect = null;
   public Connection conectar(String base){
       try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       String ruta = "jdbc:mysql://localhost:3307/" + base;
       conect = (Connection) DriverManager.getConnection(ruta, "root", "");
       }
       catch(Exception e){
           System.out.println("Error de Conexion.");   
       }
       return conect;
   }
    public static void main(String[] args) {
        Conexion obp = new Conexion();
        System.out.println(obp.conectar("terceroa"));
    }
}
