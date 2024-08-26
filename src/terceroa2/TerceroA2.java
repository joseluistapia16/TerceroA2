
package terceroa2;

import archivos.Archivo;
import domain.Usuario;
import java.util.List;
import vistas.Ventana1;

public class TerceroA2 {


    public static void main(String[] args) {
          Archivo arch = new Archivo();
          String ruta = "C:\\Users\\user\\Documents\\NetBeansProjects\\TerceroA2\\usuarios.csv";
        List<Usuario>lista= arch.getAll(ruta);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getApellidos());   
        }
//        var ven = new Ventana1();
//        ven.setVisible(true);
    }
    
}
