package terceroa2;

import archivos.Archivo;
import domain.Usuario;
import java.util.List;
import javax.swing.JFrame;
import vistas.Ventana1;

public class TerceroA2 {

    public static void main(String[] args) {
        var lgn = new Ventana1();
        lgn.setVisible(true);
        
//        Archivo arch = new Archivo();
//        String ruta = "C:\\Users\\user\\Documents\\NetBeansProjects\\TerceroA2\\usuarios.csv";
//        List<Usuario> lista = arch.getAll(ruta);
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).getNombre() + " " + lista.get(i).getApellidos());
//        }
////        var usuario = "Diego Rivera";
////        Usuario obj = arch.getOne(ruta, usuario);
////        if (obj == null){
////            System.out.println("Error");
////        }  
////        else{
////            System.out.println(obj.getUsuario()+ " " + obj.getNombre()+ " "+ obj.getApellidos());
////        }
////        var ven = new Ventana1();
////        ven.setVisible(true);
////        Usuario obj = new Usuario("AndresPanchana1", "1222", "Juan", "Solis", "juankun@gmail.com");
////        var msg = arch.update(ruta, obj);
////        System.out.println(msg);
////          var msg1 = arch.delete(ruta, "AndresPanchana");
////          System.out.println(msg1);
//          var  obj = arch.getLogin(ruta, "DiegoRivera1", "1234");
//          if (obj != null) {
//              System.out.println(obj.getNombre());
//            
//        }
//          else{
//              System.out.println("Error");
//          }
    }

}
